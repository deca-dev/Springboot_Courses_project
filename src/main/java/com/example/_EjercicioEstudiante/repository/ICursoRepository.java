
package com.example._EjercicioEstudiante.repository;

import com.example._EjercicioEstudiante.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long> {
    
}
