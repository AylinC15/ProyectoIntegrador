package com.registro.usuario.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.registro.usuario.modelo.Producto;
import com.registro.usuario.repositorio.ProductoRepositorio;

import java.util.List;
@Service
public class ProductoServicioImp implements ProductoServicio{
    @Autowired
    private ProductoRepositorio repositorio;

    @Override
    public List<Producto> listartodoslosProductos() {
        return repositorio.findAll();
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return repositorio.save(producto);
    }

    @Override
    public Producto obtenerProductoporID(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Producto actualizarProducto(Producto producto) {
        return repositorio.save(producto);
    }

    @Override
    public void eliminarProducto(Long id) {
        repositorio.deleteById(id);
    }
}
