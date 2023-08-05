package extraGrupal1.service;

import extraGrupal1.entidad.Alquiler;
import extraGrupal1.entidad.Pelicula;

import java.time.LocalDate;
import java.time.Period;

public class ServicioAlquiler {
    public Alquiler alquilarPelicula(Pelicula newPelicula, LocalDate fechaInicio) {
        if (!newPelicula.isAlquilada()) {
            newPelicula.setAlquilada(true);
            System.out.println(newPelicula.getTitulo() + " ha sido alquilada");
            return new Alquiler(newPelicula, fechaInicio);

        } else{
            System.out.println("Ups! sorry rey");
            return null;
        }
    }

    public void devolverAlquiler(Alquiler alquiler, LocalDate fechaDev) {
        alquiler.getPeliAlquilada().setAlquilada(false);
        alquiler.setFechaFin(fechaDev);

        int diferencia = Period.between(alquiler.getFechaInicio(), alquiler.getFechaFin()).getDays();
        if (diferencia > 3) {
            double interes = (10*((0.1)* (diferencia - 3)));
            alquiler.setPrecio(10 + interes);
        } else {
            alquiler.setPrecio(10);
        }

        System.out.println("El precio es: " + alquiler.getPrecio());
    }

    public void listaAlquileres(Alquiler[] newAlquiler) {

        for (int i=0; i< newAlquiler.length; i++) {
            if (newAlquiler[i] != null && newAlquiler[i].getPeliAlquilada().isAlquilada()) {
                System.out.println(newAlquiler[i].getPeliAlquilada().getTitulo());
            }
        }
    }

    public void mostrarAlquilerFecha(Alquiler[] newAlquiler, LocalDate fecha) {
        boolean flag = false;
        for (int i=0; i< newAlquiler.length; i++) {
            if (newAlquiler[i] != null && newAlquiler[i].getFechaInicio().isEqual(fecha)) {
                System.out.println(newAlquiler[i].getPeliAlquilada().getTitulo());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("No coinciden las fechas");
        }
    }

    //falta hacer el total recaudado





}
