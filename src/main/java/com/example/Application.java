package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class Application {
    @RequestMapping("/")
    public Map<String, String> hello() {
        HashMap<String, String> map = new HashMap<>();
        map.put("greeting", "Hello World!");
        return map;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
