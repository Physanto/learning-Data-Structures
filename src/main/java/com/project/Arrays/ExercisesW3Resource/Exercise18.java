package com.project.Arrays.ExercisesW3Resource;

/**
 * Exercise 18: Write a Java program to find the second smallest element in an array.
 *
 * @see <a href"https://www.w3resource.com/java-exercises/array/index.php">W3resources</a>
 * 
 */
public class Exercise18 {

    public static void main(String[] args){

        ResourcesForExercises resourcesForExercises = new ResourcesForExercises(6);
        
        resourcesForExercises.fillArrayElementsRandom();
        int[] elements = resourcesForExercises.getElements();
        System.out.println("Impresion del array de elementos lleno\n");
        resourcesForExercises.printArray();

        System.out.println("El segundo mas pequeno es " + findSecondLargest(elements)); 
    }
    
    /**
     * this method find the second smallest element from an array
     *
     * @param elements array containing the elements
     * @return secondMin the second largest element
     */
    public static int findSecondLargest(int[] elements){
        int min = elements[0];
        int secondMin = elements[1];

        for(int i = 0; i < elements.length; i++) {
            
            if(min > elements[i]){
                secondMin = min;
                min = elements[i];
            }
            else if(secondMin > elements[i] && elements[i] != min){
                secondMin = elements[i];
            }
        }
        return secondMin;
    }
}
