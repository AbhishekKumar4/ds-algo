package com.abhishek.ds.linkedlist;

public class DesignHashSet {
    boolean[] table = null;

    public DesignHashSet() {
        table = new boolean[1000001];
    }

    public void add(int key) {
        table[key] = true;
    }

    public void remove(int key) {
        table[key] = false;
    }

    public boolean contains(int key) {
        return table[key];
    }
}
