package notasdeclases;

public class Operadores {
    public static void main(String[] args) {
        int sumaInterna = 4 + 5;
        int operacion = (4+3*5)*((10-2)/2)/4+3;
        System.out.println(sumaInterna);
        System.out.println(operacion);
        boolean compNum = 4>5;
        boolean comcomp = 3>2 || 4!=5;
        boolean comcomp2 = false && true;
        int edad = 18;
       // edad = edad + 1;

        edad += 1;
        System.out.println(compNum);
        System.out.println(comcomp);
        System.out.println(comcomp2);
        System.out.println(edad);

    }
}
