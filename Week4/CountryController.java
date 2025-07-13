package com.cognizant.spring_learn.Controller;

//import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.ApplicationContext;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cognizant.spring_learn.Country;

@RestController
public class CountryController {

	@RequestMapping("/country")
	public Country getcountryIndia() {
		ApplicationContext context= new ClassPathXmlApplicationContext("country.xml");;
		Country country=(Country) context.getBean("in");
		return country;
	}
}
