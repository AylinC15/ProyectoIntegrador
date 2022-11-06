package com.registro.usuario.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.registro.usuario.modelo.Producto;
import com.registro.usuario.servicio.ProductoServicio;

@Controller
public class ProductoControlador {
    @Autowired
    private ProductoServicio servicio;
    @GetMapping("/producto")
    public String listarProductos(Model model){
        model.addAttribute("producto",servicio.listartodoslosProductos());
        return "producto";
    }
    @GetMapping("/producto/nuevo")
    public String mostrarProductoFormulario(Model modelo){
        Producto producto= new Producto();
        modelo.addAttribute("producto", producto);
        return "crear_producto";
    }
    @PostMapping("/producto")
    public String guardarProducto(@ModelAttribute("producto")Producto producto){
        servicio.guardarProducto(producto);
        return "redirect:/producto";
    }
    @GetMapping("/producto/editar/{id}")
    public  String mostrarFormulariodeEditar(@PathVariable Long id, Model modelo){
        modelo.addAttribute("producto",servicio.obtenerProductoporID(id));
        return "editar_producto";
    }
    @PostMapping("/producto/{id}")
    public String actualizarProducto(@PathVariable Long id, @ModelAttribute ("producto") Producto producto,Model modelo){
        Producto productoExistente= servicio.obtenerProductoporID(id);
        productoExistente.setId(id);
        productoExistente.setDescripcion(producto.getDescripcion());
        productoExistente.setCantidad(producto.getCantidad());
        productoExistente.setMarca(producto.getMarca());
        productoExistente.setPrecio(producto.getPrecio());
        servicio.actualizarProducto(productoExistente);
        return "redirect:/producto";
    }
    @GetMapping("/producto/{id}")
    public String eliminarProductos(@PathVariable Long id){
    servicio.eliminarProducto(id);
    return "redirect:/producto";
    }
}
