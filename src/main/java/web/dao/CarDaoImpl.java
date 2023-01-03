package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;

public class CarDaoImpl implements CarDao{




    @Override
    public List<Car> print(List<Car> cars, Integer count) {
        if (count == null){
            return cars;
        }

        return cars.stream().filter(car -> car.getId() <= count).toList();
    }
}
