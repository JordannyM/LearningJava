package com.company.classes.challenge;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Builder

public class Student {

    String firstName;
    String lastName;
    int expectedYearToGraduate;
    double gpa;
    String declaredMajor;

    public void incrementExpectedYearToGraduate() {
        expectedYearToGraduate = expectedYearToGraduate+1;
        System.out.println("New expected year to graduate for "+firstName+" is "+expectedYearToGraduate);
    }

}
