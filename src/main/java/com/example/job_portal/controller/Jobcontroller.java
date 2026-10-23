package com.example.job_portal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.job_portal.entity.Job;
import com.example.job_portal.service.Jobservice;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/job")
public class Jobcontroller {

	@Autowired
	private Jobservice jobservice;
	
	@PostMapping("/save")
	public Job saveJob(@Valid @RequestBody Job job) {
		return jobservice.saveJob(job);
	}
	
	@PostMapping("/saveall")
	public List<Job> savaAll(@Valid @RequestBody List<Job> job){
		return jobservice.savaAll(job);
	}
	@GetMapping("/findall")
	public List<Job> getAllJobs() {
        return jobservice.getAllJobs();
    }
	@GetMapping("/find/{id}")
	 public Optional<Job> getJobById(@PathVariable int id) {
	        return jobservice.getJobById(id);
	    }
	@DeleteMapping("/delete/{id}")
	public String deleteJob(@PathVariable int id) {
        jobservice.deleteJob(id);
        return "Job deleted successfully";
    }
	@PutMapping("/update/{id}")
	public Job updateJob(@PathVariable int id, @RequestBody Job job) {
	    return jobservice.updateJob(id, job);
	}
	@PatchMapping("/partialupdate/{id}")
	public Job partialUpdateJob(@PathVariable int id,@RequestBody Job job) {
	    return jobservice.partialUpdate(id, job);
	}
	
	@GetMapping("/search/title")
	public List<Job> searchByTitle(@RequestParam String title) {
	    return jobservice.searchByTitle(title);
	}

	@GetMapping("/search/company")
	public List<Job> searchByCompany(@RequestParam String companyName) {
	    return jobservice.searchByCompany(companyName);
	}

	@GetMapping("/search/location")
	public List<Job> searchByLocation(@RequestParam String location) {
	    return jobservice.searchByLocation(location);
	}
	
	@GetMapping("/pagination")
	public Page<Job> findAllJobs(
	        @RequestParam int pageno,
	        @RequestParam int size) {
	    return jobservice.findAllJobs(pageno, size);
	}
}
