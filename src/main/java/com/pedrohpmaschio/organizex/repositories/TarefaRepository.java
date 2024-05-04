package com.pedrohpmaschio.organizex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pedrohpmaschio.organizex.entities.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
