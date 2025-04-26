import com.github.javafaker.Faker;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class StudentHibernateTest {
    private static SessionFactory sessionFactory;
    private final Faker faker = new Faker();

    @BeforeClass
    public void setup() {
        LogManager.getLogManager().reset();
        Logger.getLogger("org.hibernate").setLevel(Level.WARNING);
        sessionFactory = new Configuration().addAnnotatedClass(Student.class).configure().buildSessionFactory();
    }

    @AfterClass
    public void teardown() {
        printAllStudents();
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

    private Integer getMaxRollNo(Session session) {
        return session.createQuery("select max(roll_no) from Student", Integer.class).uniqueResult();
    }

    private void printAllStudents() {
        try (Session session = sessionFactory.openSession()) {
            List<Student> allStudents = session.createQuery("from Student", Student.class).list();
            System.out.println("\n--- All Students ---");
            allStudents.forEach(System.out::println);
        }
    }

    @Test
    public void insertTest() {
        try (Session session = sessionFactory.openSession()) {
            Integer rno = getMaxRollNo(session);
            Transaction transaction = session.beginTransaction();
            Student stu = new Student(
                    rno != null ? ++rno : faker.number().numberBetween(0, 2),
                    faker.funnyName().name(),
                    faker.number().numberBetween(3, 18)
            );
            session.persist(stu);
            transaction.commit();
        }
    }

    @Test
    public void getSingleData() {
        try (Session session = sessionFactory.openSession()) {
            Integer rno = getMaxRollNo(session);
            if (rno != null) {
                Student student = session.get(Student.class, rno);
                System.out.println(student);
            } else {
                System.out.println("No students found in the database.");
            }
        }
    }

    @Test
    public void updateData() {
        try (Session session = sessionFactory.openSession()) {
            Integer rno = getMaxRollNo(session);
            if (rno != null) {
                Transaction transaction = session.beginTransaction();
                Student stu = new Student(rno, faker.funnyName().name(), faker.number().numberBetween(3, 16));
                session.merge(stu);
                transaction.commit();

                Student updatedStudent = session.get(Student.class, rno);
                System.out.println(updatedStudent);
            } else {
                System.out.println("No students found in the database.");
            }
        }
    }

    @Test
    public void deleteTest() {
        try (Session session = sessionFactory.openSession()) {
            Integer rno = getMaxRollNo(session);
            if (rno != null) {
                Transaction transaction = session.beginTransaction();
                Student student = session.get(Student.class, rno);
                if (student != null) {
                    session.remove(student);
                    System.out.println("Deleted student with roll_no: " + rno);
                } else {
                    System.out.println("Student with roll_no " + rno + " not found.");
                }
                transaction.commit();
            } else {
                System.out.println("No students found in the database.");
            }
        }
    }
}