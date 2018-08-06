package DataStructures;

import java.util.Iterator;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree(int value) {
        root = new Node(value);
    }

    private void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            root.insert(value);
        }
    }

    public Node get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public Node getMin() {
        if (root != null) {
            return root.getMin();
        }
        return null;
    }

    public Node getMax() {
        if (root != null) {
            return root.getMax();
        }
        return null;
    }

    public void delete(int value) {

    }

    public void traverseInOrder() {
        System.out.println("Traversing In Order");
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public void traversePreOrder() {
        System.out.println("Traversing Pre Order");
        if (root != null) {
            root.traversePreOrder();
        }
    }

    public void traversePostOrder() {
        System.out.println("Traversing Post Order");
        if (root != null) {
            root.traversePostOrder();
        }
    }

    public class Node {
        int value;
        Node parent;
        int depth;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            depth = 0;
        }

        public String toString() {
            return "" + value;
        }

        public boolean hasLeft() {
            return (left != null);
        }

        public boolean hasRight() {
            return (right != null);
        }

        public Node getMin() {
            while (hasLeft()) {
                return left.getMin();
            }
            return this;
        }

        public Node getMax() {
            while (hasRight()) {
                return right.getMax();
            }
            return this;
        }

        public Node get(int value) {
            if (this.value == value) {
                return this;
            }
            if (value < this.value) {
                if (hasLeft()) {
                    System.out.println(" Getting left ");
                    return left.get(value);
                }
            } else {
                if (hasRight()) {
                    System.out.println(" Getting right ");
                    return right.get(value);
                }
            }
            return null;
        }

        public void insert(int value) {
            if (this.value == value) {
                System.out.println("Duplicate value");
                return;
            }
            System.out.print("Inserting " + value);
            if (this.value > value) {
                if (!hasLeft()) {
                    // Insertion point
                    System.out.println(" Left");
                    left = new Node(value);
                } else {
                    // Go left
                    left.insert(value);
                }
            } else {
                if (!hasRight()) {
                    System.out.println(" Right");
                    right = new Node(value);
                } else {
                    right.insert(value);
                }
            }
        }

        public void traverseInOrder() {
            if (left != null) {
                left.traverseInOrder();
            }
            System.out.print(" " + value);
            if (right != null) {
                right.traverseInOrder();
            }
        }

        public void traversePreOrder() {
            System.out.print(" " + value);
            if (left != null) {
                left.traversePreOrder();
            }
            if (right != null) {
                right.traversePreOrder();
            }
        }

        public void traversePostOrder() {
            if (left != null) {
                left.traversePostOrder();
            }
            if (right != null) {
                right.traversePostOrder();
            }
            System.out.print(" " + value);
        }


    }

    public static void main(String args[]) {
        BinarySearchTree bst = new BinarySearchTree(25);
        bst.insert(20);
        bst.insert(15);
        bst.insert(27);
        bst.insert(30);
        bst.insert(29);
        bst.insert(26);
        bst.insert(22);
        bst.insert(32);
        System.out.println();
        bst.traverseInOrder();
        System.out.println();
        System.out.println("___________________________");
        System.out.println();
        bst.traversePreOrder();
        System.out.println();
        System.out.println("___________________________");
        System.out.println();
        bst.traversePostOrder();
        System.out.println();
        System.out.println("___________________________");
        System.out.println();
        System.out.println(bst.get(11));
        System.out.println(bst.get(22));
        System.out.println("___________________________");
        System.out.println("Min is " + bst.getMin());
        System.out.println("Max is " + bst.getMax());
        System.out.println("___________________________");
    }


}
