package ProjectNumber2;

public class ProjectNumber2Homework9 {
    public static void main(String[] args) {
        /*
        Find the First Non-Repeating Character in a String: Given a string,
        find and return the first non-repeating character.
        For example, in the string "abracadabra", the first non-repeating character is 'c'.
         */

        String word="abracadabra";

        for (int i = 0; i < word.length(); i++) {
            boolean nonRepeating=true;
            for (int j = 0; j <word.length() ; j++) {
                if(i != j&& word.charAt(i)==word.charAt(j)){
                    nonRepeating=false;
                    break;
                }
            }if(nonRepeating){
                System.out.println("the first non repeating character is "+word.charAt(i));
                break;
            }

        }






    }
}
