package com.mylearning.ssapi.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice(annotations=RestController.class)
public class ControllerAdvices {
	
	/*@ModelAttribute
	public void addAttributes(@RequestBody String requestString, @RequestHeader(value = "User-Agent") String userAgent) {
        System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.println("RequestString " + requestString);
        System.out.println("UserAgent " + userAgent);
    }   */
 

}
