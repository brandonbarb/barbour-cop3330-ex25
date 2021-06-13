/*
 *  UCF COP3330 Summer 2021 Assignment 25 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.Scanner;

public class Main {
    public static int passwordValidator(String password) {
        int digit = 0, character = 0;
        char[] s1 = password.toCharArray();
        for (int i = 0; i <= s1.length - 1; i++) {
            if (Character.isDigit(s1[i])) {
                digit++;
            }
            else if (Character.isLetter(s1[i])) {
                character++;
            }
        }
        if (digit == s1.length) {
            return 0;
        }
        else if (character == s1.length) {
            return 1;
        }
        else if (digit + character == s1.length) {
            return 2;
        }
        else {
            return 3;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.next();
        String str = "";
        int out = passwordValidator(password);
        switch(out) {
            case 0:
                str = str + "very weak";
                break;
            case 1:
                str = str + "weak";
                break;
            case 2:
                str = str + "strong";
                break;
            case 3:
                str = str + "very strong";
                break;
        }
        System.out.printf("The password '%s' is a %s password.", password, str);
    }
}
