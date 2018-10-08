package com.company;

public class Main {

    public static void main(String[] args) {
        int n;
        int status = 1;
        int num = 1;
        System.out.println("prime numbers are:");
        System.out.println();
        for (int i = 1; i <= 10;) {
            for (int j = 2; j <= num / 2; j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(num + " is a prime number.");
                i++;
            }
            else
                System.out.println(num+ " is not a prime number.");
            status = 1;
            num++;
        }
    }
}
