import java.util.Arrays;

public class Main {
    static char[] arrayChars = new char[50];
    static int top = -1;

    public static void main(String[] args){
    // Casos donde debe devolver true (balanceado):

   isParenthesisBalanced("()"); // true

   isParenthesisBalanced("{[()]}"); // true

   isParenthesisBalanced("({[()]})"); // true

   isParenthesisBalanced(""); // true

   isParenthesisBalanced("{()}"); // true


    // Casos donde debe devolver false (no balanceado):

   isParenthesisBalanced(")"); // false

   isParenthesisBalanced("("); // false

   System.out.println(isParenthesisBalanced("{[}") + "aqui"); // false

   isParenthesisBalanced("{[(])}"); // false

   isParenthesisBalanced("({[}])}"); // false

   isParenthesisBalanced("{[("); // false

   isParenthesisBalanced("{[()]})"); // false


    // Casos adicionales:

   isParenthesisBalanced("a{b[c]d}e"); // true

   isParenthesisBalanced("({[})"); // false

   isParenthesisBalanced("{[(()])}"); // false
        
    }
    static boolean isParenthesisBalanced(String s) {
        Arrays.fill(arrayChars, '\0'); 
        char[] charSequence = s.toCharArray();
        boolean verify = false;

        for(int i = 0; i < charSequence.length; i++){

            char character = charSequence[i];

            switch(character){

                case '{':
                case '[':
                case '(':
                    push(character);
                    break;

                case '}': 
                case ']':  
                case ')':

                    //System.out.println("este es el valor de top " + top);
                    if(isEmpty()){ 
                        verify = false;
                    }         
                    else{
                        char characterX = pop();
                        if(characterX == '{' ||
                            characterX == '[' ||
                            characterX == '('){ 
                            //System.out.println("esto es lo que entro " + character);
                            verify = true;
                        }
                    }
                        
                    break;

                default:
                    break;
            }
        }
        System.out.println("verify vale " + verify);
        return verify;
    }

    public static void push(char c){
        arrayChars[++top] = c;
    }

    public static char pop(){
        return arrayChars[top--];
    }

    public static boolean isEmpty(){
        return top == -1;
    }
 
}
