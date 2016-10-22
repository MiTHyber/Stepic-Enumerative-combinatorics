package ru.mithyber;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        System.out.println(surjection(7,5));
    }

    public static BigInteger factorial(int n){
        BigInteger bi = BigInteger.valueOf(1);
        for(int i = 1; i <=n; i++){
            bi = bi.multiply(BigInteger.valueOf(i));
        }
        return bi;
    }

    public static BigInteger binomialCoefficient(int n, int m){
        BigInteger bi = factorial(n).divide(factorial(m)).divide(factorial(n-m));
        return bi;
    }

    public static BigInteger surjection(int n, int k){
        BigInteger bi = BigInteger.valueOf(0);
        for(int i = 0; i <= k; i++){
            bi = bi.add(BigInteger.valueOf(-1).pow(k-i).multiply(binomialCoefficient(k,i)).multiply(BigInteger.valueOf(i).pow(n)));
        }
        return bi;
    }
}
