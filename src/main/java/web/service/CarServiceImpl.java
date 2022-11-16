package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    private static List<Car> carList = new ArrayList<>();

    @Override
    public List<Car> buildCarsByAmount(int amount) {
        for (int i = 0; i < amount; i++) {
            carList.add(new Car("Test", 1000 + i, 1 + i));
        }
        return carList;
    }

    @Override
    public List<Car> getCarsByAmount(List<Car> carList, int amount) {
        if (amount > carList.size() | amount < 0) {
            return carList.stream().toList();
        } else {
            return carList.stream().limit(amount).toList();
        }
    }
}
