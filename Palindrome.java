package com.company;

public class Palindrome implements IPalindrome{
    @Override
    public boolean isPalindromev1(int x) {
        x = Math.abs(x);
        int y = x;
        int val = 0;
        while(x!=0){
            val *= 10;
            val += x % 10;
            x /= 10;
        }
        return (y == val);
    }
    @Override
    public boolean isPalindromev2(int x) {
        x = Math.abs(x);
        char [] str = String.valueOf(x).toCharArray();
        for (int i = 0; i < str.length/2; i++){
            if(str[i] != str[str.length - i - 1]){
                return false;
            }
        }
        return true;
    }
    @Override
    public boolean isPalindromev3(int x) {
        x = Math.abs(x);
        StringBuilder str = new StringBuilder(Integer.toString(x));
        return str.toString().equals(str.reverse().toString());
    }
}
