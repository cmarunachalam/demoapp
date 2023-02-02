package com.javadeveloperzone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {
    @RequestMapping(value = "hello")
    public String hello(){
        System.out.println("==Demo==");
        return "demo example January 4th - "+new Date();
    }
}
