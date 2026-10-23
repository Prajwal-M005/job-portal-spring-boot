package com.example.job_portal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.job_portal.entity.Job;
import com.example.job_portal.exception.JobDataNotFound;
import com.example.job_portal.repo.Jobrepo;



@Service
public class Jobservice {
	
	@Autowired
	private Jobrepo jobrepo;
	
	 // Save a job
	public Job saveJob(Job job) {
		return jobrepo.save(job);
	}
	
	//save all
	public List<Job> savaAll(List<Job> job){
		return jobrepo.saveAll(job);
	}
    
    // Get all jobs
    public List<Job> getAllJobs() {
        return jobrepo.findAll();
    }

    // Get job by ID
    public Optional<Job> getJobById(int id) {
        return jobrepo.findById(id);
    }

    // Delete job by ID
    public void deleteJob(int id) {
        jobrepo.deleteById(id);
    }
    
    public Job updateJob(int id, Job job) {
        job.setId(id);
        return jobrepo.save(job);
    }
    


public Job partialUpdate(int id, Job updatedJob) {
//	Job existingJob = jobrepo.findById(id).get();
    Job existingJob = jobrepo.findById(id)
        .orElseThrow(() -> new JobDataNotFound());

    if (updatedJob.getTitle() != null)
        existingJob.setTitle(updatedJob.getTitle());

    if (updatedJob.getDescription() != null)
        existingJob.setDescription(updatedJob.getDescription());

    if (updatedJob.getCompanyName() != null)
        existingJob.setCompanyName(updatedJob.getCompanyName());

    if (updatedJob.getLocation() != null)
        existingJob.setLocation(updatedJob.getLocation());

    if (updatedJob.getSalary() != null)
        existingJob.setSalary(updatedJob.getSalary());

    if (updatedJob.getMobileNo() != null)
        existingJob.setMobileNo(updatedJob.getMobileNo());

    return jobrepo.save(existingJob);
}

    
    public List<Job> searchByTitle(String title) {
        return jobrepo.findByTitleContainingIgnoreCase(title);
    }

    public List<Job> searchByCompany(String companyName) {
        return jobrepo.findByCompanyNameIgnoreCase(companyName);
    }

    public List<Job> searchByLocation(String location) {
        return jobrepo.findByLocationIgnoreCase(location);
    }
    public Page<Job> findAllJobs(int pageno, int size) {
        return jobrepo.findAll(
            PageRequest.of(pageno, size, Sort.by("salary"))
        );
    }

}
