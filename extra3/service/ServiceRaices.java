package extra3.service;

import extra3.entidad.Raices;

/**
 * Método getDiscriminante(): devuelve el valor del discriminante (double). El
 * discriminante tiene la siguiente formula: (b^2)-4*a*c
 *  Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
 * que esto ocurra, el discriminante debe ser mayor o igual que 0.
 *  Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
 * que esto ocurra, el discriminante debe ser igual que 0.
 *  Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
 * posibles soluciones.
 *  Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
 * Es en el caso en que se tenga una única solución posible.
 *  Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
 * pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
 * obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
 * de no existir solución, se mostrará un mensaje.
 *
 * Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
 * delante de -b
 */

public class ServiceRaices {
    public Raices crearRaiz(int a, int b, int c) {
        return new Raices(a, b, c);
    }

    public double getDiscriminate(Raices raiz) {
        double discriminate = (Math.pow(raiz.getB(), 2))-4* raiz.getA()* raiz.getC();

        return discriminate;
    }

    public boolean tieneRaices(Raices raiz) {
        boolean tieneRaices = false;

        if (getDiscriminate(raiz)>0) {
            tieneRaices = true;
        }
        System.out.println(tieneRaices);
        return tieneRaices;
    }

    public boolean tieneRaiz(Raices raiz) {
        boolean tieneRaiz = false;

        if (getDiscriminate(raiz)==0) {
            tieneRaiz = true;
        }
        System.out.println(tieneRaiz);
        return tieneRaiz;
    }

    /**
     * Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
     * posibles soluciones.
     */
    public void obtenerRaices(Raices raiz) {
        boolean tieneRaices = tieneRaices(raiz);
        if (tieneRaices) {
            double resultado1 = (-raiz.getB() + (Math.sqrt(getDiscriminate(raiz)))) / (2* raiz.getA());
            System.out.println(resultado1);

            double resultado2 = (-raiz.getB() - (Math.sqrt(getDiscriminate(raiz)))) / (2* raiz.getA());
            System.out.println(resultado2);

        }
    }

    /**
     * Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
     * Es en el caso en que se tenga una única solución posible.
     */
    public void obtenerRaiz(Raices raiz) {
        boolean tieneRaiz = tieneRaiz(raiz);
        if (tieneRaiz) {
            double resultado1 = (-raiz.getB() + (Math.sqrt(getDiscriminate(raiz)))) / (2* raiz.getA());
            System.out.println(resultado1);
        }
    }

    /**
     * Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
     *  * pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
     *  * obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
     *  * de no existir solución, se mostrará un mensaje.
     */

    public void calcular(Raices raiz) {
        boolean tieneRaices = tieneRaices(raiz);
        boolean tieneRaiz = tieneRaiz(raiz);
        obtenerRaices(raiz);
        obtenerRaiz(raiz);

    }







}
