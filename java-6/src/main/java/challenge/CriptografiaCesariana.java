package challenge;

import java.util.Objects;

public class CriptografiaCesariana implements Criptografia {

//    @Override
//    public String criptografar(String texto) {
//        testar(texto);
//        String text = texto.toLowerCase();
//        char[] arrayChar = text.toCharArray();
//        for (int i=0; i < arrayChar.length ;i++) {
//            arrayChar[i]= criptar(text.charAt(i), 3);
//        }
//       return  String.valueOf(arrayChar);
//    }
//
//    @Override
//    public String descriptografar(String texto) {
//        testar(texto);
//        String text = texto.toLowerCase();
//        char[] arrayChar = text.toCharArray();
//        for (int i=0; i < arrayChar.length ;i++) {
//            arrayChar[i]= decriptar(text.charAt(i), 3);
//        }
//        return  String.valueOf(arrayChar);
//
//
//    }
//
//    private char decriptar(char a, int key) {
//        if(validar(a)){
//            return valor((int)a - key);
//        }
//        return a;
//
//    }
//
//    private void testar (String texto){
//        if(texto.equals("")) throw new IllegalArgumentException("Valor vazio");
//        if(texto == null) throw new NullPointerException("Valor Nulo");
//    }
//
//
//    private boolean validar(char a){
//        if(a >= 'a' && a <= 'z')
//        return true ;
//        return false;
//    }
//
//
//
//    private char criptar (char a, int key){
//
//        if(validar(a)){
//            return valor((int)a + key);
//        }
//        return a;
//    }
//
//    private char valor(int i) {
//
//        if(i < 97) i+= 26;
//        if(i > 122) i-=26;
//
//        return (char) i;
//    }

    @Override
    public String criptografar(String texto) {
        invalidText(texto);

        char[] textToCharArray = texto.toLowerCase().toCharArray();
        char[] encryptedCharArray = new char[textToCharArray.length];

        for (int i = 0; i < textToCharArray.length; i++) {
            encryptedCharArray[i] = encryptWithShift(3, textToCharArray[i]);
        }

        return new String(encryptedCharArray);
    }

    @Override
    public String descriptografar(String texto) {
        invalidText(texto);

        char[] textToCharArray = texto.toLowerCase().toCharArray();
        char[] decryptedCharArray = new char[textToCharArray.length];

        for (int i = 0; i < textToCharArray.length; i++) {
            decryptedCharArray[i] += decryptWithShift(3, textToCharArray[i]);
        }

        return new String(decryptedCharArray);
    }

    private static char encryptWithShift(int shifts, int pos) {
        return !isLetter(pos) ? (char) pos : (char) ((pos) + shifts);
    }

    private static char decryptWithShift(int shifts, int pos) {
        return !isLetter(pos) ? (char) pos : (char) ((pos) - shifts);
    }

    private static boolean isLetter(Integer asciiPosition) {
        return Character.isLetter(asciiPosition);
    }

    private void invalidText(String text) {
        if (Objects.isNull(text)) {
            throw new NullPointerException();
        }

        if (text.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

}



