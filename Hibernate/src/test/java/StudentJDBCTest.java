import com.github.javafaker.Faker;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.*;

public class StudentJDBCTest {

    private static final String JDBC_URL = "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12775463";
    private static final String USERNAME = "sql12775463";
    private static final String PASSWORD = "JVCZ8DwCSb";
    private final Faker faker = new Faker();

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }

    private Integer getMaxRollNo() {
        String sql = "SELECT MAX(roll_no) AS max_roll_no FROM student";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("max_roll_no");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @BeforeClass(enabled = false)
    public void setup() {
        String sql = "CREATE TABLE IF NOT EXISTS student (" +
                "roll_no INT PRIMARY KEY, " +
                "name VARCHAR(100), " +
                "age INT)";
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @AfterClass
    public void teardown() {
        printAllStudents();
    }

    @Test
    public void printAllStudents() {
        String sql = "SELECT * FROM student";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            System.out.println("\n--- All Students ---");
            while (rs.next()) {
                System.out.println("Roll No: " + rs.getInt("roll_no") +
                        ", Name: " + rs.getString("name") +
                        ", Age: " + rs.getInt("age"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void insertTest() {
        Integer maxRollNo = getMaxRollNo();
        int newRollNo = (maxRollNo != null ? maxRollNo + 1 : 1);
        String sql = "INSERT INTO student (roll_no, name, age) VALUES (?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, newRollNo);
            stmt.setString(2, faker.harryPotter().character());
            stmt.setInt(3, faker.number().numberBetween(3, 30));
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getSingleData() {
        Integer maxRollNo = getMaxRollNo();
        if (maxRollNo != null) {
            String sql = "SELECT * FROM student WHERE roll_no = ?";
            try (Connection conn = getConnection();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, maxRollNo);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    System.out.println("Retrieved: Roll No: " + rs.getInt("roll_no") +
                            ", Name: " + rs.getString("name") +
                            ", Age: " + rs.getInt("age"));
                } else {
                    System.out.println("No student found with roll_no " + maxRollNo);
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("No students found in the database.");
        }
    }

    @Test
    public void updateData() {
        Integer maxRollNo = getMaxRollNo();
        if (maxRollNo != null) {
            String sql = "UPDATE student SET name = ?, age = ? WHERE roll_no = ?";
            try (Connection conn = getConnection();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, faker.harryPotter().character()); // Set name
                stmt.setInt(2, faker.number().numberBetween(3, 30)); // Set age
                stmt.setInt(3, maxRollNo); // Set roll_no
                stmt.executeUpdate();
                System.out.println("Updated student with roll_no: " + maxRollNo);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("No students found in the database.");
        }
    }

    @Test
    public void deleteTest() {
        Integer maxRollNo = getMaxRollNo();
        if (maxRollNo != null) {
            String sql = "DELETE FROM student WHERE roll_no = ?";
            try (Connection conn = getConnection();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, maxRollNo);
                stmt.executeUpdate();
                System.out.println("Deleted student with roll_no: " + maxRollNo);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("No students found in the database.");
        }
    }
}