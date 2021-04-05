package com.utilites;

public class MajorArithmeticTheory {
    public static void main(String[] args) {
    // The major arithmetic theorem
        String str = "";
        int currentDigit = 23244;
        int d = currentDigit;
        int delimeter = 2;
        while (d >= 2) {
            if (d % delimeter != 0) {
                delimeter++;
            } else {
                str = str + delimeter + "*";
                d = d / delimeter;
            }
        }
        String str2 = str.substring(0, str.length() - 1);
        System.out.println(currentDigit + "=" + str2);
    }
}
