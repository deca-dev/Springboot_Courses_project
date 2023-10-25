
package com.example._EjercicioEstudiante.service;

import com.example._EjercicioEstudiante.model.Curso;
import java.util.List;


public interface ICursoService {
    public List<Curso> getCursos();
    public Curso findCurso(Long id);
    public void saveCurso(Curso curso);
    public void deleteCurso(Long id);
    public void editCurso(Curso curso);
}
