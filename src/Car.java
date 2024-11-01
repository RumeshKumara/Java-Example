public class Car {
    String name;
    int year;

    public void run(){
        System.out.println("Car is running");
    }

}

class Van extends Car {
    public void run1(){
        System.out.println("Van is running");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.run();

        Van van = new Van();
        van.run();
        van.run1();

    }
}
