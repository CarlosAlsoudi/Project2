package ProjectNumber2;

public class ProjectNumber2Homework2 {
    public static void main(String[] args) {
        //Find out how many alpha characters are present in a string?
        String s1="adjosjdno?!j234924uoj";
        String s2=s1.replaceAll("[A-z0-9]","");
        int c=s2.length();
        System.out.println(c);
        System.out.println(s2);
    }
}
