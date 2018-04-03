/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.mp.spring.dynamic.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Karoons
 */
@SpringBootApplication
@Controller
public class Application {
        public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
