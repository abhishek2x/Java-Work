public class bike extends Vehicle {
    private boolean fourStroke = false;

    public bike(String name, String color, String model, String company, String engine, boolean fourStroke) {
        super(name, color, model, company, engine);
        this.fourStroke = fourStroke;
    }

    public void setFourStroke(boolean fourStroke) {
        this.fourStroke = fourStroke;
    }

    public boolean getFourStroke(boolean fourStroke) {
        return this.fourStroke;
    }

    // to illustrate polymorphism and method overriding
    public String getInfo() {
        return "this is a bike";
    }
}