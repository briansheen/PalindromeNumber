package com.example;

public class Main {

    public static void main(String[] args) {
        int x = 101201;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        String reverse = String.valueOf(Math.abs(x));;
        StringBuilder solution = new StringBuilder();
        for (int i = reverse.length() - 1; i >= 0; --i) {
            solution.append(reverse.charAt(i));
        }
        if(reverse.equals(solution.toString())){
            return true;
        }
        return false;
    }
}
