package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 컨트럴로럴 JSON을 반환하는 컨트롤러로 만들어줌.
public class HelloController {
    @GetMapping("/test")
    // API 만들기
    public String str(){
        return "Hello World";
    }

}
