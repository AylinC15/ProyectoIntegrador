package com.registro.usuario.servicio;

import com.registro.usuario.dto.UsuarioRegistroDTO;
import com.registro.usuario.modelo.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UsuarioServicio extends UserDetailsService {

    public Usuario guardar(UsuarioRegistroDTO registroDTO);

    public List<Usuario> listarUsuarios();


}
