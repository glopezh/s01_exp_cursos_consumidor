package com.cjava.demo.controllers;

import com.cjava.demo.model.Curso;
import com.cjava.demo.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CursoController {

    @Qualifier("cursoServiceFeign")
    @Autowired
    CursoService cursoService;

    @GetMapping("/cursos")
    public List<Curso> getCursos(){
        return cursoService.listar();
    }

}
