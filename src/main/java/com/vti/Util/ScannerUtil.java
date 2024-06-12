package com.vti.Util;

import java.util.Scanner;

public class ScannerUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputString() {
        return scanner.nextLine()
                .trim()
                .replaceAll("\\s{2,}", " ");
    }

    public static int inputInt() {
        while (true) {
            try {
                String input = inputString();
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số nguyên.");
                System.err.println("Mời bạn nhập lại:");
            }
        }
    }

    public static String inputEmail() {
        while (true) {
            String input = inputString();
            if (input.contains("@")) {
                return input;
            } else {
                System.err.println("Yêu cầu email phải chứa kí tự @");
                System.err.println("Nhập lại:");
            }
        }
    }

    public static String inputFullName() {
        while (true) {
            String input = inputString();
            if (hasAllAlphabeticCharacters(input)) {
                return input;
            } else {
                System.err.println("Yêu cầu full name chỉ chứa kí tự alphabetic.");
                System.err.println("Nhập lại:");
            }
        }
    }

    private static boolean hasAllAlphabeticCharacters(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (Character.isWhitespace(c)) {
                continue;
            }
            if (!Character.isAlphabetic(c)) {
                return false;
            }
        }
        return true;
    }

    public static String inputPassword() {
        while (true) {
            String input = inputString();
            int length = input.length();
            if (length < 6 || length > 12) {
                System.err.println("Yêu cầu password dài 6 - 12 kí tự.");
                System.err.println("Nhập lại:");
            } else if (hasAnyUpperCaseCharacter(input)) {
                return input;
            } else {
                System.err.println("Yêu cầu password chứa ít nhất 1 kí tự viết hoa.");
                System.err.println("Nhập lại:");
            }
        }
    }

    private static boolean hasAnyUpperCaseCharacter(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
}