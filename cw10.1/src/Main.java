import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        Car car1 = new Car("aaa", 1999);
        Car car2 = new Car("asa", 2000);
        Car car3 = new Car("ada", 1989);
        Car car4 = new Car("sss", 1979);
        Car car5 = new Car("aoa", 2001);
        Car car6 = new Car("awa", 2002);
        Car car7 = new Car("aka", 2003);
        Car car8 = new Car("aja", 2020);
        Car car9 = new Car("aha", 2022);
        Car car10 = new Car("afa", 2023);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}