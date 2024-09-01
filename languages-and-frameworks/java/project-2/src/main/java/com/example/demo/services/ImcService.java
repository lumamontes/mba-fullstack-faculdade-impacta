package com.example.demo.services;

import com.example.demo.models.Person;

public class ImcService {
    public void  calculate(Person p){
        var imc = p.getWeight() / (p.getHeight() * p.getHeight());
        var description = "Obesidade";
        if(imc < 18.5){
            description = "Magreza";
        } else if(imc < 24.9){
            description = "Normal";
        }

        p.setImc(imc);
        p.setImcDescription(description);
    }
}
