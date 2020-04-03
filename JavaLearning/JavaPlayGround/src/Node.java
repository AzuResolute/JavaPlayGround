public class Node {
    private int value = 0;
    private Node left = null;
    private Node right = null;

    public Node(int value) {
        this.value = value;
    }

    // Standard Getters and Setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}