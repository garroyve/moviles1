package notasdeclases;

public class Variables {

    public static void main(String[] args) {

        // tipos de datos string, float, chart, byte, boolean, int, double, //
        // las variables de declarar y se inicializan//

        String nombre; // declarar una variable
        nombre="Pepito";// Inicializar una variable

        int id = 1216714114; // varibale declarada e inicializada

        // Scopo o ambito de las variables corresponde a si esta puede ser alcanzada por
        // todas las estructuras que componen la clase o si solo funciona

        String global = "Soy global";
        if (global.equals("Soy global")){
            System.out.println("Es una variable global");
            String local = "Pero yo no";
            System.out.println(local);
        }else{
            System.out.println("No es global");
        }
// las variable s del mismo tipo se pueden castear sin perdida de informacion
//
        byte numByte = 120;
        short numShort = (short)numByte;
        System.out.println(numShort);

        // parseo se da entre Strings y datos numericos

        String numDouble = "4.56";
        double numDecimal = Double.parseDouble(numDouble);

        System.out.println(numDecimal);

        double suma = numDecimal + 4.23;



    }
}

