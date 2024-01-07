package ProjectNumber2;

import java.util.ArrayList;

public class ProjectNumber2Homework8 {
    public static void main(String[] args) {


        /*
        You have a list of strings
        and you want to keep only those that start with “A” and you want to return them in lower case".
         */
        ArrayList<String> s = new ArrayList<>();
        s.add("Andy");
        s.add("Carlos");
        s.add("Angel");
        s.add("Eva");
        s.add("Nox");
        ArrayList <String> s1 = new ArrayList<>() ;
        //String s2 ;
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).startsWith("A")) {
                //s1=s.get(i).toString().toLowerCase();
                s1 = s;
            } else {
                s.remove(s.get(i));
                i=i-1;
            }
        }
        System.out.println(s1.toString().toLowerCase());

    }
}