package com.example.Dogdemo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Dogdemo.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	
	List<Dog> findByName(String name);
	

}
