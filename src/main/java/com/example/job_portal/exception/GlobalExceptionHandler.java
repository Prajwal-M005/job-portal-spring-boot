package com.example.job_portal.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class GlobalExceptionHandler {

//	@ExceptionHandler(ResponseStatusException.class)
//    public String handleJobException(ResponseStatusException e) {
//        return e.getReason();
//    }
	@ExceptionHandler(ResponseStatusException.class)
	public ResponseEntity<String> handleJobException(ResponseStatusException e) {
	    return ResponseEntity
	            .status(e.getStatusCode())
	            .body(e.getReason());
	}

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String validateException(
            MethodArgumentNotValidException e) {
        return e.getFieldError().getDefaultMessage();
    }
    

@ExceptionHandler(JobDataNotFound.class)
public ResponseEntity<String> handleJobNotFound(JobDataNotFound e) {
    return ResponseEntity
            .status(HttpStatus.NOT_FOUND)
            .body(e.getMessage());
}

}
