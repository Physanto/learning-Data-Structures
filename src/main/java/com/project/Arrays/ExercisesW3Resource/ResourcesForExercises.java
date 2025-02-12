package com.project.Arrays.ExercisesW3Resource;

import java.util.Random;

public class ResourcesForExercises{
    private int[] elements;
    private int[][] elementsBidi;
    private int size;

    public ResourcesForExercises(int size){
        this.size = size;
        elements = new int[this.size];
    }

    public void fillArrayElementsRandom(){
        Random random = new Random(); 

        for (int i = 0; i < elements.length; i++) {
            elements[i] = random.nextInt(1,10);
        }
    }

    public void fillArrayBidiElementsRandom(int[][] elementsBidi){
        Random random = new Random(); 

        for(int i = 0; i < elementsBidi.length; i++) {
            for(int j = 0; j < elementsBidi[i].length; j++) {
                elementsBidi[i][j] = random.nextInt(1, 10);
            }   
        }
    }

    public void printArray(){
        for(int element : elements){
            System.out.println(element);
        }
    }

    public void printArrayBidi(int[][] elementsBidi){
        for(int[] row : elementsBidi){
            for(int column : row){
                System.out.print(column + " ");
            }
            System.out.print("\n");
        } 
    }

    public int[] getElements(){ return elements; }

    public int[][] getElementsBidi(){ return elementsBidi; }
}
