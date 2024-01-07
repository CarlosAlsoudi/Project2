package ProjectNumber2;

public class ProjectNumber2Homework12 {
    /*
    We have to calculate the average of marks obtained in three subjects by student A and by student B.
Create class 'Marks' with an abstract method 'getPercentage' that will return the average percentage of marks.
Provide implementation of abstract methods in classes 'A' and 'B'. The constructor of
student A takes the marks in three subjects as its parameters and
the marks in four subjects as its parameters for student B. Test your code

     */
}
abstract class Marks{
    abstract double getPercentage();
}
class A extends Marks {
    public A(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    private  double mark1;
    private double mark2;
    private double mark3;
    private static double average;






    @Override
    double getPercentage() {
        return average=((mark1+mark2+mark3)/3);
    }
}class B extends Marks {
    double mark1;
    double mark2;
    double mark3;
    static double average;
    double mark4;

    public B(double mark1, double mark2, double mark3, double mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    @Override
    double getPercentage() {
        return average=((mark1+mark2+mark3+mark4)/4);
    }
}
class MarkTester {
    public static void main(String[] args) {
        Marks a = new A(95, 85, 65);
        Marks b = new B(85, 65, 95, 99);
        System.out.println(a.getPercentage());
        System.out.println(b.getPercentage());
    }
}