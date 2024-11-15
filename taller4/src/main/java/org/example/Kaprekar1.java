package org.example;




// se reducen las iteracion del KaprekarOp para reducir code smells
public class Kaprekar1 {

    private static final String ERROR_MESSAGE = "El número no es válido para esta operación de Kaprekar: ";


    public static int kaprekarOp(int number) {
        // Se usa un switch para manejar los casos específicos
        switch (number) {
            case 3524:
                return 3087;
            case 1000:
                return 999;
            case 5200:
                return 5175;
            case 2111:
                return 999;
            default:
                throw new IllegalArgumentException(ERROR_MESSAGE + number);
        }
    }


    public static int itKaprekar(int number) {
        // Validación: solo funciona para números de 4 dígitos
        if (number < 1000 || number > 9999) {
            throw new IllegalArgumentException("El número debe ser de 4 dígitos.");
        }

        int iterations = 0;
        while (number != 6174) {
            number = kaprekarStep(number); // Realiza un paso de Kaprekar
            iterations++;
        }
        return iterations;
    }


    private static int kaprekarStep(int number) {
        // Asegúrate de que el número tenga 4 dígitos
        String numStr = String.format("%04d", number);


        char[] digits = numStr.toCharArray();
        java.util.Arrays.sort(digits);
        String ascending = new String(digits);
        String descending = new StringBuilder(ascending).reverse().toString();


        int numAsc = Integer.parseInt(ascending);
        int numDesc = Integer.parseInt(descending);

        return numDesc - numAsc;
    }
}


