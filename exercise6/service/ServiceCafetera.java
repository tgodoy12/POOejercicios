package exercise6.service;

import exercise6.entidad.Cafetera;

import java.util.Scanner;


public class ServiceCafetera {
    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    /**
     * Método para crear objeto de la clase Cafetera
     * @return newCafetera
     */
    public Cafetera contruirCafetera() {
        Cafetera newCafetera = new Cafetera();

        System.out.println("Indicar capacidad máxima de café en gramos");
        newCafetera.setCapacidadMaxima(scanner.nextInt());

        return newCafetera;
    }

    /**
     * Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
     * máxima.
     * @param newCafetera
     */
    public void llenarCafetera(Cafetera newCafetera) {
        newCafetera.setCantidadActual(newCafetera.getCapacidadMaxima());

        System.out.println("Se ha llenado la cafetera.");
        System.out.println("La cantidad actual es de " + newCafetera.getCantidadActual());
    }

    /**
     * Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
     * tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
     * cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
     * método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
     * cuanto quedó la taza.
     * @param newCafetera
     *
     * Adiciones:
     * Dos tamaños de taza: Chica(10g café) o grande(20g café).
     * El usuario primero debe elegir si quiere taza chica o grande. A partir de allí, los valores predeterminados,
     * se modificarán según la capacidad de la taza indicada.
     */
    public void servirTaza(Cafetera newCafetera) {
        int tazaGrande = 20;
        int tazaChica = 10;
        int tazaIncompleta = 0;

        System.out.println("Seleccione el tamaño de la taza");
        System.out.println("------");
        System.out.println("1: taza chica");
        System.out.println("2: taza grande");
        int tamanio = scanner.nextInt();

        while (tamanio != 1 && tamanio !=2) {
            System.out.println("El valor ingresado no es correcto. Vuelva a intentar");
            System.out.println("------");
            System.out.println("Seleccione el tamaño de la taza");
            System.out.println("------");
            System.out.println("1: taza chica");
            System.out.println("2: taza grande");
            tamanio = scanner.nextInt();
        }

        switch (tamanio) {
            case 1:
                if (newCafetera.getCantidadActual() < tazaChica) {
                    tazaIncompleta = (newCafetera.getCantidadActual() * 100) / tazaChica; //obtener el % en el que se va a llenar la taza
                    newCafetera.setCantidadActual(0); // vuelve a 0, porque utilizará lo ultimo que tenga, y evitará valer un num negativo
                    System.out.println("No se llenó la taza debida a que la cantidad actual es menor al tamaño de la taza elegida");
                    System.out.println("La taza se llenó un: " + tazaIncompleta + " %");
                } else {
                    newCafetera.setCantidadActual(newCafetera.getCantidadActual() - tazaChica);
                }
                break;
            case 2:
                if (newCafetera.getCantidadActual() < tazaGrande) {
                    tazaIncompleta = (newCafetera.getCantidadActual() * 100) / tazaGrande;
                    newCafetera.setCantidadActual(0);
                    System.out.println("No se llenó la taza debido a que la cantidad actual es menor al tamaño de la taza elegida");
                    System.out.println("La taza se llenó un: " + tazaIncompleta + " %");
                } else {
                    newCafetera.setCantidadActual(newCafetera.getCantidadActual() - tazaGrande);
                    break;
                }
        }
    }

    /**
     * Método vaciarCafetera(): pone la cantidad de café actual en cero.
     * @param newCafetera
     */
    public void vaciarCafetera(Cafetera newCafetera) {
        newCafetera.setCantidadActual(0);
        System.out.println("Cantidad actual: " + newCafetera.getCantidadActual());
    }

    /**
     * Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
     * recibe y se añade a la cafetera la cantidad de café indicada.
     * @param newCafetera
     */
    public void agregarCafe(Cafetera newCafetera) {
        System.out.println("Ingresar los gr de café que desea agregar");
        int cantCafe = scanner.nextInt();
        int opcion = 0;

        while ((newCafetera.getCapacidadMaxima() - newCafetera.getCantidadActual()) < cantCafe) {
            System.out.println("La cantidad de café que desea agregar supera la cantidad máxima permitida.");
            System.out.println("Usted puede agregar hasta: " + (newCafetera.getCapacidadMaxima()-newCafetera.getCantidadActual()));
            System.out.println("-----");
            System.out.println("Elija una opción para continuar");
            System.out.println("1: Volver a intentar");
            System.out.println("2: Salir");
            System.out.println("-----");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese cantidad de café en gramos");
                    cantCafe = scanner.nextInt();
                    break;  //cantCafe vuelve a 0 para poder salir del bucle. Se ejecutan las sentencias que setean la cantidad
                                    //actual, pero no cambia su valor: cantidadActual + 0 = cantidadActual
                default:
                    cantCafe = 0;
                    break;
            }
        }
        if (((newCafetera.getCapacidadMaxima() - newCafetera.getCantidadActual()) > cantCafe)) {
            newCafetera.setCantidadActual(newCafetera.getCantidadActual()+cantCafe);
            System.out.println("Cantidad Actual: " + newCafetera.getCantidadActual());
        }
    }





}
