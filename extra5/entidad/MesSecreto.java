package extra5.entidad;

import java.util.Arrays;

/**
 * Crea una clase en Java donde declares una variable de tipo array de Strings que
 * contenga los doce meses del año, en minúsculas. A continuación, declara una variable
 * mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
 * mesSecreto = mes[9].
 */

public class MesSecreto {
    private String[] mesesAnio;
    private String mesSecreto;

    // preguntar sobre buenas practicas al declarar atributos.

    //constructores
    public MesSecreto() {
    }

    public MesSecreto(String[] mesesAnio, String mesSecreto) {
        this.mesesAnio = mesesAnio;
        this.mesSecreto = mesSecreto;
    }

    //getters&setters
    public String[] getMesesAnio() {
        return mesesAnio;
    }

    public void setMesesAnio(String[] mesesAnio) {
        this.mesesAnio = mesesAnio;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    //toString
    @Override
    public String toString() {
        return "MesSecreto{" +
                "mesesAnio=" + Arrays.toString(mesesAnio) +
                ", mesSecreto='" + mesSecreto + '\'' +
                '}';
    }


}
