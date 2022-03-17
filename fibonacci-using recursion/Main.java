package com.harsini;

import java.util.*;

public class Main {

    public static int fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            // recursion call
            return (fibo(n - 1) + fibo(n - 2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        Main a = new Main();
        for (int i = 0; i < n; i++) {
            System.out.println(a.fibo(i));
        }

    }
}
// fibonacci recursion