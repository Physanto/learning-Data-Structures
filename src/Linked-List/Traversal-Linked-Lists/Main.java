public class Main {
    
    public static void main(String[] args){
        
        //creating new nodes
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        recorridoListaEnlazada(head);

        
    }

    /***
     * recive the node (object), verify if node point to new node
     * print the data field
     * head = next node created previously
     *
     */
    public static void recorridoListaEnlazada(Node head){

        while(head != null){

            System.out.println(head.data);

            head = head.next;
        }
    }
    
}
