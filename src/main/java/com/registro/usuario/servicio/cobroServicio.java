package com.registro.usuario.servicio;


import com.registro.usuario.modelo.CobroEntidad;

import java.util.List;

public interface cobroServicio {

	public List<CobroEntidad> listarTodosLosCobros();
	
	public CobroEntidad guardarCobro(CobroEntidad cobro);
	
	public CobroEntidad obtenerCobro(Long id);
	
	public CobroEntidad actualizarCobro(CobroEntidad cobro);
	
	public void eliminarCobro(Long id);
}
