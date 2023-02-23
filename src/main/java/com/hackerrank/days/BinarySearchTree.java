package com.hackerrank.days;

import com.hackerrank.objects.BinaryTree;

import java.util.Scanner;

public class BinarySearchTree<D> {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree binaryTree = new BinaryTree();
        int binaryTreeSize = scanner.nextInt();
        while (binaryTreeSize > 0) {
            int node = scanner.nextInt();
            binaryTree.add(node);
            int i = binaryTree.maxDepth(binaryTree.add(node));
            binaryTreeSize--;
            if (binaryTreeSize == 0) {
                System.out.println(i - 1);
            }
        }
        scanner.close();

    }


}
//13
//25
//39
//12
//19
//9
//23
//55
//31
//60
//35
//41
//70
//90