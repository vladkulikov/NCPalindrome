package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    //проверка нечетного количества цифр, палиндром
    @org.junit.jupiter.api.Test
    void isPalindromev1Test1() {
        Palindrome palindrome = new Palindrome();
        boolean actual = palindrome.isPalindromev1(121);
        assertTrue(actual);
    }
    //проверка четного количества цифр, палиндром
    @org.junit.jupiter.api.Test
    void isPalindromev1Test2() {
        Palindrome palindrome = new Palindrome();
        boolean actual = palindrome.isPalindromev1(1221);
        assertTrue(actual);
    }
    //проверка не палиндрома
    @org.junit.jupiter.api.Test
    void isPalindromev1Test3() {
        Palindrome palindrome = new Palindrome();
        boolean actual = palindrome.isPalindromev1(1212);
        assertFalse(actual);
    }
    //проверка не палиндрома
    @org.junit.jupiter.api.Test
    void isPalindromev1Test4() {
        Palindrome palindrome = new Palindrome();
        boolean actual = palindrome.isPalindromev1(-12121);
        assertTrue(actual);
    }


    @org.junit.jupiter.api.Test
    void isPalindromev2Test1() {
        Palindrome palindrome = new Palindrome();
        boolean actual = palindrome.isPalindromev2(121);
        assertTrue(actual);
    }

    @org.junit.jupiter.api.Test
    void isPalindromev2Test2() {
        Palindrome palindrome = new Palindrome();
        boolean actual = palindrome.isPalindromev2(1221);
        assertTrue(actual);
    }

    @org.junit.jupiter.api.Test
    void isPalindromev2Test3() {
        Palindrome palindrome = new Palindrome();
        boolean actual = palindrome.isPalindromev2(1212);
        assertFalse(actual);
    }

    @org.junit.jupiter.api.Test
    void isPalindromev2Test4() {
        Palindrome palindrome = new Palindrome();
        boolean actual = palindrome.isPalindromev1(-12121);
        assertTrue(actual);
    }

    @org.junit.jupiter.api.Test
    void isPalindromev3Test1() {
        Palindrome palindrome = new Palindrome();
        boolean actual = palindrome.isPalindromev2(121);
        assertTrue(actual);
    }

    @org.junit.jupiter.api.Test
    void isPalindromev3Test2() {
        Palindrome palindrome = new Palindrome();
        boolean actual = palindrome.isPalindromev2(1221);
        assertTrue(actual);
    }

    @org.junit.jupiter.api.Test
    void isPalindromev3Test3() {
        Palindrome palindrome = new Palindrome();
        boolean actual = palindrome.isPalindromev2(1212);
        assertFalse(actual);
    }

    @org.junit.jupiter.api.Test
    void isPalindromev3Test4() {
        Palindrome palindrome = new Palindrome();
        boolean actual = palindrome.isPalindromev1(-12121);
        assertTrue(actual);
    }
}