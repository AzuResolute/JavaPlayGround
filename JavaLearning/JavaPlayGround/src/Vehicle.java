public class Vehicle {
    private String name;
    private String size;
    private int speed;
    private int direction;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.speed = 0;
        this.direction = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDirection() {
        return direction;
    }

    public void move(int speed, int direction) {
        this.speed = speed;
        this.direction = direction;
        System.out.printf("Moving at %d mph", speed);
    }

    public void steer(int direction) {
        this.direction += direction;
        System.out.printf("Vehicle/steer(): Steering at: %d degrees", direction);
    }

    public void stop() {
        this.speed = 0;
    }
}
