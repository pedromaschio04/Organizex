package com.pedrohpmaschio.organizex.controllers;
import java.util.List;
import java.util.Optional;

import com.pedrohpmaschio.organizex.repositories.UsuarioRepository;
import com.pedrohpmaschio.organizex.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("usuarios")
    public List<Usuario> getAll(){
        return usuarioRepository.findAll();
    }
    @GetMapping("usuario/{id}")
    public Usuario getById(@PathVariable Long id){
        return usuarioRepository.findById(id).get();
    }

    @PostMapping("usuario/novo")
    public void cadastrarUsuario(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }
}