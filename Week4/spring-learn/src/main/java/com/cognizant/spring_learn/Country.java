package com.cognizant.spring_learn;

//import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//private static final Logger log = LoggerFactory.getLogger(Country.class);

public class Country {

	private String code;
	private String name;
	private static final Logger log = LoggerFactory.getLogger(Country.class);
	public Country() {
		log.debug("Inside country");
	}
	public String getCode() {
        log.debug("Inside getCode()");
        return code;
    }

    public void setCode(String code) {
        log.debug("Inside setCode(): {}", code);
        this.code = code;
    }

    public String getName() {
        log.debug("Inside getName()");
        return name;
    }

    public void setName(String name) {
        log.debug("Inside setName(): {}", name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
	
}
