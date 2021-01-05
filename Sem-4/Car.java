public class Car extends Vehicle {
    // default value
    private boolean powerSteering = false;
    private boolean ledScreen = true;

    public Car(String name, String color, String model, String company, String engine, boolean powerSteering, boolean ledScreen) {
        super(name, color, model, company, engine);
        this.powerSteering = powerSteering;
        this.ledScreen = ledScreen;
    }

    public String getColor() {
        return "The color of your car is " + super.getColor();
    }

    public void setPowerSteering(boolean powerSteering) {
        this.powerSteering = powerSteering;
    }

    public void setLedScreen(boolean ledScreen) {
        this.ledScreen = ledScreen;
    }

    public boolean getPowerSteering() {
        return this.powerSteering;
    }

    public boolean getLedScreen() {
        return this.ledScreen;
    }

    // to illustrate polymorphism and method overriding
    public String getInfo() {
        return "this is a car";
    }
}