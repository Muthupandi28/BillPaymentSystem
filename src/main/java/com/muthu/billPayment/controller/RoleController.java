package com.muthu.billPayment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.muthu.billPayment.dao.RoleRepo;
import com.muthu.billPayment.model.Role;

@RestController
@RequestMapping("/roles")
public class RoleController extends AbstractController {

	@Autowired
	RoleRepo repo;

	@GetMapping(value = "getAllRoles.web", produces = "application/json")
	@ResponseBody
	@CrossOrigin
	public List<Role> getRoles() {
		final List<Role> roles = (List<Role>) repo.findAll();
		return roles;
	}

	@GetMapping(value = "getRolesForDisplay.web", produces = "application/json")
	public List<Role> getRolesForDisplay() {
		final List<Role> roles = repo.findByUiDisplayInd("Y");
		return roles;
	}

}
