package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller()
public class CarController {
    public CarServiceImpl service = new CarServiceImpl();
    ArrayList<Car> cars = new ArrayList<>();
    {
        cars.add(new Car(1,"model1",1));
        cars.add(new Car(2,"model2",2));
        cars.add(new Car(3,"model3",3));
        cars.add(new Car(4,"model4",4));
        cars.add(new Car(5,"model5",5));
    }




    @GetMapping("/cars")
    public String show(@RequestParam(value = "count", required = false,defaultValue = "5") Integer count, ModelMap model){
        model.addAttribute("cars",service.print(cars, count));
        return "cars";
    }




}
