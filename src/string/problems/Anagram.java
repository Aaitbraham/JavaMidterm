package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String name = "ARMY";
        String name1 = "MARY";

        boolean anagrams = compare(name, name1);

        if (anagrams) {
            System.out.println("Anangrams");
        } else {
            System.out.println("not anangrams");
        }
    }

    public static boolean compare(String name, String name1) {

        char[] firstArray = name.toUpperCase().toCharArray();
        char[] secondArray = name1.toUpperCase().toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray,secondArray);

    }
}
