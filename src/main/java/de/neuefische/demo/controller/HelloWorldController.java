package de.neuefische.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {

    private String name;


    @GetMapping
    public String sayHello(){
        int i = name.length();
        return "Hallo " + name + " Länge des String " + i;
    }

    @GetMapping(path = "{name}")
    public String sayHello (@PathVariable String name){
        return "hallo " + name;
    }

    @PostMapping
    public String sayHello2(@RequestBody String newName){
        name = newName;
        return name ;
    }

}

