package com.class15HomeWork;

public class Task3 {

    boolean isPalindrome(String str) {
        String reverse = "";
        boolean answer = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse)) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {

        Task3 task3 = new Task3();
        boolean answer = task3.isPalindrome("radar");
        System.out.println(answer);

    }

}
