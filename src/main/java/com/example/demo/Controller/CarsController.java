package com.example.demo.Controller;
import com.example.demo.models.Cars;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Transport/Cars")
public class CarsController {
    @GetMapping
    public List<Cars> showCars(){
    return List.of(
        Cars.builder().id(1).mark("Mercedes").model("Benz").build(),
        Cars.builder().id(2).mark("Mustand").model("AMV").cost(7000).build()
        );

    }
}
