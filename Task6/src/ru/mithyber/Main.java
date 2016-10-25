package ru.mithyber;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solderGroupsWithCommander(n));
        scanner.close();
    }

    static BigInteger solderGroupsWithCommander(int n){
        BigInteger THREE = BigInteger.valueOf(3);
        BigInteger an2 = BigInteger.valueOf(0);
        BigInteger an1 = BigInteger.valueOf(1);
        BigInteger an = BigInteger.ONE;
        BigInteger tmp;
        for(int i = 2; i < n+1; i++){
            tmp = THREE.multiply(an1).mod(BigInteger.valueOf(1000000007));
            an = tmp.subtract(an2);
            an2 = an1;
            an1 = an;
        }
        return an.mod(BigInteger.valueOf(1000000007));
    }
}
