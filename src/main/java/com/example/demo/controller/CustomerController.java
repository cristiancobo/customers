package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class CustomerController {

    @GetMapping("/")
    public ResponseEntity<String> findAll(){
        String customer = "sebastian";
        return new ResponseEntity<String>(customer, HttpStatus.OK);
    }
}
