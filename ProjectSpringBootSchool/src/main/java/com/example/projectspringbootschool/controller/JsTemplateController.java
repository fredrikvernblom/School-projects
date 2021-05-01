package com.example.projectspringbootschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JsTemplateController {

    @GetMapping("/showPage")
    public String ShowPage(){
        return "jsTemplate";
    }
}
