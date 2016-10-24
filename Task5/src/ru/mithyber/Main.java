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

    static BigInteger catalanNumber(int n) {
        BigInteger numbers = BigInteger.valueOf(1);
        for (int i = 1; i < n + 1; i++) {
            BigInteger m1 = BigInteger.valueOf(2 * i - 1).mod(BigInteger.valueOf(1000000007));
            BigInteger m2 = BigInteger.valueOf(2 * i).mod(BigInteger.valueOf(1000000007));
            BigInteger d1 = pow(i,1000000005).mod(BigInteger.valueOf(1000000007));
            BigInteger d2 = pow(i+1,1000000005).mod(BigInteger.valueOf(1000000007));
            numbers = numbers.multiply(m1).mod(BigInteger.valueOf(1000000007));
            numbers = numbers.multiply(m2).mod(BigInteger.valueOf(1000000007));
            numbers = numbers.multiply(d1).mod(BigInteger.valueOf(1000000007));
            numbers = numbers.multiply(d2).mod(BigInteger.valueOf(1000000007));
        }
        return numbers.mod(BigInteger.valueOf(1000000007));
    }

    static BigInteger pow(int a, int n) {
        if (n == 0) return BigInteger.valueOf(1);
        if (n % 2 == 0) {
            BigInteger ans = pow(a, n / 2).mod(BigInteger.valueOf(1000000007));
            return ans.multiply(ans).mod(BigInteger.valueOf(1000000007));
        } else {
            return BigInteger.valueOf(a).multiply(pow(a, n - 1)).mod(BigInteger.valueOf(1000000007));
        }
    }
}
