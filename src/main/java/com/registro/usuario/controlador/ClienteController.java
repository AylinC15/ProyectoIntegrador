package com.registro.usuario.controlador;

import com.registro.usuario.modelo.Cliente;
import com.registro.usuario.servicio.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller

public class ClienteController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public String listarClientes(Model modelo){
        modelo.addAttribute("registrar", clienteService.listAll());
        return "clientes";
    }

    @GetMapping("/registrar/nuevo")
    public String mostrarFormularioDeRegistrtarCliente(Model modelo){
        Cliente registrarCli = new Cliente();
        modelo.addAttribute("registrar", registrarCli);
        return "registrar";
    }

    @PostMapping("/registrar")
    public String guardar(@ModelAttribute("registrar") Cliente cliente){
        clienteService.save(cliente);
        return "redirect:/clientes";
    }

    @GetMapping("/registrar/{id}")
    public String eliminarCliente(@PathVariable("id") Long id){
        clienteService.borrar(id);
        return "redirect:/clientes";
    }

}
