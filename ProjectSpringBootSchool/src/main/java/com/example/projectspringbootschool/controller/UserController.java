package com.example.projectspringbootschool.controller;

import com.example.projectspringbootschool.entity.User;
import com.example.projectspringbootschool.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /************************* Hanterar formuläret ************************************/

    @GetMapping("/showFormUser")
    public String showFormUser(@ModelAttribute("user") User user, Model model){
        model.addAttribute("users", userService.getAllUsers());
        return "user";
    }

    @PostMapping("/saveUser")
    public  String saveUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/showFormUser";
    }
}
