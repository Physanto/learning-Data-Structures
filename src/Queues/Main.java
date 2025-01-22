package Queues;

public class Main {

    public static void main(String[] args){

        Queue queue = new Queue(6);

        queue.push('m');
        queue.push('a');
        queue.push('n');
        queue.push('u');
        queue.push('e');
        queue.push('l'); 

        System.out.println("eliminado " + queue.pop());
        System.out.println("eliminado " + queue.pop());
        System.out.println("eliminado " + queue.pop());

        
        queue.push('q'); 
        queue.push('w'); 
        queue.push('r'); 
        queue.printQueue();
        System.out.println("cantidad iterm " + queue.cantItems);
    }
}
