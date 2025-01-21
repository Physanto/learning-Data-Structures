package Stacks;

public class Main {

    public static void main(String[] args){

        // Stack stack = new Stack(3);
        //
        // stack.push(10);
        // stack.push(20);
        // System.out.println("cuando se agregaron los elementos: \n\n");
        // stack.todo();
        //
        // long elimi = stack.pop();
        // long top = stack.peek();
        // System.out.println(elimi + " elemento eliminado");
        // System.out.println(top + " top");
        String charSequence = "manuel";
        Stack stack = new Stack(charSequence.length());

        char[] array = charSequence.toCharArray(); 

        for(int i = 0; i < charSequence.length(); i++){
            stack.push(array[i]);
        } 

        stack.todo();

        for(int i = 0; i < charSequence.length(); i++){
            
            System.out.println(stack.pop());
        } 
    }
}
