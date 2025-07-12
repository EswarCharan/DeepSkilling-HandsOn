package com.cognizant.spring_learn;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import lombok.extern.slf4j.Slf4j;

//@Slf4j
@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringLearnApplication.class);
    public static void main(String[] args) {
    	
    	
        SpringApplication.run(SpringLearnApplication.class, args);
//      log.info("SpringLearnApplication main() started");
       displayCountry();
    }

    public static void displayCountry() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        log.debug("Country : {}", country.toString());
    }
 }


