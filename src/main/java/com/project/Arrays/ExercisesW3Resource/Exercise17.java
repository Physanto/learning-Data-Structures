package com.project.Arrays.ExercisesW3Resource;

/**
 * Exercise 17: Write a Java program to find the second largest element in an array.
 *
 * @see <a href"https://www.w3resource.com/java-exercises/array/index.php">W3resources</a>
 * 
 */

public class Exercise17 {

    public static void main(String[] args){

        ResourcesForExercises resourcesForExercises = new ResourcesForExercises(6);
        
        resourcesForExercises.fillArrayElementsRandom();
        int[] elements = resourcesForExercises.getElements();
        System.out.println("Impresion del array de elementos lleno\n");
        resourcesForExercises.printArray();

        System.out.println("El segundo mas grande es " + findSecondLargest(elements));
    }
    
    /**
     * this method find the second largest element from an array
     *
     * @param elements array containing the elements
     * @return secondMax the second largest element
     */
    public static int findSecondLargest(int[] elements){
        int max = elements[0];
        int secondMax = 0;

        for(int i = 0; i < elements.length; i++) {
            
            if(max < elements[i]){
                secondMax = max;
                max = elements[i];
            }
            else if(secondMax < elements[i] && elements[i] != max){
                secondMax = elements[i];
            }
        }
        return secondMax;
    }
}
