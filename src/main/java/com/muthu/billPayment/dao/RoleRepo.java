package com.muthu.billPayment.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.muthu.billPayment.model.Role;

@Repository
public interface RoleRepo extends CrudRepository<Role, Integer> {

	List<Role> findByUiDisplayInd(String indicator);
}
