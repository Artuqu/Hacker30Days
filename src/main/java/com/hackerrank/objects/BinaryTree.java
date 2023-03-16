package com.hackerrank.objects;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    public BinaryTree() {
    }

    public Node add(int value) {
        root = Node.addRecursive(root, value);
        return root;
    }

    public void getRoot() {
         Node.printTree();
    }

    public int maxDepth(Node node) {
        if (node == null)
            return -1;
        else {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            /* use the larger one */
            if (lDepth > rDepth) {
                return (lDepth + 1);
            } else {
                return (rDepth + 1);
            }
        }
    }

    public void printTree(Queue<Node> q) {

        if (!q.isEmpty()) {
            Node c = q.remove();
            System.out.print(c.getValue() + " ");
            if (c != null) {
                if (c.left != null) {
                    q.add(c.left);
                }
                if (c.right != null) {
                    q.add(c.right);
                }
            }
            printTree(q);
        }

    }



    public void levelOrder(Node root) {
    LinkedList<Integer> queue = new LinkedList<>();
        //we print the root
        //push non-null children in the queue
        if (root.left != null) queue.add(root.left.getValue());
        if (root.right != null) queue.add(root.right.getValue());

        for (Integer i :queue
             ) {
            System.out.println(i);

        }
    }

}
