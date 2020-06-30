package com.muthu.billPayment.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.muthu.billPayment.model.UserDetails;

@Repository
public interface UserDetailsRepo extends CrudRepository<UserDetails, Integer> {
	UserDetails findByFirstName(String firstName);
}
