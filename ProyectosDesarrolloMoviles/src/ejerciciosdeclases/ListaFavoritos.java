package ejerciciosdeclases;

import java.util.ArrayList;
import java.util.Scanner;
public class ListaFavoritos {

    public static void main(String[] args) {
      AgregarItem();



    }

    public static void AgregarItem () {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        System.out.println("cuantas actividades quiere ingresar");
        int fav = sc.nextInt();
        ArrayList<String> favoritos = new ArrayList<String>();


        while (cont < fav){
            System.out.println("ingrese su actividad favorita ");
            String actividad = sc.next();
            favoritos.add(actividad);
            cont = cont +1;
        }
        for (int i = 0; i <favoritos.size(); i++){
            System.out.println("la actividad " + i + " es: " + favoritos.get(i));
        }

    }
}
