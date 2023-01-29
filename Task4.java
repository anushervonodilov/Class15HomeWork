package com.class15HomeWork;

public class Task4 {

    String sayHello(String str) {

        switch (str) {
            case "Russia":
                return "Privet";
            case "USA":
                return "Hello";
            case "Tajikistan":
                return "Salom";
            default:
                return "Wrong language";
        }
    }

    public static void main(String[] args) {

        Task4 tk4 = new Task4();
        System.out.println(tk4.sayHello("Tajikistan"));;

    }

}
