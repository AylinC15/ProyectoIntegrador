package com.registro.usuario.servicio;

import com.registro.usuario.modelo.PagoEntidad;


import java.util.List;

public interface pagoServicio {

	public List<PagoEntidad> listarTodosLosPagos();
	
	public PagoEntidad guardarPago(PagoEntidad pago);
	
	public PagoEntidad obtenerPago(Long id);
	
	public PagoEntidad actualizarPago(PagoEntidad pago);
	
	public void eliminarPago(Long id);


}
