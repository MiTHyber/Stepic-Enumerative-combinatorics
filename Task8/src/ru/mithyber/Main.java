package ru.mithyber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            int pn = scanner.nextInt();
            int pn1 = scanner.nextInt();
            int pn2 = scanner.nextInt();
            int pn3 = scanner.nextInt();
            System.out.println(pn-pn1-pn2+pn3);
        }
        scanner.close();
    }
}
