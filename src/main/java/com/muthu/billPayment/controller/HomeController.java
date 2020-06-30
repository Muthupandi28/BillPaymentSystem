package com.muthu.billPayment.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController extends AbstractController {

	@GetMapping("/header")
	public ModelAndView loadHeaderPage(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("header");
	}

	@GetMapping("/")
	public ModelAndView loadHomePage(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("home");
	}
}
