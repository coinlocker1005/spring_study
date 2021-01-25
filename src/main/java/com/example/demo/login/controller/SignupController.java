package com.example.demo.login.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.LinkedHashMap;
import java.util.Map;

public class SignupController {

    private Map<String,String>radioMarriage;

    private Map<String,String>initRadioMarriage(){
        Map<String,String> radio = new LinkedHashMap<>();
        radio.put("既婚","true");
        radio.put("未婚","false");
        return radio;
    }

    @GetMapping("/signup")
    public String getSignUp(Model model){

        radioMarriage = initRadioMarriage();
        model.addAttribute("radioMarriage", radioMarriage);
        return "login/signup";
    }

    @PostMapping("/signup")
    public String postSignUp(Model model){
        return "redirect:/login";
    }
}
