package com.codecool.dogcreator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dog {

    private Breed breed;
    @NotEmpty
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Dog{" +
                "breed=" + breed +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
