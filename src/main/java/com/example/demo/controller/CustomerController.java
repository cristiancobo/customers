package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/amor-de-mi-vida")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class CustomerController {

    @GetMapping("/")
    public ResponseEntity<String> findAll(){
        String customer = "eres mi sol que ilumina mi vida.";
        return new ResponseEntity<String>(customer, HttpStatus.OK);
    }
}
