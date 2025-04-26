import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class HQLTest {
    private static SessionFactory sessionFactory;

    @BeforeClass
    public void setup() {
        LogManager.getLogManager().reset();
        Logger.getLogger("org.hibernate").setLevel(Level.WARNING);
        sessionFactory = new Configuration().addAnnotatedClass(Laptop.class).configure().buildSessionFactory();
        insertTest();
    }

    @AfterClass
    public void teardown() {
        getAllLaptops();
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

    private void getAllLaptops() {
        try (Session session = sessionFactory.openSession()) {
            List<Laptop> allLaptops = session.createQuery("from Laptop", Laptop.class).list();
            System.out.println("\n--- All Laptops ---");
            allLaptops.forEach(System.out::println);
        }
    }

    public void insertTest() {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Laptop laptop1 = new Laptop(1, "Dell", "XPS", 32);
            Laptop laptop2 = new Laptop(2, "Dell", "Vostro", 16);
            Laptop laptop3 = new Laptop(3, "Lenovo", "IdeaPad", 16);
            session.persist(laptop1);
            session.persist(laptop2);
            session.persist(laptop3);
            transaction.commit();
        }
    }

    @Test
    public void getById() {
        //Select * from laptop where ram=32 ->SQL
        //from Laptop where ram=32 -> HQL
        try (Session session = sessionFactory.openSession()) {
            System.out.println(session.find(Laptop.class, 3));// By Primary Key
            Query<Laptop> query = session.createQuery("from Laptop where ram_size=32 and brand in(?1)", Laptop.class);
            query.setParameter(1,"Dell");
            List<Laptop> laptops = query.getResultList();
            System.out.println(laptops);
        }
    }
}
