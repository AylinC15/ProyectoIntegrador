package com.registro.usuario.controlador;

import com.registro.usuario.modelo.Factura;
import com.registro.usuario.servicio.IFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class FacturaController {

    @Autowired
    private IFacturaService facturaService;

    @GetMapping("/factura")
    public String listarfactura(Model modelo){
        modelo.addAttribute("facturar", facturaService.listAll());
        return "facturas";
    }

    @GetMapping("/factura/nuevo")
    public String mostrarFormularioDeRegistrtarFactura(Model modelo){
        Factura registrarFac = new Factura();
        modelo.addAttribute("facturar", registrarFac);
        return "crear_facturas";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("facturar") Factura factura){
        facturaService.save(factura);
        return "redirect:/factura";
    }

}
