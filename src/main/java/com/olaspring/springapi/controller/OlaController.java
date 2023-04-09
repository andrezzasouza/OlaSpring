package com.olaspring.springapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ola")
public class OlaController {
  @GetMapping
  public String ola() {
    return "Olá Spring!";
  }
}
