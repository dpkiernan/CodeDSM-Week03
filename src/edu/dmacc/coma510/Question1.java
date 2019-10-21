package edu.dmacc.coma510;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        System.out.println("Welcome to Question 1 - Please Enter Three Integers");
        Scanner in = new Scanner(System.in);
        int userNum1 = in.nextInt();
        int userNum2 = in.nextInt();
        int userNum3 = in.nextInt();
        double result = Question1.avg(userNum1, userNum2, userNum3);
        DecimalFormat df = new DecimalFormat("0.0######");
        String resultFormatted = df.format(result);
        System.out.println("The average of your three integers is " + resultFormatted);
    }

    public static double avg(int num1, int num2, int num3) {
        double result = ((num1 + num2 + num3) / (double)3);
        return (result);
    }

}
