package com.project.Arrays.ExercisesW3Arrays;

import com.project.Arrays.Exercises.OperationsArrays;
/**
 * Exercise 7: Write a program java to remove a specific element from an array
 *
 * @see <a href="https://www.w3resource.com/java-exercises/array/index.php">W3Resource</a>
 *
 * @author Phy
 *
 */
public class Exercise7 {
    
    public static void main(String[] args){
        
        OperationsArrays operationsArrays = new OperationsArrays(6);
        int[] array = operationsArrays.fillArrayElementsRandom();

        for(int a : array){
            System.out.println(a); 
        }
    }
}
