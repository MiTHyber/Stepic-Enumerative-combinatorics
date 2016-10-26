package ru.mithyber;

import java.math.BigInteger;
import java.util.Scanner; // the number pk(n) of partitions of n into exactly k parts

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arg = scanner.nextLine();
        scanner.close();
        scanner = new Scanner(arg);
        int n;
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextInt()) {
            n = scanner.nextInt();
            sb
                    .append(p3(n))
                    .append(" ");
        }
        sb.delete(sb.length()-1,sb.length());
        System.out.println(sb);
        scanner.close();
    }

    static BigInteger p3(int n) {
        int m1;
        if (n % 2 == 0)
            m1 = 1;
        else
            m1 = -1;
        long cos = Math.round(Math.cos(2*Math.PI*n/3)*16);
        BigInteger bi = BigInteger.valueOf(n).multiply(BigInteger.valueOf(n)).multiply(BigInteger.valueOf(6));
        BigInteger bi2 = BigInteger.valueOf(-7-9*m1+cos);
        bi = bi.add(bi2);
        return bi.divide(BigInteger.valueOf(72));
    }
}
