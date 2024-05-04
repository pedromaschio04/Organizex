package com.pedrohpmaschio.organizex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pedrohpmaschio.organizex.entities.Usuario;
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
