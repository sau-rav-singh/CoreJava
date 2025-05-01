package com.saurav;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
@Primary
public class Laptop implements Computer {
    private String brand;

    @Override
    public void compile() {
        System.out.println("Compilation has started on a " + brand + " laptop");
    }
}