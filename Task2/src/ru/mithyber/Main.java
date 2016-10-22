package ru.mithyber;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] choices = new int[n];
        for (int i = 0; i < n; i++){
            choices[i] = i;
        }
        permutationRec("",choices,k);
    }

    static void permutationRec(String s, int[] choicesLeft, int count){
        if (count != 0) {
            for (int i = 0; i < choicesLeft.length; i++) {
                int[] newChoices = new int[choicesLeft.length-1];
                System.arraycopy(choicesLeft,0,newChoices,0,i);
                System.arraycopy(choicesLeft,i+1,newChoices,i,choicesLeft.length-i-1);
                permutationRec(s + (s.equals("")?"":" ") + choicesLeft[i], newChoices, count - 1);
            }
        }
        else
            System.out.println(s);
    }
}
