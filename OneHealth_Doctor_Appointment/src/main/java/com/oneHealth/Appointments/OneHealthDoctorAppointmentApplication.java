package com.oneHealth.Appointments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class OneHealthDoctorAppointmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneHealthDoctorAppointmentApplication.class, args);
	}
	
	
	@GetMapping
	public String Welcome() {
		
		return "Welcome From OneHealth Team (OneHealth-Appointment)!!!";
	}
	

}
