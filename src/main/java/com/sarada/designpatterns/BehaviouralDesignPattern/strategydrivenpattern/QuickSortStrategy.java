package com.sarada.designpatterns.BehaviouralDesignPattern.strategydrivenpattern;

// QuickSortStrategy
public class QuickSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        // Implement Quick Sort algorithm
        System.out.println("Sorting using Quick Sort");
    }
}