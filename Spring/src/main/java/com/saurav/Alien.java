package com.saurav;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class Alien {
    @Value("21")
    private int age;
    @Autowired
    @Qualifier("compaq")
    private Computer com;

    public void code() {
        com.compile();
        System.out.println("Alien of age " + age + " is compiling it's code");
    }
}
