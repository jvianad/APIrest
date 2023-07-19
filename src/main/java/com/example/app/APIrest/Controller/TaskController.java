package com.example.app.APIrest.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    @GetMapping(value = "/")
    public String holamundo(){
        return "Hola Mundo!!!";
    }
    
}
