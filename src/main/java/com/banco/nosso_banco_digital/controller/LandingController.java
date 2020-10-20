package com.banco.nosso_banco_digital.controller;

import com.banco.nosso_banco_digital.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.banco.nosso_banco_digital.model.User;

@Controller
public class LandingController {
    
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public String next(User user){
        userRepository.save(user);
        return "landing.jsp";
    }
}
