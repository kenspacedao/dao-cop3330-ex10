package base;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Kenny Dao
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print("Enter the price of item 1: ");
        Scanner p_item1 = new Scanner(System.in);
        double price_item1 = p_item1.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        Scanner q_item1 = new Scanner(System.in);
        int qaunt_item1 = q_item1.nextInt();

        System.out.print("Enter the price of item 2: ");
        Scanner p_item2 = new Scanner(System.in);
        double price_item2 = p_item2.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        Scanner q_item2 = new Scanner(System.in);
        int qaunt_item2 = q_item2.nextInt();

        System.out.print("Enter the price of item 3: ");
        Scanner p_item3 = new Scanner(System.in);
        double price_item3 = p_item3.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        Scanner q_item3 = new Scanner(System.in);
        int qaunt_item3 = q_item3.nextInt();

        double sub_total = (price_item1 * qaunt_item1) + (price_item2 * qaunt_item2) + (price_item3 * qaunt_item3);
        double tax = (sub_total * 5.5) / 100;
        double total = sub_total + tax;
        System.out.println("Subtotal: $" + sub_total);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
}