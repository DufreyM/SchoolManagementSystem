public class Curso {
    public String ID;
    public String nombre;
    public String descripcion;
    
    public int numeroCreditos; 
    public String version;
    
    public Curso(String ID, String nombre, String descripcion, int numeroCreditos, String version){
        this.ID = ID; 
        this.nombre = nombre; 
        this.descripcion = descripcion; 
        this.numeroCreditos = numeroCreditos; 
        this.version = version; 
    }
}
