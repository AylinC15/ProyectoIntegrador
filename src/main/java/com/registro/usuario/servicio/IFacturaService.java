package com.registro.usuario.servicio;

import com.registro.usuario.modelo.Factura;
import com.registro.usuario.repositorio.IFacturaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IFacturaService {

    @Autowired
    private IFacturaDAO facturaDAO;

    public List<Factura> listAll(){
        return facturaDAO.findAll();}

    public void save(Factura factura){
        facturaDAO.save(factura);
    }
}
