package Stacks;

public class Stack {

    private int maxSize;
    private char[] arrayStack;
    private int topStack;

    public Stack(int size){
        maxSize = size;
        arrayStack = new char[maxSize];
        topStack = -1;
    }

    public void push(char value){
        if(!isFully()){
            arrayStack[++topStack] = value;
        }
    }

    public char pop(){ 
        if(!isEmpty()){
            return arrayStack[topStack--];
        }
        return 99;
    }

    public char peek(){
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
