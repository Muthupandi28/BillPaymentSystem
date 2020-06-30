package com.muthu.billPayment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muthu.billPayment.dao.UserDetailsRepo;
import com.muthu.billPayment.model.UserDetails;
import com.muthu.billPayment.model.UserLoginRequestVO;
import com.muthu.billPayment.model.UserLoginResponseVO;
import com.muthu.billPayment.utils.JasyptEncryptionUtils;

@RestController
@RequestMapping("/userDetails")
public class UserDetailsController extends AbstractController {
	@Autowired
	UserDetailsRepo repo;

	@PostMapping("/addUser.web")
	public UserDetails addUser(UserDetails userDetail) {
		return repo.save(userDetail);
	}

	@GetMapping(value = "getAllUsers.web", produces = "application/json")
	public List<UserDetails> getAllUsers() {
		final List<UserDetails> allUsers = (List<UserDetails>) repo.findAll();
		return allUsers;
	}

	@PostMapping(value = "authenticateUser.web", produces = "application/json")
	public UserLoginResponseVO authenticateUser(@RequestBody UserLoginRequestVO loginRequestVO) {
		final UserDetails user = repo.findByFirstName(loginRequestVO.getFirstName());
		final String decryptedPassword = JasyptEncryptionUtils.decrypt(user.getPassword());
		if (decryptedPassword.equals(loginRequestVO.getPassword())) {
			return new UserLoginResponseVO(user, true, "User Login successful");
		} else {
			return new UserLoginResponseVO(null, false, "Invalid User Credentials");
		}

	}

}
