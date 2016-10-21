package ru.mithyber;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        combinationRec("",0,k,n);
    }

    static void combinationRec(String s, int offset, int count, int n){
        if (count != 0) {
            for (int i = offset; i < n - count + 1; i++) {
                combinationRec(s + (s.equals("")?"":" ") + i, i + 1, count - 1,n);
            }
        }
        else
            System.out.println(s);
    }
}
