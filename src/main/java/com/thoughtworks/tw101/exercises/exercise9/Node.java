package com.thoughtworks.tw101.exercises.exercise9;

import java.util.LinkedList;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        if(nameOfNewNode.compareTo(name) < 0)  {
            if(left == null) {
                left = new Node(nameOfNewNode);
            }
            else {
                left.add(nameOfNewNode);
            }
        }
        else {
            if(right == null) {
                right = new Node(nameOfNewNode);
            }
            else {
                right.add(nameOfNewNode);
            }
        }
    }

    public LinkedList<String> names() {
        LinkedList<String> toReturn = new LinkedList();
        if(left != null) {
            toReturn.addAll(left.names());
        }
        toReturn.add(name);
        if(right != null) {
            toReturn.addAll(right.names());
        }
        return toReturn;
    }
}
