package com.shahbour.resource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping
    public String anyThing() {
        return "this is a secure call through the gateway into a resource server , it will only work with Finchley.RELEASE";
    }
}