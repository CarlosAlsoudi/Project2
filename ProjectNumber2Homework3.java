package ProjectNumber2;

public class ProjectNumber2Homework3 {
    public static void main(String[] args) {
        //Reverse a String: Write a function to reverse a given string.
        // For example, given the input "Hello", the output should be "olleH".
        String s="Hello";

        for (int i =s.length()-1;i>=0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
