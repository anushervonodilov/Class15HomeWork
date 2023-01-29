package com.class15HomeWork;

public class Task5 {

    boolean isPrime(int num) {

        if (num < 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {

            if (num % 2 == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        Task5 tk5 = new Task5();
        System.out.println(tk5.isPrime(11));

    }

}
