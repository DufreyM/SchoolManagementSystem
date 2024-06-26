public class Curso {
    public int ID;
    public String nombre;
    public String descripcion;
    public int numeroCreditos; 
    public String version;
    
    public Curso(int ID, String nombre, String descripcion, int numeroCreditos, String version){
        this.ID = ID; 
        this.nombre = nombre; 
        this.descripcion = descripcion; 
        this.numeroCreditos = numeroCreditos; 
        this.version = version; 
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
