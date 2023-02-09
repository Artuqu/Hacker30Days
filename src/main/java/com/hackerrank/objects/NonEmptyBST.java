package com.hackerrank.objects;

import com.hackerrank.other.Tree;

public class NonEmptyBST<D extends Comparable<D>> implements Tree<D> {
    D root;
    Tree<D> left;
    Tree<D> right;

    public NonEmptyBST(D element) {
        this.root = element;
        left = new EmptyBST<>();
        right = new EmptyBST<>();
    }

    public NonEmptyBST(D element, Tree<D> leftTree, Tree<D> rightTree) {
        root = element;
        left = leftTree;
        right = rightTree;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int cardinality() {
        return 1 + left.cardinality() + right.cardinality();
    }

    @Override
    public boolean member(D element) {
        if (root == element) {
            return true;
        } else if (element.compareTo(root) < 0) {
            return left.member(element);
        } else {
            return right.member(element);
        }
    }

    @Override
    public NonEmptyBST<D> add(D element) {
        if (root == element) {
            return this;
        } else if (element.compareTo(root) < 0) {
            return new NonEmptyBST<>(root, left.add(element), right);
        } else {
            return new NonEmptyBST<>(root, left, right.add(element));
        }
    }
}
