package com.company.controlflow;

import java.util.Scanner;

public class SingleMultipleChoiceQuestion {
    public static void main(String[] args) {
        String question = "What's the number of sides in a square?";
        String choiceOne = "3";
        String choiceTwo = "4";
        String choiceThree = "5";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println(choiceOne + ", "+ choiceTwo+" or "+ choiceThree);

        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();

        if(correctAnswer.equals(userInput)) {
            System.out.println("Congratulations! Your answer is correct!");
        } else {
            System.out.println("Sorry you didnt get it right");
        }
    }
}
