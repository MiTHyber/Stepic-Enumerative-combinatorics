package ru.mithyber;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        /*System.out.println(binomialCoefficient(11,5)
                .add(binomialCoefficient(10,5))
                .add(binomialCoefficient(9,5))
                .add(binomialCoefficient(8,5))
                .add(binomialCoefficient(7,5))
                .add(binomialCoefficient(6,5))
                .add(BigInteger.valueOf(1)));*/
        System.out.println(binomialCoefficient(36,7));
    }

    public static BigInteger factorial(int n){
        BigInteger bi = BigInteger.valueOf(1);
        for(int i = 1; i <=n; i++){
            bi = bi.multiply(BigInteger.valueOf(i));
        }
        return bi;
    }

    public static BigInteger binomialCoefficient(int n, int m){
        BigInteger bi = BigInteger.valueOf(1);
        bi = factorial(n).divide(factorial(m)).divide(factorial(n-m));
        return bi;
    }
}
