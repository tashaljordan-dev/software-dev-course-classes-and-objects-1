package org.example;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilitiesTests {
    public static boolean shortString(String input){
        return input.length() <=3;
    }

    public static char firstLetter(String input) {
        return input.charAt(0);
    }

    public static String censorAsparagus(String input) {
        return input.replace("asparagus");
    }

    public static String bigger(String input) {
        return input.length();
    }
    @Test
    public void testShortString() {
        Assert.assertFalse(StringUtilities.shortString("apple"));
        Assert.assertTrue(StringUtilities.shortString("a"));
        Assert.assertFalse(StringUtilities.shortString("apple pie"));
    }

    @Test
    public void testFirstLetter() {
        Assert.assertEquals('a', StringUtilities.firstLetter("apple"));
        Assert.assertEquals('b', StringUtilities.firstLetter("banana"));
        Assert.assertEquals('c', StringUtilities.firstLetter("cherry"));
    }

    @Test
    public void testCensorAsparagus() {
        Assert.assertEquals("****", StringUtilities.censorAsparagus("asparagus"));
        Assert.assertEquals("apple", StringUtilities.censorAsparagus("apple"));
        Assert.assertEquals("banana", StringUtilities.censorAsparagus("banana"));

        Assert.assertEquals("**** is my favorite vegetable", StringUtilities.censorAsparagus("asparagus is my favorite vegetable"));
        Assert.assertEquals("Tomatoes are my favorite vegetable", StringUtilities.censorAsparagus("Tomatoes are my favorite vegetable"));
    }

    @Test
    public void testBigger() {
        Assert.assertEquals("apple", StringUtilities.bigger("test", "apple"));
        Assert.assertEquals("banana", StringUtilities.bigger("apple", "banana"));
        Assert.assertEquals("cherry", StringUtilities.bigger("cherry", "banana"));
        Assert.assertEquals("cherry", StringUtilities.bigger("cherry", "cherry"));
    }
}
