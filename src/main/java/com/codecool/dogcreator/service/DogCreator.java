package com.codecool.dogcreator.service;

import com.codecool.dogcreator.model.Breed;
import com.codecool.dogcreator.model.Dog;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class DogCreator {
    private static List<String> names = Arrays.asList("Joco", "Misi", "Fifi");

    public Dog createRandom() {
        Dog dog = new Dog();
        Random random = new Random();

        dog.setAge(random.nextInt(15));
        Breed breed = Breed.values()[random.nextInt(Breed.values().length)];
        dog.setBreed(breed);
        String name = names.get(random.nextInt(names.size()));
        dog.setName(name);

        return dog;
    }

}
