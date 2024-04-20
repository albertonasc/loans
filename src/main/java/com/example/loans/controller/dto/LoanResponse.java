package com.example.loans.controller.dto;

import com.example.loans.domain.LoanType;

public record LoanResponse(LoanType type, Double interestRate) {
}
