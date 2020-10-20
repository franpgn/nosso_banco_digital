package com.banco.nosso_banco_digital.controller;

import com.banco.nosso_banco_digital.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.banco.nosso_banco_digital.model.User;

@Controller
public class SignUpController {
    
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/signupfirst")
    public String signupfirst(){
        return "signupfirst.jsp";
    }

    @RequestMapping("/signupsecond")
    public String next(User user){

        if (user.validateCpf(user.getCpf())==true & user.validateEmail(user.getEmail())){
            userRepository.save(user);
        }
        return "signupfirst.jsp";
    }
}
