package com.example.Dogdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Dogdemo.Models.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer, Integer> {

}
