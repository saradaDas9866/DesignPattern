package com.sarada.designpatterns.BehaviouralDesignPattern.strategydrivenpattern;

// BubbleSortStrategy
public class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        // Implement Bubble Sort algorithm
        System.out.println("Sorting using Bubble Sort");
    }
}