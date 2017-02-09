package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node right;
    private Node left;
    private ArrayList<String> orderedNames = new ArrayList<>();

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        if(newNodeNameComesLater(nameOfNewNode)) {
            addLaterChild(nameOfNewNode);
        } else {
            addEarlierChild(nameOfNewNode);
        }

    }

    private void addLaterChild(String nameOfNewNode) {
        if(right == null) {
            right = new Node(nameOfNewNode);
        } else {
            right.add(nameOfNewNode);
        }
    }

    private void addEarlierChild(String nameOfNewNode) {
        if(left == null) {
            left = new Node(nameOfNewNode);
        } else {
            left.add(nameOfNewNode);
        }
    }

    private boolean newNodeNameComesLater(String newName) {
        if(name.compareToIgnoreCase(newName) < 0) {
            return true;
        }
        return false;
    }


    public List<String> names() {
        if(left != null) {
            orderedNames.addAll(left.names());
            orderedNames.add(getName());
        } else {
            orderedNames.add(getName());
        }
        if(right != null) {
            orderedNames.addAll(right.names());
        }
        return orderedNames;
    }

    public String getName() {
        return name;
    }
}
