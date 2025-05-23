package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;
    public boolean isOn = false;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {
        this.brand = "Ferrari";
        this.model = "F80";
        this.fuel = "Gasolina";
    }

    public boolean isTachometerEqualToZero() {
        if (this.tachometer == 0){
            return true;
        } else{
            return false ;
        }
    }

    public boolean isTachometerGreaterThanZero(){
        if (this.tachometer>0){
            return true;
        } else{
            return false ;
        }
    }

    public void start() {
        if (isTachometerEqualToZero()) {
            this.tachometer = 1000;
            System.out.println("Vehículo acendido");
            isOn = true;
        } else {
            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
            isOn= false;
        } else {
            System.out.println("Non se pode apagar o vehículo, primeiro ten que estar detido");
        }
    }

    public void accelerate() {
        if (this.speedometer < MAX_SPEED) {
            this.speedometer += 20;
        } else  if (!isOn){
            System.out.println("No puedes acelerar. El coche está apagado");
        } else {
            this.speedometer = MAX_SPEED;
            System.out.println("Ya vas a máxima velocidad. No puedes acelerar más");
        }
    }

    public void brake() {
        if (this.speedometer > 0 && (Math.abs(this.speedometer - 0) >= 20)) {
            this.speedometer -= 20;
        } else {
            this.speedometer = 0;
            System.out.println("Ya estás completamnete parado. No puedes frenar más");
        }
    }

    public void turnAngleOfWheels(int angle) {

        if (((this.wheelsAngle + angle) <= 45) && ((this.wheelsAngle + angle) >= -45)) {
            this.wheelsAngle += angle;
        } else {
            this.wheelsAngle = angle > 0 ? Math.min(45, this.wheelsAngle + angle) : Math.max(-45, this.wheelsAngle + angle);
            System.out.println("No puedes girar más el volante.");
        }
    }


    public String showSteeringWheelDetail() {
        return "El angulo del volante es: " + this.wheelsAngle; // Placeholder
    }

    public boolean isReverse() {
        if (this.reverse) {
            return true; // Placeholder
        } else {
            return false;
        }
    }

    public void setReverse(boolean reverse) {
        if (!reverse) {
            this.reverse = reverse;
            System.out.println("Marcha atrás desactivada");
            this.gear="N";
        }  else if (this.speedometer == 0 && this.isTachometerGreaterThanZero())  {
            this.reverse = reverse;
            this.gear = "R";
            System.out.println("Marcha atrás puesta.");
        }else if (this.isReverse()) {
            System.out.println("La marcha atrás ya está puesta.");
        } else {
            System.out.println("No puedes ir marcha atrás burro, estás en movimiento");
        }
    }

    public void showDetails() {
        System.out.println("Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                ", speedometer=" + speedometer +
                ", tachometer=" + tachometer +
                ", gear='" + gear + '\'' +
                ", reverse=" + reverse +
                ", steeringWheelAngle=" + wheelsAngle +
                '}');
    }

}
