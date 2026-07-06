package org.saga.fordocker.controller;

import org.saga.fordocker.service.myService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class myController {

    public myController(myService myService) {
        this.myService = myService;
    }

    private myService myService;

    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello");
        myService.sayHello();
        return "hello";
    }
}
