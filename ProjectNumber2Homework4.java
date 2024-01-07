package ProjectNumber2;

public class ProjectNumber2Homework4 {
    public static void main(String[] args) {
        /*Check if a String is Palindrome: Determine whether a given string is a palindrome,
        which means it reads the same forwards and backward. For example, "madam" is a palindrome.
         */
        String s="Mom";
        String rev="";
        for (int i = s.length()-1; i>=0; i--) {
            rev=rev+s.charAt(i);
        }

        if(rev.toLowerCase().equals(s.toLowerCase())){
            System.out.println(s+" is Palindrome");
        }else{
            System.out.println(s+" is not Palindrome");
        }
    }
}
