package com.company.functions;

import java.util.Scanner;

public class CostOfMeal {
    public static double calculateCostOfMeal(double tipRate, double listedMealPrice, double taxRate) {
        double tip = tipRate*listedMealPrice;
        double tax = taxRate*listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }

    public static void main(String[] args) {
        double groupTotalMealPrice = calculateCostOfMeal(100,.2,.1);
        System.out.println("Your total meal price is "+groupTotalMealPrice);

        double individualMealPrice = groupTotalMealPrice/5;
        System.out.println("Your individual total meal price is "+individualMealPrice);

    }
}
