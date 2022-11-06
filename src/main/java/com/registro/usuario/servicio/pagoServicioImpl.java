package com.registro.usuario.servicio;

import com.registro.usuario.modelo.PagoEntidad;
import com.registro.usuario.repositorio.pagoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  pagoServicioImpl implements pagoServicio {

	@Autowired
	private pagoRepositorio repositorio;

	@Override
	public List<PagoEntidad> listarTodosLosPagos() {
		return repositorio.findAll();
	}

	@Override
	public PagoEntidad guardarPago(PagoEntidad pago) {
		return repositorio.save(pago);
	}

	@Override
	public PagoEntidad obtenerPago(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public PagoEntidad actualizarPago(PagoEntidad pago) {
		return repositorio.save(pago);
	}

	@Override
	public void eliminarPago(Long id) {
		repositorio.deleteById(id);

	}

}
