package com.example.demo.usecase;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Car;

@Service
public class RunCarUseCase implements UseCase{
    @Override
    public void execute(){
        Car car = new Car();
        car.run();
    }
}
