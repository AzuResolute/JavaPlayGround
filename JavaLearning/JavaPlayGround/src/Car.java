public class Car {
    // state
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public Car (int doors, int wheels) {
        this.doors = doors;
        this.wheels = wheels;
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void describe(){

    }
}
