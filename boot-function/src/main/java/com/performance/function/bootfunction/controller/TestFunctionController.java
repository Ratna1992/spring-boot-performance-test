package com.performance.function.bootfunction.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import java.util.function.Function;

@Controller
public class TestFunctionController {

    @Bean
    public Function<String, Integer> greet() {

        return (msg) -> msg.length();

    }
}
