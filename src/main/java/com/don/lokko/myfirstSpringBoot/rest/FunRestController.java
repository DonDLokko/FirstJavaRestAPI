package com.don.lokko.myfirstSpringBoot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class FunRestController {

// expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd HH:mm");

        String formatDateTime = now.format(formatter);


        return "Hallo Wereld! Mijn lokale tijd is: " + formatDateTime ;
    }

    @GetMapping("/workout")
    public String workOut() {
        return "lets go workout!";
    }

}
