package com.hackerrank.days;

import java.util.HashSet;
import java.util.Set;

public class User {


    String userName;
    String password;
    int age;
    Set<Integer> orderIds;

    public User(String userName, String password, int age, Set<Integer> orderIds) {
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.orderIds = orderIds;
    }

    public static void main(String[] args) {
        Set a = new HashSet<>();
        a.add(1212);
        User kathryn = new User("BlondieBytes", "hello world", 31, a);
    }
}
