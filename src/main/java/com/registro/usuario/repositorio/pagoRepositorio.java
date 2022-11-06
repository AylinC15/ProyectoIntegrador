package com.registro.usuario.repositorio;

import com.registro.usuario.modelo.PagoEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface pagoRepositorio extends JpaRepository<PagoEntidad, Long>{

}
