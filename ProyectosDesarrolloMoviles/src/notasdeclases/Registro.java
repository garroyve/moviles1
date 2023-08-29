package notasdeclases;

import java.util.ArrayList;
import java.util.Scanner;

public class Registro {

    public static void main(String[] args) {
        ArrayList<String> usuario = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        String id = "1";
        usuario.add(id); // sirve para agregar datos a la lista
        System.out.println("ingrese su nombre ");
        String nombre = sc.next();
        usuario.add(nombre);
        String correo = "pepita@gmail.com";
        usuario.add(correo);
        String password = "12345";
        usuario.add(password);

        // para medir el tamaño del ArrayList size()

        System.out.println("el tamaño de la lista es " + usuario.size());

        // para obtener un tamaño de la lista usamos el metodo get

        System.out.println("nombre: " + usuario.get(1));

        // actualizar elemento de la lista

        usuario.set(3, "bvg123");

        // podemos quitar un elemto de la lista

        usuario.remove(2);

        // podemos buscar elemetos en la lista

        int index = usuario.indexOf("pepita");
        System.out.println(index);

        // Podemos validar si el ArrayList esta vacio

        System.out.println(usuario.isEmpty());

        // imprimir

        for (int i = 0; i< usuario.size(); i++){
            System.out.println("el dato " + i + " es : " + usuario.get(i));
        }

    }
}
