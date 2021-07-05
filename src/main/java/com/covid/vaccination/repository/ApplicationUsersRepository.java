package com.covid.vaccination.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.covid.vaccination.entities.ApplicationUsers;

@Repository
public interface ApplicationUsersRepository extends CrudRepository<ApplicationUsers, Long>{
	Optional<ApplicationUsers> findByUserNameAndPassword(String userName, String password);
}
