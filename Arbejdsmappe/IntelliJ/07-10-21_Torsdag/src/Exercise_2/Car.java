package Exercise_2;

public class Car {
    private Engine engine;
    private Driver driver;
    private int numberOfDoors;
    private int numberOfWindows;
    private boolean isConvertible;
    private int wheels;
    private boolean bredeFælge;
    private int topSpeed;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
