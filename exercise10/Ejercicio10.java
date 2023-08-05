package exercise10;

import java.util.Arrays;

public class Ejercicio10 {
    /**
     * Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
     * de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
     * programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
     * Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
     * ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
     * 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
     * 20.
     * @param args
     */
    public static void main(String[] args) {
        //vector a[50] con valores random
        int f = 50;
        double a[] = new double[f];
        llenarVector(a, f);
        System.out.println(Arrays.toString(a));
        System.out.println("-----");

        //vector a[50] ordenado de menor a mayor
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("-----");

        //vector b[20]:
        //primeros 10 numeros copiados de los primeros 10 del vector a(previamente ordenados)
        //últimos 10 numeros con valor: 0.5
        int c = 20;
        double b[] = new double[c];
        llenarVectorB(b, c, a);
        System.out.println(Arrays.toString(b));


    }

    public static void llenarVector(double vector[], int f) {
        for (int i=0; i<f; i++) {
            vector[i] = (double) (Math.random() * 100);
        }
    }

    public static void llenarVectorB(double vectorB[], int c, double vectorA[]) {
        for (int i=0; i<c; i++) {
            if (i < 10) {
                vectorB[i] = vectorA[i];
            }else {
                vectorB[i] = 0.5;
            }
        }
    }

}
