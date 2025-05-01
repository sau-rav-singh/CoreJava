package com.saurav.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile(){
        System.out.println("Compilation has started in Laptop");
    }
}