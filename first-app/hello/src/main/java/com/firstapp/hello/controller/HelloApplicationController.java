package com.firstapp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApplicationController {

  @GetMapping("/hello")
  public String hello() {
    return "Hello, World!";
  }
}
