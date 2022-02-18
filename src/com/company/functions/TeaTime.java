package com.company.functions;

import java.util.Scanner;

public class TeaTime {
    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type a random word and press Enter to start developer Tea Time!");

        Scanner sc = new Scanner(System.in);
        sc.next();

        System.out.println("It's developer tea time!");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to your new job!");

        announceDeveloperTeaTime();

        System.out.println("Write some code!");
    }
}
