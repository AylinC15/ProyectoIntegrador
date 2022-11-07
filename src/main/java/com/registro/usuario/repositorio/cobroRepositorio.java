package com.registro.usuario.repositorio;

import com.registro.usuario.modelo.CobroEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cobroRepositorio extends JpaRepository<CobroEntidad, Long>{

}
