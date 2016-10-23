package ru.mithyber;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        System.out.println(lucasNumber(42));
    }

    static BigInteger lucasNumber(int n){
        BigInteger[] numbers = new BigInteger[n+1];
        numbers[0]=BigInteger.valueOf(2);
        numbers[1]=BigInteger.valueOf(1);
        for(int i = 2; i <=n; i++){
            numbers[i]=numbers[i-2].add(numbers[i-1]);
        }
        return numbers[n];
    }
}
