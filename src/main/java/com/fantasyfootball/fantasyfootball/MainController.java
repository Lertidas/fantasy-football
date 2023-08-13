package com.fantasyfootball.fantasyfootball;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MainController {

    @GetMapping("/fetchData")
    public Map<String, String> sendData() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Spring Boot API test observable text");
        return response;
    }
}
