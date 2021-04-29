package com.example.projectspringbootschool.service;


import com.example.projectspringbootschool.entity.Job;
import com.example.projectspringbootschool.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public void saveJob(Job job){
        jobRepository.save(job);
    }

    public List<Job> getAllJobs(){
        return jobRepository.findAll();


    }

}
