package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node right;
    private Node left;
    private Node parent;
    private boolean checked = false;
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
            right.setParent(this);
        } else {
            right.add(nameOfNewNode);
        }
    }

    private void addEarlierChild(String nameOfNewNode) {
        if(left == null) {
            left = new Node(nameOfNewNode);
            left.setParent(this);
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

//    If node has a node to the left, call the function on that sub node
//    If the node does not have a node to the left, output the node's name and mark it as checked
//    If the node has a node to the right, run the function on that node
//    If the node does not have a node to the right or left, run the function on the node's parent
//    If the node has been checked, run the function on it's parent.
//    If the node does not have a parent, we know it's the root


    public List<String> names() {
        if(parent == null && left.checked) {
            if(right.checked) return null;
            System.out.println(getName());
            checked = true;
            if(right != null && !right.checked) {
                right.names();
            }
        }
        if(checked) return parent.names();
        if(left != null && !left.checked) {
            left.names();
        } else if(right != null && !right.checked) {
            System.out.println(getName());
            checked = true;
            right.names();
        } else {
            System.out.println(getName());
            checked = true;
            parent.names();
        }
        return orderedNames;
    }

    public Node getLaterChildNode() {
        return right;
    }

    public Node getEarlierChildNode() {
        return left;
    }

    public String getName() {
        return name;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}
