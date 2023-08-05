package exercise9.serviceMatematica;

import exercise9.entidad.Matematica;

/**
 *
 * c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
 * Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class ServiceMatematica {
    /**
     * Metodo para instanciar la clase Matemática
     * @return newMat
     */
    public Matematica crearMatematica() {
        Matematica newMat = new Matematica((double) (Math.random() * 100), (double) (Math.random() * 100));

        return newMat;
    }

    /**
     * Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
     * @param
     * @return
     */
    public static double devolverMayor(double num1, double num2) {
        //System.out.println("El número mayor es: " + Math.max(newMat.getNum1(), newMat.getNum2()));
        return Math.max(num1, num2);
    }

    /**
     * Método calcularPotencia() para calcular la potencia del mayor valor de la clase
     * elevado al menor número. Previamente se deben redondear ambos valores.
     * @param newMat
     * @return potencia
     */
    public int calcularPotencia(Matematica newMat) {
        int num1 = (int) Math.round(newMat.getNum1());
        int num2 = (int) Math.round(newMat.getNum2());
        int potencia = (int) Math.pow(num1, num2);

        System.out.println(num1 + "^" + num2 + " = " + potencia);

        return potencia;
    }

    /**
     * Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
     * Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
     * @param newMat
     * @return raiz
     */
    public double calcularRaiz(Matematica newMat) {
        double num = Math.abs(Math.min(newMat.getNum1(), newMat.getNum2()));
        double raiz = Math.sqrt(num);

        System.out.println("Raíz cuadrada de " + num + " = " + raiz);

        return raiz;
    }

}
