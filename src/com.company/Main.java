package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countOfSpaces = 0;
        boolean terminateInput = false;

        String string = sc.nextLine();
        char[] charArray = string.toCharArray();

        for(char ch : charArray) {
            if(ch == ' ') countOfSpaces++;
            if(ch == '.') terminateInput = true;
        }

        System.out.println(countOfSpaces);
    }
}