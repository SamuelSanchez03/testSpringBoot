package com.dalewacho.seviene.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/api")
public class server 
{    
    @RequestMapping(value = "/welcome")
    public String helloWorld()
    {
        return "Hola Luis, ya se pudo, siuuuuuuuuuuuuu";
    }
}