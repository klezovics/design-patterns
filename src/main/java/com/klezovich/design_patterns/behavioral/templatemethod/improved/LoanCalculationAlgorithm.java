package com.klezovich.design_patterns.behavioral.templatemethod.improved;


public abstract class LoanCalculationAlgorithm {


    public int calculateLoan(){
        return (int) (getBaseAmount()*getInterest()-caclulateDiscount());
    }


    abstract int getBaseAmount();

    abstract double getInterest();

    abstract int caclulateDiscount();
}
