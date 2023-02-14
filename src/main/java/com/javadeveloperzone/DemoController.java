package com.javadeveloperzone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {

    @GetMapping("/")
    public String welcome(){
        return "Welcome";
    }

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String home(){
        System.out.println("Demo");
        return "Home-"+new Date();
    }
    
    @RequestMapping(value = "services", method = RequestMethod.GET)
    public String services(){
        return "Services";
    }
    
    @RequestMapping(value = "aboutUs")
    public String aboutUs(){
        return "About Us";
    }
    
    @RequestMapping(value = "logout")
    public String logout(){
        return "Logout";
    }
}
