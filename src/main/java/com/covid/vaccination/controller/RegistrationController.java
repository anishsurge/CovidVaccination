package com.covid.vaccination.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.covid.vaccination.dto.RegistrationDTO;
import com.covid.vaccination.dto.UserDTO;
import com.covid.vaccination.dto.UserSignUpDTO;
import com.covid.vaccination.entities.ApplicationUsers;
import com.covid.vaccination.entities.VaccineRegistrations;
import com.covid.vaccination.services.RegistrationService;

@RestController
@CrossOrigin
public class RegistrationController {

	@Autowired
	RegistrationService registrationService;

	@GetMapping(path = "/covidVaccination/appUsers")
	public List<UserDTO> getAppUsers() {
		return registrationService.getAppUsers();
	}

	@PostMapping(path = "/covidVaccination/userSignUp")
	public ApplicationUsers userSignUp(@RequestBody UserSignUpDTO user) {
		return registrationService.userSignUp(user);
	}

	@GetMapping(path = "/covidVaccination/registrations")
	public Iterable<VaccineRegistrations> register(/* @RequestBody RegistrationDTO registrationRequest */) {
		return registrationService.register(/* registrationRequest */);
	}

	@PostMapping(path = "/covidVaccination/register")
	public VaccineRegistrations register(@RequestBody RegistrationDTO registrationRequest) {
		return registrationService.register(registrationRequest);
	}
	
	@PostMapping(path = "/covidVaccination/login")
	public ApplicationUsers login(@RequestBody UserSignUpDTO login) {
		return registrationService.login(login);
	}
}
