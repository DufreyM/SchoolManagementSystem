import java.time.LocalDate;
import java.time.Period;

public class Estudiante extends Persona{
    private int ID;
    public Estado estado;

    public enum Estado{
        Matriculado,
        Inactivo,
        Graduado
    }
    public Estudiante(int ID, String nombre, String apellido, String fechaDeNacimiento, Estado estado) {
        super(nombre, apellido, fechaDeNacimiento);
        this.ID = ID;
        this.estado = estado;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    //Utilice los paquetes de java para obtener la fecha actual y restarla para obtener la edad que tenga el estudiante en el momento que se corra el programa
    //Esto forza a escribir la fecha de nacimiento con un formato específico
    public int getEdad() {
        LocalDate fechaNacimiento = LocalDate.parse(getFechaDeNacimiento());
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();
    }
}
