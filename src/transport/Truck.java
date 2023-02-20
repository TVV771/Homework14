package transport;

public class Truck extends Transport<DriverC> {
    public Truck(String brand, String model, double engineVolume, DriverC driver, Size size) {
        super(brand, model, engineVolume, driver);
    }
    private BodyType bodyType;
    private LoadCapacity loadCapacity;

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

    @Override
    protected boolean diagnostics() throws Exception {
        return false;
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик марки " + getBrand() + " начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Грузовик марки " + getBrand() + " закончил движение");

    }

    @Override
    public void printType() {

    }


    @Override
    public void pitStop() {
        System.out.println("Пит стоп у грузовика");
    }

    @Override
    public void theBestCircleTime() {
        int minBound = 90;
        int maxBound = 110;

        int theBestTimeInMins = (int) (minBound + (maxBound- minBound)*Math.random());

        System.out.println("Лучшее время круга для грузовика в минутах" + theBestTimeInMins);

    }

    @Override
    public void maxSpeed() {
        int minBound = 90;
        int maxBound = 130;

        int maxSpeed = (int) (minBound + (maxBound- minBound)*Math.random());

        System.out.println("Максимальная скорость для грузовика" + maxSpeed);

    }

    @Override
    public String toString() {
        return "Truck{" +
                "bodyType=" + bodyType +
                ", loadCapacity=" + loadCapacity +
                '}';
    }
}