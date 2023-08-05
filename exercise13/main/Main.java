package exercise13.main;

import exercise13.entidad.Curso;
import exercise13.service.ServiceCurso;


public class Main {
    public static void main(String[] args) {
        ServiceCurso servCurso = new ServiceCurso();
        Curso newCurso = servCurso.crearCurso();
        System.out.println(newCurso.toString());
        System.out.println("----");

        int ganancia = servCurso.calcularGananciaSemanal(newCurso);

    }
}
