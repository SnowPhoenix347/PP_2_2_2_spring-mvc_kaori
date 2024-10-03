package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car(1992, "Toyota", "White gold"));
        cars.add(new Car(2001, "BMW", "Blue sky"));
        cars.add(new Car(1997, "Porsche", "Roared grey"));
        cars.add(new Car(2015, "Mitsubishi", "Midori"));
        cars.add(new Car(1976, "Chevrolet", "Black space"));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
