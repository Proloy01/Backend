package com.javabackend.Backend.Config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReactController {
    @RequestMapping("/")
    public String index() {
        return "forward:/index.html";
    }
}