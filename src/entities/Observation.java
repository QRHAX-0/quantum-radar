package entities;

import java.time.LocalDate;

public class Observation {
    private String plateNumber;
    private CarType carType;
    private int speed;
    private LocalDate date;
    private boolean isSeatbeltFastened;


    public Observation(String plateNumber, CarType carType, int speed, LocalDate date, boolean isSeatbeltFastened) {
        this.plateNumber = plateNumber;
        this.carType = carType;
        this.speed = speed;
        this.date = date;
        this.isSeatbeltFastened = isSeatbeltFastened;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSpeed() {
        return speed;
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean isSeatbeltFastened() {
        return isSeatbeltFastened;
    }
}
