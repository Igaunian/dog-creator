package com.codecool.dogcreator.service;

import com.codecool.dogcreator.model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class DogStorage {

    private List<Dog> dogs = new LinkedList<>();

    @Autowired
    private DogCreator dogCreator;

    public void addRandomDog() {
        this.dogs.add(dogCreator.createRandomDog());
    }
}
