package ejerciciosdeclases;

import java.util.ArrayList;
import java.util.Scanner;

public class ingresos {
    public static void main(String[] args) {
        Ingresos();
    }
    public static void Ingresos () {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> ingresos = new ArrayList<Double>();
        ArrayList<Double> egresos = new ArrayList<Double>();
        double  suma = 0;
        double suma2 = 0;
        int contador = 0;
        System.out.println("cuantos ingresos quieres guardar");
        int val = sc.nextInt();

        while (contador < val){
            System.out.println("Ingresos");
            double valor = sc.nextDouble();
            if (valor > 0){
                ingresos.add(valor);
            }else{
                egresos.add(valor);
            }

            contador++;

        }
        for (int i = 0; i < ingresos.size(); i++){
            suma += ingresos.get(i);

        }
        System.out.println("los ingresos son: " + suma);

        for (int i = 0; i < egresos.size(); i++){
            suma2 += egresos.get(i);

        }
        System.out.println("los egresos son: " + suma2);

        double suma4 = (suma+suma2);
        System.out.println(suma4);
        System.out.println("el balance es : " + suma4);

    }

}
