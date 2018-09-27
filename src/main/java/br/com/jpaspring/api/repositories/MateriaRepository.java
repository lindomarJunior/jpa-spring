package br.com.jpaspring.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jpaspring.api.entity.Materia;

public interface MateriaRepository extends JpaRepository<Materia, Long> {

}
