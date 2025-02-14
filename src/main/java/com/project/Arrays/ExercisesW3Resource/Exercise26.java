package com.project.Arrays.ExercisesW3Resource;

import java.util.Arrays;

/**
 * Exercise 26: Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.
 *
 * @see <a href"https://www.w3resource.com/java-exercises/array/index.php">W3resources</a>
 * 
 */
public class Exercise26 {

    public static void main(String[] args){
        
        int[] elements = {0,0,3,0,1,0,6,0,5};
        moveZerosRight(elements);

        System.out.println(Arrays.toString(elements));
    }
    
    /**
     * move zeros to right, this solution is eneficient
     */
    public static void moveZerosRight(int[] elements){
        
        for(int i = 0; i < elements.length; i++){
            for(int j = 0; j < i; j++) {
                if(elements[j] < elements[i] && (elements[j] == 0 || elements[i] == 0)){
                   int aux = elements[j];
                   elements[j] = elements[i];
                   elements[i] = aux;
                }
            }
        }
    }
    
    /**
     * move zeros to right, this solution is most eficient
     */
    public static void moveZerosRightV2(int[] elements){
        int index = 0; 

        for(int element : elements){
            if(element != 0){
                elements[index++] = element;
            }
        }

        while(index < elements.length){
            elements[index++] = 0;
        }
    }
}
