package com.example.job_portal.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.job_portal.entity.Job;

public interface Jobrepo extends JpaRepository<Job, Integer> {

	  List<Job> findByTitleContainingIgnoreCase(String title);

	  List<Job> findByCompanyNameIgnoreCase(String companyName);

	  List<Job> findByLocationIgnoreCase(String location);
}
