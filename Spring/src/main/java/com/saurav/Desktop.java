package com.saurav;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@Component("compaq")
public class Desktop implements Computer {
    private String brand;

    @Autowired
    public Desktop(@Qualifier("desktopBrand") String brand) {
        this.brand = brand;
    }

    @Override
    public void compile() {
        System.out.println("Compilation has started on a " + brand + " desktop");
    }
}