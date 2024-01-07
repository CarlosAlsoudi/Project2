package ProjectNumber2;

public class ProjectNumber2Homework6 {
    public static void main(String[] args) {
        //Create a method to count how many vowels are present in a string “documentation”
        String s1="documentation";
        char ch;
        int c=0;
        String s=s1.toLowerCase();//just in case the word have Capital letters even that the word we have doesn't contain
        // any but still you should add for your program to cover all possibilities
        for(int i = 0 ; i < s.length() ; i++){
            ch=s.charAt(i);
            if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
                c++;
            }
        }
        System.out.println("Total number of vowels letters present in the given word is "+c);
    }
}
