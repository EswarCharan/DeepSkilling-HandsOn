package com.cognizant.OrmLearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.OrmLearn.model.Country;
@Repository
public interface  CountryRepository extends JpaRepository<Country,String>{

}
