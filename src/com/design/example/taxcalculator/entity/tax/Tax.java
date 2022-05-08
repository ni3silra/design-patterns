package com.design.example.taxcalculator.entity.tax;

enum Tax {
    Professional_Tax {
        public int getTax() {
            return 20;
        }
    }, Standard_Tax {
        public int getTax() {
            return 2;
        }
    }, Education_Cess {
        public int getTax() {
            return 3;
        }
    },GST{
        public int getTax() {
            return 5;
        }
    };
    public abstract int getTax();
}
