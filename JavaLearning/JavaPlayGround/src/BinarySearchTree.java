import java.util.*;
import java.util.stream.Stream;

public class BinarySearchTree {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.setRoot(new Node(10));
//        bst.getRoot().setLeft(new Node(7));
//        bst.getRoot().setRight(new Node(15));
//        bst.getRoot().getLeft().setRight(new Node(9));
        bst.insert(89);
        bst.insert(2);
        bst.insert(12);
        bst.insert(7);
        bst.insert(1);
        bst.insert(29);

        System.out.println(bst.getRoot().getLeft().getRight().getValue());
        System.out.println(bst.getRoot().getRight().getValue());
        System.out.println(bst.getRoot().getRight().getLeft().getValue());
        System.out.println(bst.contains(12));
        System.out.println(bst.contains(24));

//        bst.breadFirstSearch().forEach(n -> System.out.println(n.getValue()));
        bst.depthFirstSearchOrder();
        bst.depthFirstSearchOrderIteritive().forEach(n -> System.out.println(n.getValue()));
}

    public BinarySearchTree insert(int newValue) {
        if(this.root == null) {
            this.root = new Node(newValue);
        } else {
            Node current = this.root;
            while(true) {
                if(newValue < current.getValue()) {
                    if(current.getLeft() == null) {
                        current.setLeft(new Node(newValue));
                        return this;
                    } else {
                        current = current.getLeft();
                    }
                } else if(newValue > current.getValue()) {
                    if(current.getRight() == null) {
                        current.setRight(new Node(newValue));
                        return this;
                    } else {
                        current = current.getRight();
                    }
                }
            }
        }
        return this;
    }

    public boolean contains (int searchValue) {
        Node current = this.root;

        while(true) {
            if(current.getValue() == searchValue) {
                return true;
            } else if (current.getValue() > searchValue) {
                if(current.getLeft() == null) {
                    return false;
                } else {
                    current = current.getLeft();
                }
            } else if(current.getValue() < searchValue) {
                if(current.getRight() == null) {
                    return false;
                } else {
                    current = current.getRight();
                }
            }
        }
    }

    public List<Node> breadFirstSearch () {
        List<Node> results = new ArrayList<Node>();
        List<Node> queue = new ArrayList<Node>();
        queue.add(this.root);

        while(queue.toArray().length > 0) {
            if(queue.get(0).getLeft() != null) {
                queue.add(queue.get(0).getLeft());
            }
            if(queue.get(0).getRight() != null) {
                queue.add(queue.get(0).getRight());
            }
            results.add(queue.get(0));
            queue.remove(0);
        }

        return results;
    }

    void depthFirstSearchOrder(Node node)
    {
        if (node == null)
            return;

        depthFirstSearchOrder(node.getLeft());

        System.out.print(node.getValue() + " ");

        depthFirstSearchOrder(node.getRight());
    }

    // Wrappers over above recursive functions
    public void depthFirstSearchOrder() { depthFirstSearchOrder(root); }

    public List<Node> depthFirstSearchOrderIteritive() {
        List<Node> result = new ArrayList<>();
        if(this.root == null) {
            return result;
        }

        Stack<Node> pending = new Stack<Node>();
        Node current = this.root;

        while(current != null || pending.size() > 0) {

            while(current != null) {
                pending.push(current);
                current = current.getLeft();
            }

            current = pending.pop();
            result.add(current);
            current = current.getRight();
        }
        return result;
    }

    /// Standard Getters and Setters

    private Node root = null;
    public BinarySearchTree() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
