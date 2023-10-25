
package com.example._EjercicioEstudiante.controller;

import com.example._EjercicioEstudiante.model.Curso;
import com.example._EjercicioEstudiante.service.ICursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    @Autowired
    private ICursoService ics;
    
    
    @GetMapping("/cursos/traer")
    public List<Curso> getCursos() {
        return ics.getCursos();
    }
    
    @GetMapping("/cursos/traer/{id}")
    public Curso findCurso(@PathVariable Long id) {
        return ics.findCurso(id);
    }
    
    @PostMapping("/cursos/crear")
    public String saveCurso(@RequestBody Curso curso) {
        ics.saveCurso(curso);
        return "Curso creado exitosamente";
    }
    
    @DeleteMapping ("/cursos/eliminar/{id}")
    public String deleteCurso(@PathVariable Long id) {
        ics.deleteCurso(id);
        return "Curso borrado";
    }
    
    @PutMapping ("/cursos/edit")
    public Curso editCurso(@RequestBody Curso curso) {
         ics.editCurso(curso);
         return ics.findCurso(curso.getId_curso());
    }
}
