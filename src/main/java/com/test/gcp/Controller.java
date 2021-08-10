package com.test.gcp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class Controller {
    @GetMapping
    public String getTest() {
        return "success.2";
    }
}
