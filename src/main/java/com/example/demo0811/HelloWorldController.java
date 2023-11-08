package com.example.demo0811;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        String output = "Hello, World!";
        System.out.println("Input: None");
        System.out.println("Output: " + output);
        return output;
    }

    @GetMapping("/reverse")
    public String reverse(@RequestParam String text) {
        System.out.println("Input: " + text);
        StringBuilder reversed = new StringBuilder(text);
        String output = reversed.reverse().toString();
        System.out.println("Output: " + output);
        return output;
    }
    
    @GetMapping("/removeVowels")
    public String removeVowels(@RequestParam String text) {
        System.out.println("Input: " + text);
        String output = text.replaceAll("[AEIOUaeiou]", "");
        System.out.println("Output: " + output);
        return output;
    }

    @GetMapping("/palindrome")
    public String palindrome(@RequestParam String text) {
        System.out.println("Input: " + text);
        String output = new StringBuilder(text).reverse().toString();
        System.out.println("Output: " + output);
        return output;
    }
    
}