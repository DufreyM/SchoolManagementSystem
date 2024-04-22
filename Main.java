public class Main {
    public static void main(String[] args) {
        GestorAcademico gestor = new GestorAcademico();

        // 2 instancias
        Estudiante estudiante1 = new Estudiante(1, "Juan", "Perez", "2004-05-10", Estudiante.Estado.Matriculado);
        Estudiante estudiante2 = new Estudiante(2, "María", "González", "2005-09-15", Estudiante.Estado.Matriculado);

        //2 instancias
        Curso curso1 = new Curso(101, "Programación Java", "Aprende Java desde cero", 3, "2020");
        Curso curso2 = new Curso(102, "Bases de Datos", "Introducción a las bases de datos", 4, "2021");

        
        gestor.agregarCurso(curso1);
        gestor.agregarCurso(curso2);

        gestor.matricularEstudiante(estudiante1);
        gestor.matricularEstudiante(estudiante2);

        // Mostrar los cursos disponibles
        System.out.println("Cursos disponibles:");
        for (Curso curso : gestor.getCursos()) {
            System.out.println(curso.getNombre());
        }
        
        System.out.println("Estudiantes:");
        for (Estudiante estudiante : gestor.getEstudiantes()) {
            System.out.println(estudiante.getNombre()+  " " + estudiante.getEdad());
        }
        // inscripción
        try {
            gestor.inscribirEstudianteCurso(estudiante1, curso1.getID());
            gestor.inscribirEstudianteCurso(estudiante2, curso1.getID());
        } catch (IllegalStateException e) {
            System.out.println("Error al inscribir estudiante: " + e.getMessage());
        }
    }
}
