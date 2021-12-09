package com.example.i2i.Patient.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping(value="/world", method=RequestMethod.GET)
    public String helloWorld()
    {
        return "HAI THIS IS PATIENT MODULE - HELLO WORLD PAGE !!!!!";
    }
}
