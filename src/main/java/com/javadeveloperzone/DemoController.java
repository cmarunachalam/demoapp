package com.javadeveloperzone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @GetMapping("/")
    public String welcome(){
        return "Welcome";
    }

    @GetMapping("/home")
    public String home(){
        System.out.println("home page");
        return "Home";
    }

    @GetMapping("/services")
    public String services(){
        return "Services";
    }

    @GetMapping("/aboutUs")
    public String aboutUs(){
        return "About Us";
    }

    @GetMapping("/logout")
    public String logout(){
        return "Logout";
    }
}
