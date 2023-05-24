package com.junitbasic.junitSpringBootApplication;

public class Calculator {
    //sum
    public int doSum(int a, int b, int c) {
        return a + b + c;
    }

    //product
    public int doSProduct(int a, int b) {
        return a * b;
    }

    public Boolean compareTwoNums(int a, int b) {
        return a == b;
    }
}
