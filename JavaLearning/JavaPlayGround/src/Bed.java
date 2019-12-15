public class Bed {
    private String style;
    private int pillows;
    private int height;
    private  int sheets;
    private int quilt;
    private boolean isMade;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
        this.isMade = false;
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public boolean isMade() {
        return isMade;
    }

    public void make() {
        this.isMade = true;
    }
}
