
package com.example._EjercicioEstudiante.service;

import com.example._EjercicioEstudiante.model.Curso;
import com.example._EjercicioEstudiante.repository.ICursoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements ICursoService {
    
    @Autowired
    private ICursoRepository icr;

    @Override
    public List<Curso> getCursos() {
        return icr.findAll();
    }

    @Override
    public Curso findCurso(Long id) {
        return icr.findById(id).orElse(null);
       
    }
    
    @Override
    public void saveCurso(Curso curso) {
        icr.save(curso);
    }

    @Override
    public void deleteCurso(Long id) {
        icr.deleteById(id);
    }

    @Override
    public void editCurso(Curso curso) {
        this.saveCurso(curso);
    }

    
    
}
