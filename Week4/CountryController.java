package com.cognizant.spring_learn.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.ApplicationContext;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.http.ResponseEntity;

import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.Service.CountryService;

@RestController
public class CountryController {
	@Autowired
	CountryService service;

	@RequestMapping("/country")
	public Country getcountryIndia() {
		ApplicationContext context= new ClassPathXmlApplicationContext("country.xml");;
		Country country=(Country) context.getBean("in");
		return country;
	}
	@GetMapping("/country/{code}")
	public Country getCountryByCode(@PathVariable String code){
		return service.getCountry(code);
	}
}
