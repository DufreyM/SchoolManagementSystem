import java.util.ArrayList;
import java.util.HashMap;

public class gestorAcademico {
    private ArrayList<Estudiante> estudiantes; 
    private ArrayList<Curso> cursos; 
    private HashMap<Curso, ArrayList<Estudiante>> inscritos; 

    public gestorAcademico() {
        this.estudiantes = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.inscritos = new HashMap<>();
    }
}
