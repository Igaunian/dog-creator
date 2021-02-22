package com.codecool.dogcreator;

import com.codecool.dogcreator.service.DogCreator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class DogCreatorApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(DogCreatorApplication.class);

    @Autowired
    private DogCreator creator1;
    @Autowired
    private DogCreator helloCreator;
    @Autowired
    private DogCreator dogCreator;

    public static void main(String[] args) {
        SpringApplication.run(DogCreatorApplication.class, args);
    }

    @PostConstruct
    public void afterInit() {
        LOGGER.info(dogCreator.createRandomDog().toString());
        LOGGER.info(dogCreator.toString());
        LOGGER.info(creator1.toString());
        LOGGER.info(helloCreator.toString());
    }
}
