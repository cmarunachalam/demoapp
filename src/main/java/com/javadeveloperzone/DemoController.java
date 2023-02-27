package com.javadeveloperzone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @GetMapping("/")
    public String welcome(){
        System.out.println("test");
        return "Welcome";
    }

    @GetMapping("/home")
    public String home(){
        return "Home";
    }

    @GetMapping("/services")
    public String services(){
        System.out.println("verify");
        return "Our Services";
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
