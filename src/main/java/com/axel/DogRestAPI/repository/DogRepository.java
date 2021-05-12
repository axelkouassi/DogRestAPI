package com.axel.DogRestAPI.repository;

import com.axel.DogRestAPI.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog, Long> {

    @Query("select dog.id, dog.breed from Dog dog")
    List<String> findAllBreeds();

    @Query("select dog.id, dog.breed from Dog dog where dog.id = :id")
    String findBreedById(Long id);


    @Query("select dog.id, dog.name from Dog dog")
    List<String> findAllNames();
}
