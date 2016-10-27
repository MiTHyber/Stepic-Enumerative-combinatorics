package ru.mithyber;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        System.out.println(g(6));
    }

    static double g(int n){
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        double result = Math.pow(2,binomialCoefficient(n,2).doubleValue());
        for(int i = 1; i< n+1; i++){
            result -= binomialCoefficient(n,i).doubleValue()*Math.pow(2,binomialCoefficient(i-1,2).doubleValue())*g(n-i);
        }
        return result;
    }

    static BigInteger factorial(int n){
        BigInteger bi = BigInteger.valueOf(1);
        for(int i = 1; i <=n; i++){
            bi = bi.multiply(BigInteger.valueOf(i));
        }
        return bi;
    }

    static BigInteger binomialCoefficient(int n, int m){
        BigInteger bi = factorial(n).divide(factorial(m)).divide(factorial(n-m));
        return bi;
    }
}
