package com.registro.usuario.repositorio;

import com.registro.usuario.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepositorio extends JpaRepository<Cliente,Long> {
}
