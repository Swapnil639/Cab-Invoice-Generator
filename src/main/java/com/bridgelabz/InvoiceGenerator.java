package com.bridgelabz;

public class InvoiceGenerator {
    private static final double MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5;

    public static double calculateFare(double distance, double time) {
        double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        return Math.max(totalFare, MINIMUM_FARE);
    }
}
