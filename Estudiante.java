public class Estudiante {
    private int ID;
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;

    private Estado estado;
    private enum Estado{
        Matriculado,
        Inactivo,
        Graduado
    }
    public Estudiante(int ID, String nombre, String apellido, String fechaDeNacimiento, Estado estado) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estado = estado;
    }

}
