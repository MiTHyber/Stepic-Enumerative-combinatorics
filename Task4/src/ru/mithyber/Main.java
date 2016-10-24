package ru.mithyber;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(catalanNumber(n));
        scanner.close();
    }

    static BigInteger catalanNumber(int n){
        BigInteger[] numbers = new BigInteger[n+1];
        for(int i = 1; i <= n; i++){
            numbers[i] = BigInteger.valueOf(0);
        }
        numbers[0] = BigInteger.valueOf(1);
        for(int i = 1; i < n+1; i++){
            for (int k = 1; k <= i; k++){
                numbers[i]=numbers[i].add(numbers[k-1].multiply(numbers[i-k]));
            }
        }
        return numbers[n].mod(BigInteger.valueOf(1000000007));
    }
}
