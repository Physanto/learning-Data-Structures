package Stacks;

import java.util.ArrayList;

public class Stack<T> {

    private int maxSize;
    private ArrayList<T> arrayStack;
    private int topStack = -1;

    public Stack(int size){
        maxSize = size;
        arrayStack = new ArrayList<>(size);
    }

    public Stack(){
        arrayStack = new ArrayList<>();
    }

    public void push(char value){
        if(!isFully()){
            arrayStack[++topStack] = value;
        }
    }

    public Object pop(){ 
        if(!isEmpty()){
            return arrayStack[topStack--];
        }
        return 99;
    }

    public Object peek(){
        return arrayStack[topStack];
    }

    public boolean isEmpty(){
        return topStack == -1;
    }
    
    public boolean isFully(){
        return topStack == maxSize - 1;
    }

    public void todo(){
        for(int i = 0; i < arrayStack.length; i++){
            System.out.println("elemento " + arrayStack[i] + " en la posicion " + i + " del array");
        }
    }
}
