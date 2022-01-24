package com.lld.example.taxcalculator.entity.tax;

import java.util.List;

public class PTETaxCalculator extends TaxCalculator{
    @Override
    public void addTax(List<Tax> taxes) {
        taxes.add(Tax.Professional_Tax);
        taxes.add(Tax.GST);
        taxes.add(Tax.Standard_Tax);
    }
}
