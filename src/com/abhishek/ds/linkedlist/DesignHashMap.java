package com.abhishek.ds.linkedlist;

import java.util.Arrays;

public class DesignHashMap {

    int[] table = null;
    public DesignHashMap() {
        table = new int[1000001];
        Arrays.fill(table, -1);
    }

    public void put(int key, int value) {
        table[key] = value;
    }

    public int get(int key) {
        return table[key];
    }

    public void remove(int key) {
        table[key] = -1;
    }
}
