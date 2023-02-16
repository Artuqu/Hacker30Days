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

//        System.out.println(Testers.randomInt(5, 15));

        int tests = 1000;
        for (int i = 0; i < tests; i++) {
            Tree t;
            if (i % 10 == 0) {
                t = Testers.randomTree(0);
            } else {
                t = Testers.randomTree(10);
            }
            Testers.checkAddMemberCardinality(t, i);
        }

    }
}
