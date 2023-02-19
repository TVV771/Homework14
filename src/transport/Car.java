package transport;

public class Car extends Transport<DriverB> {

    public Car(String brand, String model, double engineVolume, DriverB driver,BodyType bodyType) {
        super(brand, model, engineVolume, driver);

    }




    @Override
    public void startMove() {
        System.out.println("Автомобиль марки " + getBrand() + " начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Автомобиль марки " + getBrand() + " закончил движение");

    }

    @Override
    public void printType() {

            if(getBodyType() == null) {
                System.out.println("Данных по транспортному средству недостаточно");
            } else {
                System.out.println(getBodyType());

        }
    }

    @Override
    public void pitStop() {
        System.out.println("Пит стоп у автомобиля");
    }

    @Override
    public void theBestCircleTime() {
        int minBound = 70;
        int maxBound = 120;

        int theBestTimeInMins = (int) (minBound + (maxBound- minBound)*Math.random());

        System.out.println("Лучшее время круга для автомобиля в минутах" + theBestTimeInMins);

    }

    @Override
    public void maxSpeed() {
        int minBound = 100;
        int maxBound = 170;

        int maxSpeed = (int) (minBound + (maxBound- minBound)*Math.random());

        System.out.println("Максимальная скорость для автомобиля" + maxSpeed);

    }
}

