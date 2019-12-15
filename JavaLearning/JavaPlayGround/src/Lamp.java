public class Lamp {
    private String style;
    private boolean isOn;

    public Lamp(String style, boolean isOn) {
        this.style = style;
        this.isOn = isOn;
    }

    public String getStyle() {
        return style;
    }

    public boolean isOn() {
        return isOn;
    }

    public void toggle () {
        this.isOn = !this.isOn;
        System.out.printf("Lamp is %s", this.isOn ? "ON" : "OFF");
    }
}
