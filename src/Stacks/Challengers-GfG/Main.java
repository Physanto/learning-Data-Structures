public class Main {
    static char[] arrayChars = new char[50];
    static int top = -1;

    public static void main(String[] args){
        isParenthesisBalanced(")]]())}{[})})");
    }
    static boolean isParenthesisBalanced(String s) {
                
        char[] charSequence = s.toCharArray();
        byte cont = 0;
        byte verify = 0;

        for(int i = 0; i < charSequence.length; i++){

            char character = charSequence[i];

            switch(character){

                case '{':
                case '[':
                case '(':
                    push(character);
                    cont++;
                    break;

                case '}':
                case ']':
                case ')':
                    if(cont != 0){
                        char characterX = pop();
                        if(character == '}' && characterX == '{' ||
                            character == ']' && characterX == '[' ||
                            character == ')' && characterX == '(' ){
                            verify++;
                        }
                    } 
                    break;

                default:
                    break;
            }

        }
        if(verify >= 1 && cont == verify){
            System.out.println("correcto");
            return true;
        }
        return false;
    }

    public static void push(char c){
        arrayChars[++top] = c;
    }

    public static char pop(){
        if(top != -1){
            return arrayChars[top--];
        }
        return 'a';
    }
 
}
