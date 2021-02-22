package com.codecool.dogcreator.service;

import com.codecool.dogcreator.model.Dog;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Data
@Service
public class DogStorage {

    private List<Dog> dogs = new LinkedList<>();

    @Autowired
    private DogCreator dogCreator;

    public Dog addRandomDog() {
        Dog dog = dogCreator.createRandomDog();
        this.dogs.add(dog);

        return dog;
    }

    public Dog addDog(Dog dog) {
        this.dogs.add(dog);

        return dog;
    }

    public Dog update(String name, Dog dog) throws Exception {

        Dog foundDog = this.dogs.stream()
                .filter(dog1 -> dog1.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new Exception("Dog not found: " + name));

        foundDog.setAge(dog.getAge());
        foundDog.setBreed(dog.getBreed());

        return foundDog;
    }
}