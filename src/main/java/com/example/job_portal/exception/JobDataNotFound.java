package com.example.job_portal.exception;

public class JobDataNotFound extends RuntimeException {

	public String getMessage() {
		return "company data not found";
	}
}
