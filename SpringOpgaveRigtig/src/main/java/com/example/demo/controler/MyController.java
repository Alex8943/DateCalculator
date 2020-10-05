package com.example.demo.controler;

import com.example.demo.services.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class MyController {

    @GetMapping("/dateCal") // http://localhost:8080/dateCal?dato=2020-01-15
    @ResponseBody
    public String echo(@RequestParam String dato) {
        Calculator calculator = new Calculator();
        return calculator.dateCal(dato);
    }

}
