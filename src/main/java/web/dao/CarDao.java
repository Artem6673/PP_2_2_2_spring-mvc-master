package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarDao {
    List<Car> print(List<Car> cars, Integer count);
}
