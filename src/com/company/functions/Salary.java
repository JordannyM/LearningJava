package com.company.functions;

public class Salary {
    public static double salaryCalculator(int hoursPerWeek, double amountPerHour, int vacationDays) {
        if(hoursPerWeek < 0) {
            return -1;
        }

        if(amountPerHour < 0) {
            return -1;
        }

        double weeklyPaycheck = hoursPerWeek+amountPerHour;
        double unpaidTime = vacationDays*amountPerHour*8;
        return weeklyPaycheck*52-unpaidTime;
    }

    public static void main(String[] args) {
        double salary = salaryCalculator(40, 15, 2);
        System.out.println("The employee gross salary per year is U$"+salary);
    }
}
