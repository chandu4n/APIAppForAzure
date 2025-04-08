package com.guruji.teaching.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chandrase.narayanar on 4/8/2025 3:06 PM.
 */
@RestController
public class ApiAppController {

    @GetMapping("/api-app/welcome")
    public String welcome() {
        return "Welcome to Azure API App";
    }

}
