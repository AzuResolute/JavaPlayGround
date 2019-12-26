public class Printer {
    private int tonerLevel = 100;
    private int numberOfPagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel <= 100 && tonerLevel >= 0 ?  tonerLevel : this.tonerLevel;
        this.duplex = duplex;
        this.numberOfPagesPrinted = 0;
    }

    public void print(int pages){
        System.out.println("Page Printed");
        this.numberOfPagesPrinted += duplex ? (pages / 2) + (pages % 2) : pages;
    }

    public int addToner(int newTonerAmount) {
        if(newTonerAmount > 0 && newTonerAmount <= 100 && (this.tonerLevel + newTonerAmount) <= 100) {
            this.tonerLevel += newTonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
