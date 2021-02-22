package com.codecool.dogcreator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dog {

    private Breed breed;
    private String name;
    private Integer age;
}
