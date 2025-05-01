package com.saurav.SpringDemo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Alien {
    @Value("21")
    private int age;
    @Autowired
    @Qualifier("laptop")
    Computer computer;
    public void code(){
        computer.compile();
        System.out.println("Alien of age "+ age+" is Running his code");
    }
}
