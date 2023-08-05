package exercise6.main;

import exercise6.entidad.Cafetera;
import exercise6.service.ServiceCafetera;

public class Main {
    public static void main(String[] args) {
        ServiceCafetera servCafetera = new ServiceCafetera();
        Cafetera newCafetera = servCafetera.contruirCafetera();
        System.out.println(newCafetera.toString());
        System.out.println("-----------------");

        //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
        servCafetera.llenarCafetera(newCafetera);
        //metodo toString para mostrar los cambios
        System.out.println(newCafetera.toString());
        System.out.println("-----------------");

        //Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
        //tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
        //cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
        //método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
        //cuanto quedó la taza.
        servCafetera.servirTaza(newCafetera);
        System.out.println("-----------------");
        System.out.println(newCafetera.toString());

        //Método vaciarCafetera(): pone la cantidad de café actual en cero.
        servCafetera.vaciarCafetera(newCafetera);

        //Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
        //recibe y se añade a la cafetera la cantidad de café indicada.
        servCafetera.agregarCafe(newCafetera);
    }
}
