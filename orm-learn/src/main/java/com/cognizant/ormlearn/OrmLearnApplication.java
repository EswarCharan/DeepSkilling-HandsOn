package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import org.springframework.context.ApplicationContext;

//import com.sun.org.slf4j.internal.LoggerFactory;

//import ch.qos.logback.classic.Logger;

//import com.sun.org.slf4j.internal.Logger;

@SpringBootApplication
public class OrmLearnApplication {


    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;
	public static void main(String[] args) {
		  ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
	        LOGGER.info("Inside main");

	        countryService = context.getBean(CountryService.class);
	        testgetAllCountries();
	}

	private static void testgetAllCountries() {
		 LOGGER.info("Start");
	        List<Country> countries = countryService.getAllCountries();
	        LOGGER.debug("countries={}", countries);
	        LOGGER.info("End");
	}
}
