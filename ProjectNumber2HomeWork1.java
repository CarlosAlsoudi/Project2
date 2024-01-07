package ProjectNumber2;

public class ProjectNumber2HomeWork1 {
    public static void main(String[] args) {
        //Write a program to swap 2 String without a temporary variable?
        String s1="Carlos";
        String s2="Nox";
        System.out.println("Value before swapping ");
        System.out.println(s1+" "+s2);
        System.out.println();
        System.out.println("***************");
        System.out.println();
        s1=s2+s1;
        s2=s1.substring(s2.length());
        s1=s1.substring(0,3);
        System.out.println("Value after swapping ");
        System.out.println(s1+" "+s2);
        System.out.println();
        System.out.println("***************");
        System.out.println();
    }
}
