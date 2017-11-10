package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    ArrayParty arrayParty = new ArrayParty();

    @Test
    public void printArrayTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        //ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest(){
        //: Given
        String[] food = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        String expected ="Mushrooms";
        //: When
        String actual = arrayParty.lastElement(food);
        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastButOneTest(){
        String[] food = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        String expected ="Tomatoes";;
        String actual = arrayParty.lastButOne(food);
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void reverseTest(){
        String[] food = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "Mushrooms" + "Tomatoes" + "Bacon" + "Beans" + "Eggs" + "Sausage";
        String actual = arrayParty.reverse(food);
        Assert.assertEquals("The two string outputs are equal", expected, actual);

    }

    @Test
    public void isPalindromeTest(){
        String[] palindromic = {"Sausage", "Eggs", "Beans", "Beans", "Eggs", "Sausage"};
        String[] food = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        boolean expected = true;
        boolean expected2 = false;
        boolean actual = arrayParty.isPalindrome(palindromic);
        boolean actual2 = arrayParty.isPalindrome(food);
        Assert.assertEquals("This is palindromic",expected,actual);
        Assert.assertEquals("This is not palindromic",expected2,actual2);
    }

    @Test
    public void compressTest(){
        int [] numbers = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
        String expected = ("1" + "3" + "2" + "1" + "4");
        String actual = arrayParty.compress(numbers);
        Assert.assertEquals("Numbers are compressed", expected,actual);
    }

    @Test
    public void packTest(){
        char [] letters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'};
        String expected = ("aaaa, b, cc, aa, d, eeee");
        String actual = arrayParty.pack(letters);
        Assert.assertEquals("Characters are packed", expected,actual);

    }

    //TODO Define the method packTest


}
