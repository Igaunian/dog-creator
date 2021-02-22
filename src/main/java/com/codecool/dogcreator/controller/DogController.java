package com.codecool.dogcreator.controller;

import com.codecool.dogcreator.model.Dog;
import com.codecool.dogcreator.service.DogStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dog")
public class DogController {

    @Autowired
    private DogStorage dogStorage;

    @GetMapping("/list")
    public List<Dog> listDogs() {
        return dogStorage.getDogs();
    }

    @GetMapping("/random")
    public Dog addRandomDog() {
        return dogStorage.addRandomDog();
    }

    @PostMapping("/add")
    public Dog addDog(@RequestBody Dog dog) {
        return dogStorage.addDog(dog);
    }

    @PutMapping("/{name}")
    public Dog update(@PathVariable("name") String name, @RequestBody Dog dog) throws Exception {
        return dogStorage.update(name, dog);
    }

}
