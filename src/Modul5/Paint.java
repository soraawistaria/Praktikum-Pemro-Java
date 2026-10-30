package Modul5;

import Modul5.shapes.*;

public class Paint {
    private double coverage;

    public Paint(double c){
        coverage = c;
    }

    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        return Math.ceil(s.area() / coverage);
    }
}
