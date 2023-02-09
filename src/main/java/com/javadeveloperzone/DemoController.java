package com.javadeveloperzone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {
    @RequestMapping(value = "home")
    public String hello(){
        System.out.println("Demo Application");
        return "Home page - "+new Date();
    }
    
    
    @RequestMapping(value = "hello")
    public String hello(){
        System.out.println("Test 123");
        return "demo example - "+new Date();
    }
}
