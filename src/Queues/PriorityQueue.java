package Queues;

public class PriorityQueue {

    private int size = 10;
    private char[] queArray;
    private int front;
    private int rear;
    private int cantItems;

    public PriorityQueue(){  
        queArray = new char[size];
        front = -1;
        rear = -1;
        cantItems = 0;
    }

    public PriorityQueue(int size){
        this.size = size;
        queArray = new char[size];
        front = -1;
        rear = -1;
        cantItems = 0;
    }

    public void push(char element){
        
        if(cantItems == 0){
            queArray[cantItems++] = element;
            ++front;
            return;
        }

        if(isFully()){
            return;
        }

        for (int i = 0; i <= cantItems; i++) {

            if(element > queArray[i] && queArray[i] != 0){
                continue; 
            }
            //corre los elementos hacia atras para dejar el espacio en (i)
            for (int j = cantItems; j >= i; j--) {
                queArray[j+1] = queArray[j];
            }
            //agrega el elemento hasta donde llega i
            queArray[i] = element;
            cantItems++;
            break;
        }
    }

    public boolean isEmpty(){

    }

    public boolean isFully(){
        return cantItems == size;
    }
}


