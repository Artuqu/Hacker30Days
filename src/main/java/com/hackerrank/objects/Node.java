package com.hackerrank.objects;

import java.util.ArrayList;
import java.util.List;

public class Node {
    int value;
    public Node left;
    public Node right;

    public int getValue() {
        return value;
    }


    public Node(int root) {
        this.value = root;
        left = null;
        right = null;
    }

    public Node() {
    }


    static List<Integer> nodes = new ArrayList<>();

    public static Node addRecursive(Node current, int value) {
        if (current == null) {
            nodes.add(value);
            return new Node(value);
        }
        if (value < current.value) {
            nodes.add(value);
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            nodes.add(value);
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }
        return current;
    }

    public static void printTree() {
        List<Integer> nodes1 = nodes;
        List<Integer> result = new ArrayList<>();
        Integer first = nodes1.get(1);
    }
}

