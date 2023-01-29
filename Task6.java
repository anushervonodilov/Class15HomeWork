package com.class15HomeWork;

public class Task6 {

    char getGrade(int num) {

        if (num >= 90) {
            return 'A';
        } else if (num >= 80 || num < 90) {
            return 'B';
        } else if (num >= 70 || num < 80) {
            return 'C';
        } else if (num >= 50 || num < 70) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {

        Task6 tk6 = new Task6();
        System.out.println(tk6.getGrade(97));

    }

}
