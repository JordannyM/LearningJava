package com.company.classes.challenge;

public class Main {
    public static void main(String[] args) {

        Student profileA = new Student("Sally", "Salmon", 2022, 3.75,"Film" );
        Student profileB = new Student("Max", "Tiffen", 2021, 3.45, "Computer Science");

        profileA.incrementExpectedYearToGraduate();

        profileB.incrementExpectedYearToGraduate();
    }
}
