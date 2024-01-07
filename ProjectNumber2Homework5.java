package ProjectNumber2;

import java.util.Arrays;

public class ProjectNumber2Homework5 {
    public static void main(String[] args) {
        /*
        Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams,
        meaning they contain the same characters in a different order.
        For example, "listen" and "silent" are anagrams.
         */
        String w1="listen";
        String w2="silent";
        char [] arr1=w1.toLowerCase().toCharArray();
        char [] arr2=w2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Giving Strings are Anagrams");
        }else{
            System.out.println("Giving Strings are not Anagrams");
        }
    }
}
