package com.programs;

import java.util.Scanner;

public class ZigZagNumber {

    public static int Count(int n) {
        int c = 0;
        while (n != 0) {
            n = n / 10;
            c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = s.nextInt();

        int zigzag = 0;
        int c1 = Count(n1);
        int c2 = Count(n2);

        // Adjust to have the longer number first
        while (c1 > 0 || c2 > 0) {
            if (c1 > 0) {
                int digit1 = n1 / (int) Math.pow(10, c1 - 1);
                zigzag = zigzag * 10 + digit1;
                n1 = n1 % (int) Math.pow(10, c1 - 1);
                c1--;
            }

            if (c2 > 0) {
                int digit2 = n2 / (int) Math.pow(10, c2 - 1);
                zigzag = zigzag * 10 + digit2;
                n2 = n2 % (int) Math.pow(10, c2 - 1);
                c2--;
            }
        }

        System.out.println("Zigzag number: " + zigzag);
        s.close();
    }
}
