package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WelcomeController {




    @GetMapping("/welcome")
    public String welcome() {
        return "Hello there";
    }

    @GetMapping("/vehciles")
    public List<Vehicle> getVehicles() {
        return List.of(
                new Vehicle("vehicle1",1,TYPE.BIG),
                new Vehicle("vehicle2",2,TYPE.COUPE),
                new Vehicle("vehicle3",3,TYPE.SMALL)
        );
    }

    @GetMapping("/vehicle")
    public Vehicle getVehicle() {
        return new Vehicle("vehicle1", 1, TYPE.BIG);
    }

}
