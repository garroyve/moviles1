package ejerciciosdeclases;

import java.util.ArrayList;
import java.util.Scanner;

public class ingresos {
    public static void main(String[] args) {
        Ingresos();
    }
    public static void Ingresos () {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> valores = new ArrayList<Double>();
        double suma = 0;
        int contador = 0;
        System.out.println("cuantos valores quieres guardar");
        int val = sc.nextInt();

        while (contador < val){
            System.out.println("ingresar valores");
            double valor = sc.nextDouble();
            valores.add(valor);
            contador++;

        }
        for (int i = 0; i < valores.size(); i++){
            suma += valores.get(i);

        }
        System.out.println(suma);

    }
}
