package com.hackerrank.other;
import com.hackerrank.objects.NonEmptyBST;

public interface Tree <D extends Comparable<D>>{

    boolean isEmpty();
    int cardinality();
    boolean member (D element);
    NonEmptyBST<D> add(D element);
    
}
