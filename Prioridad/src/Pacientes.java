import java.util.PrimitiveIterator;

public class Pacientes implements Comparable<Pacientes> {
    private int prioridad;
    private String sintomas;
    private String nombre;

    public Pacientes(int prioridad, String sintomas, String nombre) {
        this.prioridad = prioridad;
        this.sintomas = sintomas;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    @Override
    public int compareTo(Pacientes o) {
        if(this.prioridad<o.prioridad){
            return -1;
        }else
            return 1;
    }
}
