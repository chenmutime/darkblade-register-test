package com.darkblade.register.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping
public class DemoController {

    @GetMapping("/test")
    public String demo(){
        return "this is a test data";
    }
}
