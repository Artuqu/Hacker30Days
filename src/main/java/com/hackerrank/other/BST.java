package com.hackerrank.other;

import com.hackerrank.objects.EmptyBST;
import com.hackerrank.objects.NonEmptyBST;

public class BST<D> {

    public static void main(String[] args) throws Exception {
        EmptyBST emptyBST = new EmptyBST<>();
        NonEmptyBST nonEmptyBST = new NonEmptyBST<>(5);
        Testers.checkIsEmpty(emptyBST);
        Testers.checkIsEmpty(nonEmptyBST);
        Testers.checkIsEmpty(nonEmptyBST);
        Testers.checkIsEmpty(nonEmptyBST);

        Testers.checkAddMemberCardinality(emptyBST, 5);
        Testers.checkAddMemberCardinality(nonEmptyBST, 5);
        Testers.checkAddMemberCardinality(nonEmptyBST, 6);

    }
}
