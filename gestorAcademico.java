import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico implements ServiciosAcademicosI {
    private ArrayList<Estudiante> estudiantes;

    
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    private ArrayList<Curso> cursos; 
    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    private HashMap<Curso, ArrayList<Estudiante>> inscritos; 

    public GestorAcademico() {
        this.estudiantes = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.inscritos = new HashMap<>();
    }

    public void matricularEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
        System.out.println("Estudiante matriculado exitosamente: " + estudiante.getNombre() + " " + estudiante.getApellido());
    };

    public void agregarCurso(Curso curso){
        cursos.add(curso);
        System.out.println("Curso agregado existosamente");

    };

    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) {
        Curso cursoInscribir = null;
        for (Curso curso : cursos) {
            if (curso.getID() == idCurso) {
                cursoInscribir = curso;
                break;
            }
        }
    
        if (cursoInscribir != null) {
            if (!inscritos.containsKey(cursoInscribir)) {
                inscritos.put(cursoInscribir, new ArrayList<>());
            }
    
            if (!inscritos.get(cursoInscribir).contains(estudiante)) {
                inscritos.get(cursoInscribir).add(estudiante);
                System.out.println(estudiante.getNombre() + " inscrito en el curso " + cursoInscribir.getNombre());
            } else {
                throw new IllegalStateException(estudiante.getNombre() + " ya está inscrito en el curso " + cursoInscribir.getNombre());
            }
        } else {
            System.out.println("El curso con ID " + idCurso + " no existe.");
        }
    }

    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) {
        Curso cursoDesinscribir = null;
        for (Curso curso : cursos) {
            if (curso.getID() == idCurso) {
                cursoDesinscribir = curso;
                break;
            }
        }
    
        if (cursoDesinscribir != null) {
            if (inscritos.containsKey(cursoDesinscribir)) {
                Estudiante estudianteDesinscribir = null;
                for (Estudiante estudiante : inscritos.get(cursoDesinscribir)) {
                    if (estudiante.getID() == idEstudiante) {
                        estudianteDesinscribir = estudiante;
                        break;
                    }
                }
    
                if (estudianteDesinscribir != null) {
                    inscritos.get(cursoDesinscribir).remove(estudianteDesinscribir);
                    System.out.println(estudianteDesinscribir.getNombre() + " desinscrito del curso " + cursoDesinscribir.getNombre());
                } else {
                    throw new IllegalStateException("El estudiante con ID " + idEstudiante + " no está inscrito en el curso " + cursoDesinscribir.getNombre());
                }
            } else {
                System.out.println("No hay estudiantes inscritos en el curso " + cursoDesinscribir.getNombre());
            }
        } else {
            System.out.println("El curso con ID " + idCurso + " no existe.");
        }
    }
    
}
