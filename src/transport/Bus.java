package transport;

import TransportTypeExeption.TransportTypeException;

import java.util.List;

public class Bus extends Transport<DriverD> {
    public Bus(String brand, String model, double engineVolume, DriverD driver, Type type, List<Mechanic> mechanicList, BodyType bodyType, LoadCapacity loadCapacity, Size size) {
        super(brand, model, engineVolume, driver, type, mechanicList);
        this.bodyType = bodyType;
        this.loadCapacity = loadCapacity;
        this.size = size;
    }

    private BodyType bodyType;
    private LoadCapacity loadCapacity;
    private Size size;

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public boolean passDiagnostics() throws TransportTypeException {
        throw  new TransportTypeException("Автобусу диагностика не требуется");


    }

    @Override
    public void startMove() {
        System.out.println("Автобус марки " + getBrand() + " начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Автобус марки " + getBrand() + " закончил движение");

    }

    @Override
    public void printType() {

        if(getLoadCapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getLoadCapacity());
        }
    }



    @Override
    public void pitStop() {
        System.out.println("Пит стоп у Автобуса");
    }

    @Override
    public void theBestCircleTime() {
        int minBound = 100;
        int maxBound = 150;

        int theBestTimeInMins = (int) (minBound + (maxBound- minBound)*Math.random());

        System.out.println("Лучшее время круга для автобуса в минутах" + theBestTimeInMins);

    }


    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;

        int maxSpeed = (int) (minBound + (maxBound- minBound)*Math.random());

        System.out.println("Максимальная скорость для автобуса" + maxSpeed);

    }

    @Override
    public Type getType() {
        return Type.BUS;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "bodyType=" + bodyType +
                ", loadCapacity=" + loadCapacity +
                ", size=" + size +
                '}';
    }
}