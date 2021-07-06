package com.company;

public class Calculator {
    public int a;
    public int b;
    public int c;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public  int getA(){
        return c;
    }
    public void setA(int c){
        this.c = c;
    }
public Calculator(){}
    public  int plus(int a, int b) {

        int sum = a+b;
        return (sum);
    }

    public static int minus(int a, int b) {
        int difference = a-b;
        return (difference);
    }

    public static int multiply(int a, int b) {
        int multi = a*b;
        return (multi);
    }

    public  double division(int a, int b) {
        if(b == 0)
        {
            System.out.println("Ошибка, деление на ноль");

        }

            double s = ((double) a) / b;
            return(s);

    }



}
