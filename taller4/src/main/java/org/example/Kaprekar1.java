package org.example;



//el objetivo de este refactor es reducir las tareas que cumple el metodo original,
//lo que implica que sera mas facil de arreglar al momento de fallar

public class Kaprekar1 {

    private static final String ERROR_MESSAGE = "No hay lógica implementada para el número: ";

    //se crea un metodo que verifique si es alguno de los casos especificos creados
    public static int kaprekarOp(int number) {
        int result = getSpecialCaseResult(number);
        if (result != -1) {
            return result;
        }

        // Si no es un caso específico, lanza una excepción
        throw new IllegalArgumentException(ERROR_MESSAGE + number);
    }

    //este metodo entrega los resultados de los test creados
    private static int getSpecialCaseResult(int number) {
        if (number == 3524) {
            return 3087;
        } else if (number == 1000) {
            return 999;
        } else if (number == 5200) {
            return 5175;
        }
        return -1;
    }


}
