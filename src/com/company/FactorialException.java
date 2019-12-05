package com.company;

public class FactorialException extends RuntimeException{

    private int number;
    public int getNumber(){return number;}

    public FactorialException(String message, int number) {
        super(message);
        this.number = number;
    }
}
