package com.example

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import java.util.HashMap

@Controller
class HelloWorldController {
    @RequestMapping("/")
    fun hello(): Map<String, String> {
        return mapOf("greeting" to "Hello World!")
    }
}