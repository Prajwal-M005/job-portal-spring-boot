package com.example.job_portal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message="job title is requird")
	private String title;
	
	@NotBlank(message="job discription is requird")
	@Size(min=3,max=1000,message="job discription should be between 3-1000 characters")
    private String description;
	
	@NotBlank(message="company name is requird")
    private String companyName;
	
	@NotBlank(message="location is requird")
    private String location;
	
	@NotNull(message="salary is required ")
	@PositiveOrZero(message = "salary cnnot be negitive")
    private Double salary;
	
	@NotBlank(message = "Mobile number is required")
	@Pattern(regexp = "^[6-9][0-9]{9}$",message = "Enter a valid 10-digit Indian mobile number")
	private String mobileNo;

}
