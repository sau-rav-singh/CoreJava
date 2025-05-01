package com.saurav;

import com.saurav.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
//        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//        Alien alien= context.getBean("alien", Alien.class);
//        alien.code();
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Desktop desktop=context.getBean("desktop1",Desktop.class);
//        desktop.compile();
        Alien alien = context.getBean("alien", Alien.class);
        alien.code();
    }
}
