package decorator;

public class Main {
    public static void main(String[] args) {
        ICar flyCar = new FlyCar(new Car());
        ICar waterCar = new WaterCar(flyCar);
        waterCar.move();
    }
}
