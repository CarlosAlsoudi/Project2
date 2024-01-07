package ProjectNumber2;

public class ProjectNumber2Homework13 {
}
class Car{
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double setCarPrice() {
        return carPrice;
    }
}
class Sedan extends Car {
    int lenght;

    public Sedan(double carPrice, String color, int lenght) {
        super(carPrice, color);
        this.lenght = lenght;
    }

    public double  setCarPrice() {
        if (lenght >20) {
            return carPrice * 0.95;
        } else {
            return carPrice * 0.9;
        }
    }
}
class Truck extends Car {
    int weight;

    public Truck(double carPrice, String color, int weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    public double setCarPrice() {

        if (weight > 2000) {
            return carPrice * 0.9;
        } else {
            return carPrice * 0.8;
        }
    }
}
class CarTester{
    public static void main(String[] args) {
        Car sedan = new Sedan(25000, "blue", 30);
        Car truck = new Truck(50000, "Silver", 2500);

        System.out.println(sedan.setCarPrice());
        System.out.println(truck.setCarPrice());
    }
}

