package com.hackerrank.objects;

public class BinaryTree {
    Node root;

    public Node add(int value) {
        root = Node.addRecursive(root, value);
        return root;
    }

    public int maxDepth(Node node) {
        if (node == null)
            return 0;
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

}

