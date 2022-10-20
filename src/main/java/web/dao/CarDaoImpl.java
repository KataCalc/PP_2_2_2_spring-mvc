package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Lada", 2109, "silver"));
        cars.add(new Car("Lada", 2110, "white"));
        cars.add(new Car("Lada", 2112, "green"));
        cars.add(new Car("Lada", 2111, "black"));
        cars.add(new Car("Lada", 2113, "yellow"));
    }


    @Override
    public List<Car> getListCar(Integer count) {
        if (count == 0 || count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
