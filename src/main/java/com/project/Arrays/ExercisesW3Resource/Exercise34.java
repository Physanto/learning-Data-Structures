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
        //int[] elements = {49,1,3,200,2,4,70,5};
        int[] elements = {40,1,42,41,2,4,3,5};
        System.out.println("la secuencia tiene una longitud de " + countSequenceLargest(elements));
    }

    public static int countSequenceLargest(int[] elements){
        int aux = elements[0];
        int cont = 1;

        for(int i = 0; i < elements.length; i++) { //2
            for(int j = 0; j < elements.length; j++) {

                if(aux+1 == elements[j]){
                    aux = elements[j];
                    cont++; 
                    break;
                }
                else if(j == elements.length - 1){
                    cont = 1;
                    aux = elements[i+1];
                }
            }
        }        
        return cont;
        //FALTA TERMINARLO, HAY QUE HALLAR LA FORMA DE PODER IDENTIFICAR DONDE FUE LA ULTIMA VEZ
        //QUE SE USO UN VALOR DEL ARRAY
    }
}
