package com.thoughtworks.tw101.exercises.exercise9;

import javax.xml.soap.SAAJResult;
import java.util.List;

public class Node {
    private String name;
    private Node laterChildNode;
    private Node earlierChildNode;

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
        if(laterChildNode == null) {
            laterChildNode = new Node(nameOfNewNode);
        } else {
            laterChildNode.add(nameOfNewNode);
        }
    }

    private void addEarlierChild(String nameOfNewNode) {
        if(earlierChildNode == null) {
            earlierChildNode = new Node(nameOfNewNode);
        } else {
            earlierChildNode.add(nameOfNewNode);
        }
    }

    private boolean newNodeNameComesLater(String newName) {
        if(name.compareToIgnoreCase(newName) < 0) {
            return true;
        }
        return false;
    }

    public List<String> names() {
        return null;
    }

    public Node getLaterChildNode() {
        return laterChildNode;
    }

    public Node getEarlierChildNode() {
        return earlierChildNode;
    }

    public String getName() {
        return name;
    }
}
