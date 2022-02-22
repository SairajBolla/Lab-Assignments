package com.abc.spring1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.trainee.entity.Trainee;

public interface TraineeRepository extends JpaRepository<Trainee,Integer> {

}
