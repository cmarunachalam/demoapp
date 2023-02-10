package com.javadeveloperzone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {
    @RequestMapping(value = "home")
    public String home(){
        System.out.println("Demo Application");
        return "Home-"+new Date();
    }
    
    
    @RequestMapping(value = "services")
    public String services(){
        System.out.println("Services...");
        return "Services";
    }
    
    @RequestMapping(value = "aboutUs")
    public String aboutUs(){
        System.out.println("About us");
        return "About Us";
    }
}
