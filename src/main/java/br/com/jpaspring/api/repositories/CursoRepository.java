package br.com.jpaspring.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.jpaspring.api.entity.CursoEntity;

public interface CursoRepository extends JpaRepository<CursoEntity, Long> {

}
