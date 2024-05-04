package com.pedrohpmaschio.organizex.controllers;

import com.pedrohpmaschio.organizex.repositories.TarefaRepository;
import org.checkerframework.framework.qual.PostconditionAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pedrohpmaschio.organizex.entities.Tarefa;
import java.util.List;

@RestController
public class TarefaController {
    @Autowired
    private TarefaRepository tarefaRepository;

    @RequestMapping("tarefas")
    public List<Tarefa> listarTodasTarefas(){
        return tarefaRepository.findAll();
    }
    @RequestMapping("tarefa/{id}")
    public Tarefa listarTarefa(@PathVariable Long id){
        return tarefaRepository.findById(id).get();
    }

    @PostMapping("tarefa/nova")
    public void registrarTarefa(@RequestBody Tarefa tarefa){
        tarefaRepository.save(tarefa);
    }
}
