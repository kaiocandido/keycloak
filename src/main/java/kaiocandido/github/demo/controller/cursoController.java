package kaiocandido.github.demo.controller;

import kaiocandido.github.demo.model.Curso;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("cursos")
public class cursoController {

    @GetMapping("java")
    public ResponseEntity<Curso> cursoJava(){
        return ResponseEntity.ok(new Curso(UUID.randomUUID(), "Java"));
    }

    @GetMapping("spring-boot")
    public ResponseEntity<Curso> cursoSpringBoot(){
        return ResponseEntity.ok(new Curso(UUID.randomUUID(), "spring-boot"));
    }


    @GetMapping("exclusivos")
    public ResponseEntity<List<Curso>> cursoExclusivos(){
        Curso react = new Curso(UUID.randomUUID(), "react");
        Curso html = new Curso(UUID.randomUUID(), "html");
        Curso css = new Curso(UUID.randomUUID(), "css");
        return ResponseEntity.ok(List.of(react, html, css));
    }

    @GetMapping("gratuitos")
    public ResponseEntity<List<Curso>> cursoGratuitos(){
        Curso cursoBasicoLogica = new Curso(UUID.randomUUID(), "Logica de programação");
        Curso linux = new Curso(UUID.randomUUID(), "linux");
                return ResponseEntity.ok(List.of(cursoBasicoLogica, linux));
    }


}
