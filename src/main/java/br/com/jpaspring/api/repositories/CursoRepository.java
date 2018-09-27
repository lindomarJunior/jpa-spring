package br.com.jpaspring.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.jpaspring.api.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
