package com.saurav.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.saurav")
public class AppConfig {
    //    @Bean(name="desktop1")
//    public Desktop desktop(){
//        return new Desktop("Dell");
//    }
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop("Lenovo");
//    }
//
//    @Bean
//    public Alien alien(Computer computer){
//        return new Alien(21,computer);
//    }
    @Bean
    @Primary
    public String laptopBrand() {
        return "lenovo";
    }

    @Bean
    @Qualifier("desktopBrand")
    public String desktopBrand() {
        return "dell";
    }
}
