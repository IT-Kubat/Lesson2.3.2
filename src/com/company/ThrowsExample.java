package com.company;

public class ThrowsExample {

    public static void main(String[] args) {

        System.out.println("Факториал = " + getFactorial(-1));

        try {
            System.out.println("Факториал = " + getFactorial(5));
        } catch (FactorialException fe) {
            fe.printStackTrace();

        }

    }

    public static int getFactorial(int num) {

        int result = 1;
        if (num < 0) {
            throw new FactorialException(
                    "Ваше число меньше, чем 0", num);
        }
        for (int i = 1; i < num; i++) {
            result *= i;

        }
        return result;
    }
}
