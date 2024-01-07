package ProjectNumber2;

public class ProjectNumber2Homework7 {
    public static void main(String[] args) {
        /*
        Count the Number of Words in a String: Write a function to count the number of words in a given string.
        Words are separated by spaces or punctuation. For example, the input "Hello, world!" should return 2.
         */
        String s="Hello World";

        String [] arr=s.split(" ",s.length());// you can use the split method to separate the words inside the String
        //and add them to an array then get the length of that array which equals the number off words inside the given String
        System.out.println(arr.length);
        //or we can assign the value off arr.length to an int and print the value
        int c=arr.length;
        System.out.println(c);

        String s1="Hello B18 in the new Java class";
        String [] arr1=s1.split(" ",s1.length());
        System.out.println(arr1.length);
        int c1=arr1.length;
        System.out.println(c1);
    }
}
