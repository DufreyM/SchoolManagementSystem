public interface ServiciosAcademicosI {
    public void matricularEstudiante(Estudiante estudiante);

    public void agregarCurso(Curso curso);

    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso); 

    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso); 
}
