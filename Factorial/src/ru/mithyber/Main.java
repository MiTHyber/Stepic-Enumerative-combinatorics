package ru.mithyber;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        System.out.println(bellNumber(6));
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

    static BigInteger surjection(int n, int k){
        BigInteger bi = BigInteger.valueOf(0);
        for(int i = 0; i <= k; i++){
            bi = bi.add(BigInteger.valueOf(-1).pow(k-i).multiply(binomialCoefficient(k,i)).multiply(BigInteger.valueOf(i).pow(n)));
        }
        return bi;
    }

    static BigInteger permutationsWithRepetition(int n, int... a){
        BigInteger bi = factorial(n);
        for (int i = 0; i < a.length; i++){
            bi = bi.divide(factorial(a[i]));
        }
        return bi;
    }

    static BigInteger stirlingNumbers2nd(int n, int k){
        return surjection(n,k).divide(factorial(k));
    }

    static BigInteger combinationWithRepetition(int n, int m){
        return binomialCoefficient(n+m-1,m);
    }

    static BigInteger bellNumber(int n){
        BigInteger bi = BigInteger.valueOf(0);
        for(int i = 0; i <= n; i++){
            bi = bi.add(stirlingNumbers2nd(n,i));
        }
        return bi;
    }
}
