package com.cmi.tic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @GetMapping("/divide")
    public String add(@RequestParam int num1, @RequestParam int num2) {
        BasicMathOperations basicMath = new BasicMathOperations();
        int result = basicMath.divide(num1, num2);
        return "Result of addition: " + result;
    }
}
