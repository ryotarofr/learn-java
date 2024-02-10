package com.firstapp.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApplicationController {

  @GetMapping("/hello")
  public String hello() {
    return "Hello, World!";
  }
}
