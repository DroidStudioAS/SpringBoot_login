package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationControler {


    @GetMapping("/calculate")
    public double calculate(
            @RequestParam double num1,
            @RequestParam double num2,
            @RequestParam int key
    ){
        double result = 0;
        switch (key){
            case 1 :
                result = num1+num2;
                break;
            case 2:
                result = num1-num2;
                break;
            case 3:
                if(num2==0){
                    result=0;
                    break;
                }
                result=num1*num2;
                break;
            case 4:
                result=num1/num2;
                if(num2==0){
                    result=0;
                    break;
                }
                break;
        }
        return  result;

    }

}
