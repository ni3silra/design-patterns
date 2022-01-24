package com.lld.example.taxcalculator.entity.tax;

import com.lld.example.taxcalculator.entity.emp.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class TaxCalculator {

     List<Tax> taxes = new ArrayList<>();

    public abstract void addTax(List<Tax> taxes);

    public int getTaxOnBaseSalary(Employee employee){
        Optional<Integer> taxOption = calculateTax(taxes);
        int tax = 0;
        if(taxOption.isPresent())
            tax = taxOption.get();
        else
            throw new RuntimeException("tax outcome is not integer");
        return tax * employee.getBaseSalary()/100;
    }


    public Optional<Integer> calculateTax(List<Tax> taxes) {
        addTax(taxes);
        return taxes.stream()
                .map(Tax::getTax)
                .reduce(Integer::sum);
    }

}
