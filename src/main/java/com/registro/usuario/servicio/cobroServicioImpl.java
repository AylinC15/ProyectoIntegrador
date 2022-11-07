package com.registro.usuario.servicio;

import com.registro.usuario.modelo.CobroEntidad;
import com.registro.usuario.repositorio.cobroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cobroServicioImpl implements cobroServicio {

	@Autowired
	private cobroRepositorio repositorio;

	@Override
	public List<CobroEntidad> listarTodosLosCobros() {
		return repositorio.findAll();
	}

	@Override
	public CobroEntidad guardarCobro(CobroEntidad cobro) { return repositorio.save(cobro);
	}

	@Override
	public CobroEntidad obtenerCobro(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public CobroEntidad actualizarCobro(CobroEntidad cobro) {
		return repositorio.save(cobro);
	}

	@Override
	public void eliminarCobro(Long id) {
		repositorio.deleteById(id);

	}

}
