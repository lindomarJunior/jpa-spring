package br.com.jpaspring.api.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jpaspring.api.entity.Curso;
import br.com.jpaspring.api.entity.Materia;
import br.com.jpaspring.api.repositories.CursoRepository;
import br.com.jpaspring.api.repositories.MateriaRepository;

@RestController
@RequestMapping("/curso")
public class CursoController {
	
	@Autowired
	CursoRepository cursoRepository;	
	@Autowired
	MateriaRepository materiaRepository;
	
	@Transactional
	@GetMapping("/carga")
	public void cargaCurso() {
		
		Curso curso = new Curso();
		curso.setNome("Jpa Curso");	
		
		cursoRepository.save(curso);
		
		Materia materia1 = new Materia();
		materia1.setTitulo("materia jpa 1");
		materia1.setCurso(curso);
		
		Materia materia2 = new Materia();
		materia2.setTitulo("materia jpa 2");
		materia2.setCurso(curso);
		
		materiaRepository.save(materia1);
		materiaRepository.save(materia2);
				
	}
	
	@GetMapping
	public List<Curso> listarCurso(){	
		List<Curso> cursos = cursoRepository.findAll();
		return cursos;
	}
}
