package com.design.example.taxcalculator;

import com.design.example.taxcalculator.entity.emp.Employee;
import com.design.example.taxcalculator.entity.emp.FullTimeEmployee;
import com.design.example.taxcalculator.entity.emp.PartTimeEmployee;
import com.design.example.taxcalculator.entity.tax.TaxCalculator;
import com.design.example.taxcalculator.entity.tax.TaxCalculatorFactory;


public class App {

    public static void main(String[] args) {
        Employee employee = new FullTimeEmployee();
        employee.setBaseSalary(10000);

        Employee employee1 = new PartTimeEmployee();
        employee1.setBaseSalary(5000);

        TaxCalculator taxCalculator =  TaxCalculatorFactory.getInstance(employee);
        TaxCalculator taxCalculator1 =  TaxCalculatorFactory.getInstance(employee1);

        System.out.println(taxCalculator.getTaxOnBaseSalary(employee));
        System.out.println(taxCalculator1.getTaxOnBaseSalary(employee1));

    }
}
