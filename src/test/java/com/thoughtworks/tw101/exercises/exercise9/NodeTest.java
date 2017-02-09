package com.thoughtworks.tw101.exercises.exercise9;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NodeTest {


    @Test
    public void itShouldReturnAnArrayListWithRootNameIfNoOtherNodesHaveBeenAdded() {
        Node root = new Node("Charlie");
        List<String> charlie = new ArrayList<>();
        charlie.add("Charlie");
        assertThat(root.names(), is(charlie));
    }

    @Test
    public void itShouldSortRootAndNodeToTheLeft() {
        Node root = new Node("Charlie");
        root.add("Alex");
        List<String> testList = new ArrayList<>();
        testList.addAll(Arrays.asList("Alex", "Charlie"));
        assertThat(root.names(), is(testList));
    }

    @Test
    public void itShouldSortRootWithNodeToTheLeftAndNodeToTheLeftOfSubNode() {
        Node root = new Node("Charlie");
        root.add("Bridget");
        root.add("Alex");
        List<String> testList = new ArrayList<>();
        testList.addAll(Arrays.asList("Alex", "Bridget", "Charlie"));
        assertThat(root.names(), is(testList));
    }

    @Test
    public void itShouldSortRootWithNodeToTheLeftAndNodeToTheLeftAndRightOfSubNode() {
        Node root = new Node("Charlie");
        root.add("Bridget");
        root.add("Alex");
        root.add("Bryan");
        List<String> testList = new ArrayList<>();
        testList.addAll(Arrays.asList("Alex", "Bridget", "Bryan", "Charlie"));
        assertThat(root.names(), is(testList));
    }

    @Test
    public void itShouldSortRootWithNodeToTheLeftAndNodeToTheLeftAndRightOfSubNodeAndNodeToTheRightOfTheRoot() {
        Node root = new Node("Charlie");
        root.add("Bridget");
        root.add("Alex");
        root.add("Bryan");
        root.add("Daniel");
        List<String> testList = new ArrayList<>();
        testList.addAll(Arrays.asList("Alex", "Bridget", "Bryan", "Charlie", "Daniel"));
        assertThat(root.names(), is(testList));
    }

    @Test
    public void itShouldSortRootWithNodeToTheRight() {
        Node root = new Node("Charlie");
        root.add("Daniel");
        List<String> testList = new ArrayList<>();
        testList.addAll(Arrays.asList("Charlie", "Daniel"));
        assertThat(root.names(), is(testList));
    }

    @Test
    public void itShouldWorkWithGivenNamesInMain() {
        Node root = new Node("Cecil");
        root.add("Michelle");
        root.add("Bill");
        root.add("Jagruti");
        root.add("Tess");
        root.add("Sue-Ellen");
        root.add("Sara");
        root.add("Casey");

        List<String> testList = new ArrayList<>();
        testList.addAll(Arrays.asList("Bill", "Casey", "Cecil", "Jagruti", "Michelle", "Sara", "Sue-Ellen", "Tess"));
    }





}