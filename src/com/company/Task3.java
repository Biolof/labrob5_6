package com.company;
import java.util.Scanner;

public class Task3
{
    public static void main(String[] args)
    {
        double number;
        int a;
        Scanner num = new Scanner(System.in);
        System.out.println("Введіть число: ");
        number = num.nextDouble();
        a = (int) (number+.5);
        System.out.println("Округлене число: "+a);


    }
}
