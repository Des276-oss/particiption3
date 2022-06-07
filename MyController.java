package com.example.Participation3.Controller;
import org.springframework.stereotype.Controller;
import org.springframework. web.bind.annotation.GetMapping;

@Controller

public class MyController {
    @GetMapping("/home")
    public String openHome() {
        return "home";
    }

    @GetMapping("/services")
    public String openServices() {
        return "services";
    }
}