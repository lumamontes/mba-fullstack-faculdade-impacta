package com.example.demo.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.models.Person;

@SpringBootTest
public class ImcServicesTests {
    @Test
    void testCalculateImc(){
        //arrange
        var height = 1.77;
        var weight = 88;

        var expectedImc = 28.1;
        var expectedImcDescription = "Sobrepeso";

        //act
        var p = new Person(
            height,
            weight
        );

        var svc = new ImcService();
        svc.calculate(p);
        //assert
        assertEquals(expectedImc, p.getImc(), 1);
        assertEquals(expectedImcDescription, p.getImcDescription());
    }
    
}
