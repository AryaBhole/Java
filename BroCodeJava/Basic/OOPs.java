public class OOPs{
    public static void main(String args[]){
        Car car1 = new Car("Orange");
        Car car2 = new Car("Black");

        Car[] cars = {car1, car2};

        for(Car car : cars) {
            car.drive();
        }
    }
}