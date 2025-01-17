package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping(value = "/car")
    public String printCar(@RequestParam(value = "count", defaultValue = "5") Integer chislo, ModelMap model) {
        model.addAttribute("bigCar", carService.filter(chislo));
        return "superCars";
    }


}
