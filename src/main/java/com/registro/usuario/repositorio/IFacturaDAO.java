package com.registro.usuario.repositorio;

import com.registro.usuario.modelo.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacturaDAO extends JpaRepository<Factura, Long> {
}
