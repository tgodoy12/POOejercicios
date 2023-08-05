package exercise13.service;

import exercise13.entidad.Curso;

import java.util.Scanner;


public class ServiceCurso {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    /**
     * método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
     * que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
     * en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
     * nombre de cada alumno.
     * @return alumnos
     */
    private String[] cargarAlumnos() {
        String alumnos[] = new String[5];

        for (int i=0; i<5; i++) {
            System.out.println("Nombre del alumno");
            alumnos[i] = scanner.next();
        }
        return alumnos;
    }


    /**
     * Método crearCurso(): el método crear curso, le pide los valores de los atributos al
     * usuario y después se le asignan a sus respectivos atributos para llenar el objeto
     * Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
     * al atributo alumnos
     * @return
     */
    public Curso crearCurso() {
        Curso newCurso = new Curso();
        System.out.println("Nombre de curso:");
        newCurso.setNombreCurso(scanner.next());

        System.out.println("Cantidad de horas por día:");
        newCurso.setCantidadHorasPorDia(scanner.nextInt());

        System.out.println("Cantidad de días por semana");
        newCurso.setCantidadDiasPorSemana(scanner.nextInt());

        System.out.println("Turno (tarde/noche):");
        newCurso.setTurno(scanner.next());
        while (!(newCurso.getTurno().equalsIgnoreCase("tarde")) && !(newCurso.getTurno().equalsIgnoreCase("noche"))) {
            System.out.println("Vuelva a ingresar turno");
            System.out.println("tarde / noche");
            newCurso.setTurno(scanner.next());
        }

        System.out.println("Precio por hora");
        newCurso.setPrecioPorHora(scanner.nextInt());

        //invocar método cargarAlumnos
        System.out.println("Alumnos");
        newCurso.setAlumnos(cargarAlumnos());

        return newCurso;
    }

    /**
     * Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
     * en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
     * día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
     * se repite el encuentro.
     * @param newCurso
     * @return precioXsemanaX5alumnos
     */

    public int calcularGananciaSemanal(Curso newCurso) {
        int ganancia = 0;
        int precioXdiaXalumno = newCurso.getCantidadHorasPorDia() * newCurso.getPrecioPorHora();
        int precioXsemanaX5alumnos = (precioXdiaXalumno * 5) * newCurso.getCantidadDiasPorSemana();

        System.out.println("Ganancia en una semana: $ " + precioXsemanaX5alumnos);

        return precioXsemanaX5alumnos;
    }
}
