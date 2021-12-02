package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private final List<Car> bigCar = new ArrayList<>();

    public Car createCar(String model, String fireRate, Integer crew) {
        return new Car(model, fireRate, crew);
    }

    {
        bigCar.add(createCar("Bane Blade", "The power of eleven barrels", 10));
        bigCar.add(createCar("Leman Russ", "Tank Jopashnika", 6));
        bigCar.add(createCar("Bay Bank", "More Dakka", 1));
        bigCar.add(createCar("Big nag", "MUCH MORE DAKKA", 1));
        bigCar.add(createCar("Emperor-class Titanium", "DADDY can", 120));

    }
    public List<Car> filter(Integer chislo) {
       return bigCar.stream().limit(chislo).collect(Collectors.toList());
    }
}
