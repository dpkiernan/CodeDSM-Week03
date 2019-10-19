package edu.dmacc.coma510;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        System.out.println("Welcome to Question 2 - Please Enter Three Doubles");
        Scanner in = new Scanner(System.in);
        double userNum1 = in.nextDouble();
        double userNum2 = in.nextDouble();
        double userNum3 = in.nextDouble();
        double result = Question2.min(userNum1, userNum2, userNum3);
        System.out.println(String.format("The smallest of your three doubles is %f", result));
    }

    public static double min(double num1, double num2, double num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

}
