package com.registro.usuario.servicio;

import com.registro.usuario.modelo.Cliente;
import com.registro.usuario.repositorio.IClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IClienteService {

    @Autowired
    private IClienteRepositorio clienteDAO;
    public List<Cliente> listAll(){
        return clienteDAO.findAll();}
    public void save(Cliente cliente){
        clienteDAO.save(cliente);
    }

    public void borrar(Long id){
        clienteDAO.deleteById(id);
    }
}
