package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Person;
import com.example.demo.services.ImcService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController // Faz com que o Spring entenda que isso é um controller ponto de entrada pra uma chamada a API
@RequestMapping("/imc") // Define o caminho para acessar o controller
public class ImcController {
    @GetMapping("/") // Define o método HTTP que será utilizado para acessar o método
    public String hello(){
        return "Hello Spring API!";
    }

    @PostMapping("/calculate")
    public Person calculate(@RequestBody Person p){
        var imc = new ImcService();
        imc.calculate(p);
        return p;
    }
}
