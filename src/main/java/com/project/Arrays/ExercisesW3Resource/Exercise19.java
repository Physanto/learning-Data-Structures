package com.project.Arrays.ExercisesW3Resource;

import java.lang.reflect.Array;

/**
 * Exercise 19: Write a Java program to add two matrices of the same size.
 *
 * @see <a href"https://www.w3resource.com/java-exercises/array/index.php">W3resources</a>
 * 
 */

public class Exercise19 {

    public static void main(String[] args){
        int size = 3;
        int[][] arrayBidiOne = new int[size][size];
        int[][] arrayBidiTwo = new int[size][size];

        ResourcesForExercises resourcesForExercises = new ResourcesForExercises(3);

        resourcesForExercises.fillArrayBidiElementsRandom(arrayBidiOne);
        resourcesForExercises.fillArrayBidiElementsRandom(arrayBidiTwo);
        
        System.out.println("Impresion de las matrices\n");

        System.out.println("Matriz 1");
        resourcesForExercises.printArrayBidi(arrayBidiOne);

        System.out.println("\nMatriz 2");
        resourcesForExercises.printArrayBidi(arrayBidiTwo); 
        
        System.out.println("\nmatriz sumada\n");
        resourcesForExercises.printArrayBidi(sumArraysBidi(arrayBidiOne, arrayBidiTwo));
    }
    
    /**
     * sum two array two-dimensional
     *
     * @param arrayOne array two-dimensional
     * @param arrayTwo array two-dimensional
     *
     * @return sum is an array two-dimensional with the sum from two arrays
     */
    public static int[][] sumArraysBidi(int[][] arrayOne, int[][] arrayTwo){
        int[][] sum = new int[arrayOne.length][arrayOne.length];

        for(int i = 0; i < arrayOne.length; i++) {
            for(int j = 0; j < arrayOne[i].length; j++) {
               sum[i][j] = arrayOne[i][j] + arrayTwo[i][j];
            }   
        }
        return sum;
    }
}

