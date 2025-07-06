package com.cognizant.OrmLearn.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.OrmLearn.model.Country;
import com.cognizant.OrmLearn.repository.CountryRepository;
//import com.sun.tools.javac.util.List;

import jakarta.transaction.Transactional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

}
