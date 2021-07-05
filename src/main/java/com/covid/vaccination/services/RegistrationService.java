package com.covid.vaccination.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.vaccination.dto.RegistrationDTO;
import com.covid.vaccination.dto.UserDTO;
import com.covid.vaccination.dto.UserSignUpDTO;
import com.covid.vaccination.entities.ApplicationUsers;
import com.covid.vaccination.entities.VaccineRegistrations;
import com.covid.vaccination.entities.regions.Districts;
import com.covid.vaccination.repository.ApplicationUsersRepository;
import com.covid.vaccination.repository.DistrctsRepositiry;
import com.covid.vaccination.repository.RegistrationsRepository;

@Service
public class RegistrationService {

	@Autowired
	ApplicationUsersRepository applicationUsersRepository;

	@Autowired
	RegistrationsRepository registrationsRepository;

	@Autowired
	DistrctsRepositiry distrctsRepositiry;

	public List<UserDTO> getAppUsers() {
		Iterable<ApplicationUsers> appUsersIter = applicationUsersRepository.findAll();
		List<ApplicationUsers> appUsers = new ArrayList<>();
		appUsersIter.forEach(appUser -> appUsers.add(appUser));
		return appUsers.stream().map(appUser -> new UserDTO(appUser.getUserId(), appUser.getFirstName(),
				appUser.getLastName(), appUser.getUserName(), appUser.getRole())).collect(Collectors.toList());
	}

	public ApplicationUsers userSignUp(UserSignUpDTO user) {
		return applicationUsersRepository.save(
				new ApplicationUsers(user.getFirstName(), user.getLastName(), user.getUserName(), user.getPassword()));
	}

	public Iterable<VaccineRegistrations> register() {
		return registrationsRepository.findAll();
	}

	public VaccineRegistrations register(RegistrationDTO registrationRequest) {
		Districts district = distrctsRepositiry.findById(registrationRequest.getDistrictId()).orElse(null);
		return registrationsRepository.save(new VaccineRegistrations(registrationRequest.getId(),
				registrationRequest.getFirstName(), registrationRequest.getLastName(), registrationRequest.getAge(), registrationRequest.getPhoneNo(), district));
	}

	public ApplicationUsers login(UserSignUpDTO login) {
		Optional<ApplicationUsers> appUser = applicationUsersRepository.findByUserNameAndPassword(login.getUserName(), login.getPassword());
		if(appUser.isPresent()) {
			return appUser.get();
		}else {
			return null;
		}
	}
}
