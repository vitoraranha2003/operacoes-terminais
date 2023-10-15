package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ReduceController {

    @GetMapping("/reduce")
    public int reduceExample() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int soma = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        return soma;
    }
}

