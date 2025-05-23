package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.start();
        car.stop();
        car.accelerate();
        car.start();
        while (car.speedometer<120){
            car.accelerate();
        }
        car.accelerate();
        car.brake();
        while (car.speedometer >0){
            car.brake();
        }
        car.brake();
        car.turnAngleOfWheels(20);
        car.turnAngleOfWheels(35);
        car.setReverse(true);
        car.setReverse(false);
        car.accelerate();
        car.setReverse(true);
    }

}