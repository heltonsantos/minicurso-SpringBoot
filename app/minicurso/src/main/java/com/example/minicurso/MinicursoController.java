package com.example.minicurso;

import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class MinicursoController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}