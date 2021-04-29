package com.example.projectspringbootschool.repository;

import com.example.projectspringbootschool.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
}
