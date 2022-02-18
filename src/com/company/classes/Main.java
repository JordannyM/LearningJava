package com.company.classes;

public class Main {
    public static void main(String[] args) {

        Triangle triangleA = new Triangle(15, 8, 15, 8, 17 );
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        double triangleAArea = triangleA.findArea();
        System.out.println("Triangle A area is equal to "+triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println("Triangle B area is equal to "+triangleBArea);

        System.out.println("The number os sides is a triangle is "+Triangle.numOfSides);

    }
}
