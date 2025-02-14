package com.project.Arrays.ExercisesW3Resource;

/**
 * Exercise 26: Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.
 *
 * @see <a href"https://www.w3resource.com/java-exercises/array/index.php">W3resources</a>
 * 
 */
public class Exercise34 {

    public static void main(String[] args){
        // 
        // int[] elements = {49,1,3,200,2,4,70,5};
        int[] elements = {40,1,6,41,2,4,3,5};
        System.out.println("la secuencia tiene una longitud de " + countSequenceLargest(elements));
    }

    public static int countSequenceLargest(int[] elements){
        int aux = elements[0];
        int cont = 0;
        int cont2 = 0;
        int j = 0;

        for(int i = 0; i < elements.length; i++) {
            //aux = elements[j];
            for(j = 0; j < elements.length; j++) {
                if(aux+1 == elements[j]){ //&& elements[j] != aux){
                    aux = elements[j];
                    System.out.println(aux);
                    cont++; 
                    break;
                }
            }
            if(i+1 < elements.length) aux = elements[i+1];
        }
        return cont;
    }
}
