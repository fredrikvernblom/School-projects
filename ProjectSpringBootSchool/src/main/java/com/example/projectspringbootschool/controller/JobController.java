package com.example.projectspringbootschool.controller;

import com.example.projectspringbootschool.entity.Job;
import com.example.projectspringbootschool.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/showFormJob")
    public String showFormJob(@ModelAttribute("job") Job job, Model model){
        model.addAttribute("jobs", jobService.getAllJobs());
        return "job";

    }

    @GetMapping("/saveJob")
    public String saveJob(@ModelAttribute("job") Job job, Model model){
        jobService.saveJob(job);
        return "redirect:/showFormJob";
    }

}
