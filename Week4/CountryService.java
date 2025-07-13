package com.cognizant.spring_learn.Service;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.Country;

import java.util.List;

//import com.cognizant.spring_learn.Country;

import org.springframework.context.ApplicationContext;

@Service
public class CountryService {

	public Country getCountry(String code) {
		ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
//		List<Country> countrylist=(List<Country>) context.getBean("countrylist");
		Country country=(Country) context.getBean(code);
		return country;
	}
}
