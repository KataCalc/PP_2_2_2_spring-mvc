package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;


import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") Integer count, Model model) {
        List<Car> list = new ArrayList<>();
        list = carService.getServiceListCar(list, count);
        model.addAttribute("cars1", list);
        return "cars";

    }
}

