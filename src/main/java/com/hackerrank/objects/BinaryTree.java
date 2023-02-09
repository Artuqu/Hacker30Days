package com.hackerrank.objects;

public class BinaryTree {
    Node root;

    public void add(int value) {
        root = Node.addRecursive(root, value);
    }

    public int cardinality() {
        return 1 + root.left.cardinality() + root.right.cardinality();
    }
}

