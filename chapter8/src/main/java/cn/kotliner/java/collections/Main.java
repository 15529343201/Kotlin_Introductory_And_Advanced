package cn.kotliner.java.collections;

import cn.kotliner.kotlin.collections.ListTest;


public class Main {
    public static void main(String... args) {
        ListTest.INSTANCE.getList().add(5);
        for (Integer integer : ListTest.INSTANCE.getList()) {
            System.out.println(integer);
        }
    }
}
