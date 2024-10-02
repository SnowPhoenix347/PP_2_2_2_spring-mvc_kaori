package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @GetMapping
    public String printCars(@RequestParam(name = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", new CarServiceImpl().getCars(count));
        return "cars";
    }
}
