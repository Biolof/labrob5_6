package com.company;
import java.util.Scanner;
public class Task2
{
    public static void main(String args[])
    {
        int number, digit, sum = 0;
        Scanner num = new Scanner(System.in);
        System.out.print("Введіть двозначне число : ");
        number = num.nextInt();
        while(number > 0)
        {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("Sum of Digits: "+sum);
    }
}