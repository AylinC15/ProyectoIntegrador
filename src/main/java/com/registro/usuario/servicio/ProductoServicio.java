package com.registro.usuario.servicio;

import com.registro.usuario.modelo.Producto;

import java.util.List;

public interface ProductoServicio {
    public List<Producto> listartodoslosProductos();
    public Producto guardarProducto(Producto producto);
    public Producto obtenerProductoporID(Long id);
    public Producto actualizarProducto(Producto producto);
    public void eliminarProducto(Long id);

}
