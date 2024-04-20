package com.example.loans.domain;

public class Loan {

    private Customer customer;

    public Loan(Customer customer) {
        this.customer = customer;
    }

    public boolean isPersonalLoaAvailable() {
        if(customer.isIncomeEqualOrLowerThan(3000.0)) {
            return true;
        }

        return customer.isIncomeBetween(3000.0, 5000.0)
                && customer.isAgeLowerThan(30)
                && customer.isFromLocation("SP");
    }

    public double getPersonalLoanInterestRate() {
        if(isPersonalLoaAvailable()) {
            return 4.0;
        }
        throw new LoanNotAvailableException();
    }

}
