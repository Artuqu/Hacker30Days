package com.hackerrank.days;


import com.hackerrank.objects.BinaryTree;
import com.hackerrank.objects.Node;

import java.util.*;
import java.util.Arrays;

public class BSTLevelOrder {

    public static List<Node> pq = new ArrayList<Node>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        int length = data;
        BinaryTree binaryTree = new BinaryTree();

        while (data > 0) {
            int root = scanner.nextInt();
            levelOrder(binaryTree.add(root));
            data--;
        }

        printTreeFromData(length, pq);
        scanner.close();
    }

    private static void printTreeFromData(int length, List<Node> pq) {


        List<Integer> result = new ArrayList<>(Arrays.asList(new Integer[length]));
        int node = pq.get(0).getValue();
        result.add(length, node);

        int index = 0;

        for (int i = 2; i < pq.size(); i++) {
            node = pq.get(i).getValue();
            for (int j = i; j < pq.size(); j++) {
                if (pq.get(i) == pq.get(j)) {
                    index++;
                }
            }
            result.add(index, node);
            index = 0;
        }

        for (Integer i : result) {
            System.out.println(i);

        }
    }


    public static void levelOrder(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.print(curr.getValue() + " ");
            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);
        }
    }
}
