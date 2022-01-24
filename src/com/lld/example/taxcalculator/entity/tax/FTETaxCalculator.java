package com.lld.example.taxcalculator.entity.tax;

import java.util.List;

public class FTETaxCalculator extends TaxCalculator{

    public  void addTax(List<Tax> taxes){
        taxes.add(Tax.Professional_Tax);
        taxes.add(Tax.Education_Cess);
        taxes.add(Tax.Standard_Tax);
        taxes.add(Tax.GST);
    }

}
