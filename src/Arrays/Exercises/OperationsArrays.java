package Arrays.Exercises;

import java.util.Random;

/**
 * Operaciones basicas que se pueden hacer con Arrays
 */ 

public class OperationsArrays {

    private int[] elements;
    private int size;


    public OperationsArrays(int size){
        this.size = size;
        elements = new int[size];
    }

    @Override
    public String toString(){

        String string = "[";
                                    //esto se podria mejorara con la clase StringBuilder que es mas eficiente cuando se quiere mutar cadenas
        for(int i : elements){
            string += String.valueOf(i);
            string += ", ";
        }
        string += "]";
        return string;
    }


    /**
     * Llena el array con elementos aletorios
     */
    public int[] fillArrayElementsRandom(){

        Random random = new Random(); 

        for (int i = 0; i < elements.length; i++) {
            elements[i] = random.nextInt(0,10);
        }
        return elements;
    }
    
    /**
     * Suma todos los elementos del array
     */
    public int sumElements(){
        
        int sumElements = 0;

        for (int i = 0; i < elements.length; i++) {
            sumElements += elements[i];
        }
        return sumElements; 
    }
    
    public float promedyValues(){
        
        int sumElements = sumElements();

        if(sumElements == 0){
            return 0;
        } 
        return sumElements / size;
    }

    public void maxAndMinValue(){

        for(int i = 0; i < elements.length; i++){

        }
    }
    
    /**
     * Imprime el array
     */
    public void printArray(){

        for (int i : elements) {
            System.out.println(i);
        }
    }

    

    public static void main(String[] args){
        
        OperationsArrays operationsArrays = new OperationsArrays(6);

        Random random = new Random();

        int[] numbers = new int[10];
        
        operationsArrays.fillArrayElementsRandom();

        System.out.println(operationsArrays.toString());

        // System.out.println("Elementos ingresados al arreglo de forma aleatoria");
        // operationsArrays.printArray();
        //
        // System.out.println("\nSuma de elementos: " + operationsArrays.sumElements());
    }
}
