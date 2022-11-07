package com.registro.usuario.controlador;

import com.registro.usuario.modelo.CobroEntidad;
import com.registro.usuario.servicio.cobroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@Controller
public class cobroControlador {

	@Autowired
	private cobroServicio servicio;

	@GetMapping({ "/cobros" })
	public String listarcobros(Model modelo) {
		modelo.addAttribute("cobros", servicio.listarTodosLosCobros());
		return "cobros";
	}

	@GetMapping("/cobros/nuevo")
	public String mostrarFormularioDeRegistrtarCobro(Model modelo) {
		CobroEntidad cobroEntidadOp = new CobroEntidad();
		modelo.addAttribute("cobros", cobroEntidadOp);
		return "crear_cobros";
	}

	@PostMapping("/cobros")
	public String guardarCobro(@ModelAttribute("cobros") CobroEntidad CobroEntidad) {
		servicio.guardarCobro(CobroEntidad);
		return "redirect:/cobros";
	}

	@GetMapping("/cobros/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("cobros", servicio.obtenerCobro(id));
		return "editar_Monto";
	}

	@PostMapping("/cobros/{id}")
	public String actualizarCobro(@PathVariable Long id, @ModelAttribute("cobros") CobroEntidad CobroEntidad,
			Model modelo) {
		CobroEntidad cobroExistente = servicio.obtenerCobro(id);
		cobroExistente.setId(id);
		cobroExistente.setNombre(CobroEntidad.getNombre());
		cobroExistente.setTotalcobro(CobroEntidad.getTotalcobro());
		cobroExistente.setruc(CobroEntidad.getRuc());

		String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
		java.sql.Timestamp  timestamp = java.sql.Timestamp.valueOf(timeStamp);

		cobroExistente.setFecha(timestamp);

		servicio.actualizarCobro(cobroExistente);
		return "redirect:/cobros";
	}

	@GetMapping("/CobroEntidad/{id}")
	public String eliminarEstudiante(@PathVariable Long id) {
		servicio.eliminarCobro(id);
		return "redirect:/cobros";
	}
}
