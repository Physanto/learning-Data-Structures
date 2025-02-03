package Arrays;

import Arrays.Exercises.SumElements;

public class CaesarCipherOriginal {

    private static final int SIZE = 26;
    private char[] encoder = new char[SIZE];
    public char[] decoder  = new char[SIZE];;

    public CaesarCipherOriginal(int rotation){
        
        for (int i = 0; i < SIZE; i++) { 
            encoder[i] = (char) ('A' + (i + rotation) % SIZE);
            decoder[i] = (char) ('A' + (i - rotation + SIZE) % SIZE);
        }
    }

    public String messageEncrypt(String message){
        return transform(message, encoder);
    }
    
    public String messageDecrypt(String message){
        return transform(message, decoder);
    }

    public String transform(String message, char[] data){
        
        char[] messageArray = message.toCharArray();

        for (int i = 0; i < messageArray.length; i++) {

            if(Character.isUpperCase(messageArray[i])){

                int j = messageArray[i] - 'A';
                messageArray[i] = data[j];
            }
        }
        return new String(messageArray);
    }

    public void printEncoder(){
        for (char c : encoder) {
            System.out.print(c + ", ");
        }
    }

    public void printDecoder(){
        for (char c : decoder) {
            System.out.print(c + ", ");
        }
    }

    public static void main(String[] args){
        
        SumElements sumElements = new SumElements();
        sumElements.in
        CaesarCipherOriginal caesarCipherOriginal = new CaesarCipherOriginal(3);
        
        System.out.println(caesarCipherOriginal.messageEncrypt("MANUEL"));
        caesarCipherOriginal.printEncoder();
        System.out.println("\n\n\n");
        caesarCipherOriginal.printDecoder();
    }
}
