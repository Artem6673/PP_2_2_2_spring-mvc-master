package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{

    CarDao carDao = new CarDaoImpl();

    ArrayList<Car> cars = new ArrayList<>();
    {
        cars.add(new Car(1,"model1",1));
        cars.add(new Car(2,"model2",2));
        cars.add(new Car(3,"model3",3));
        cars.add(new Car(4,"model4",4));
        cars.add(new Car(5,"model5",5));
    }
    @Override
    public List<Car> print(int count) {

        return carDao.print(cars, count);
    }


}
