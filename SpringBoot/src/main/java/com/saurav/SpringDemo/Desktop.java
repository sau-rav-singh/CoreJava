package com.saurav.SpringDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {
    public void compile(){
        System.out.println("Compilation has started in Desktop");
    }
}