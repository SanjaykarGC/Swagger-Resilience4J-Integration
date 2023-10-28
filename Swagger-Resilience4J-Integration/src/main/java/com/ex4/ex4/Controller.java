package com.ex4.ex4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bike")
public class Controller {
    private static List<Carbook> carb=new ArrayList<Carbook>();
    @GetMapping
    public List<Carbook> disp()
    {
        return carb;
    }
    @PostMapping
    public Carbook add(@RequestBody Carbook car)
    {
        carb.add(car);
        return car;
    }

}
