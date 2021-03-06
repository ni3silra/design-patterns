package com.design.example.taxcalculator.entity.tax;

import com.design.example.taxcalculator.entity.emp.Employee;
import com.design.example.taxcalculator.entity.emp.FullTimeEmployee;
import com.design.example.taxcalculator.entity.emp.PartTimeEmployee;

public enum TaxCalculatorFactory {
    INSTANCE;

    public static TaxCalculator getInstance(Employee employee) {
        if (employee instanceof FullTimeEmployee)
            return new FTETaxCalculator();

        if (employee instanceof PartTimeEmployee)
            return new PTETaxCalculator();

        return null;

    }


}
