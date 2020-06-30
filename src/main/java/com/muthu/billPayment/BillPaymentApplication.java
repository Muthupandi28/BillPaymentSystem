package com.muthu.billPayment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.muthu.billPayment.dao.RoleRepo;
import com.muthu.billPayment.model.Role;

@SpringBootApplication
public class BillPaymentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BillPaymentApplication.class, args);
	}

	@Autowired
	private RoleRepo roleRepo;

	@Override
	public void run(String... args) throws Exception {
		roleRepo.save(new Role(1, "Admin", "N"));
		roleRepo.save(new Role(2, "User", "Y"));
		roleRepo.save(new Role(3, "Vendor", "Y"));
	}
}
