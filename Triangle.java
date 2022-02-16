package org.example;

public class Triangle {
    public static double function(int a, int b, int c) {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
