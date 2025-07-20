package com.cognizant.loanser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loanser.model.Loan;

@RestController
@RequestMapping("/loans")
public class LoanController {

	@GetMapping("/{number}")
    public Loan getLoanDetails(@PathVariable String number) {
        // Simulate a real response
        return new Loan("101", "car", 400000, 3258, 18);
    }
}
