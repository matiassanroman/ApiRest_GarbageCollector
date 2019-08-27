package com.example.garbage_collector.service;

import java.util.List;

import com.example.garbage_collector.model.Usuario;

public interface UsuarioService {
	
	Usuario register(Usuario u);
	Usuario findByName(Long name);
	Usuario findByUsername(String name);
	List<Usuario> getAllUsuario();

}
