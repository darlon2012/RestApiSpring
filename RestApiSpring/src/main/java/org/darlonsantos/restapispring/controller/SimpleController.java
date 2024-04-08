package org.darlonsantos.restapispring.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

  public static String OLA_MUNDO =  "Olá Mundo!";



  @GetMapping("/hello")
  public String hello(){
   return OLA_MUNDO;

  }


}
