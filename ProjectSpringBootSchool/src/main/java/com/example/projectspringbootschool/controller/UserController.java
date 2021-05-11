package com.example.projectspringbootschool.controller;

import com.example.projectspringbootschool.entity.User;
import com.example.projectspringbootschool.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private UserService userService;



    /************************* Hanterar formuläret ************************************/
    /*
    @GetMapping("/showFormUser")
    public String showFormUser(@ModelAttribute("user") User user, Model model){
        model.addAttribute("users", userService.getAllUsers());
        return "user";
    }

    @PostMapping("/saveUser")
    public  String saveUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/showFormUser";
    } */

    @GetMapping("/")
    public String welcome(){
        return "user";
    }

    @PostMapping("/saveUserParam")
    public  String saveUserParam(@RequestParam("name") String name,
                                 @RequestParam("adress") String address,
                                  Model model) {

        User user = new User();
        user.setName(name);
        userService.saveUser(user);
        model.addAttribute("msg", "Du har sparats");
        return "redirect:/";

    }
}
