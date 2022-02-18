package com.company.controlflow;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        System.out.println("Let's calculate the area of the trinagle (in inches)!");

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input the base of the triangle (in inches)");
        int base = sc.nextInt();

        while (base <= 0 ) {
            System.out.println("That's invalid. Please input the base of the triangle (in inches)");
            base = sc.nextInt();
        }

        System.out.println("Plase input the height of the triangle (in inches)");
        int height = sc.nextInt();

        while (height <= 0) {
            System.out.println("That's invalid. Please input the height of the triangle (in inches)");
            height = sc.nextInt();
        }

        int area = (base*height)/2;

        System.out.println("The area of the triangle is "+area);
    }
}
