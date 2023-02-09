package com.hackerrank.objects;

public class Node {
    int value;
    Node left;
    Node right;


    public Node(int root) {
        this.value = root;
        left = null;
        right = null;
    }

    public Node() {
    }

    public static Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }
        return current;
    }
    public int cardinality() {
        return 1 + left.cardinality() + right.cardinality();
    }
}

