/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5.Repositorio;

import reto5.Interface.InterfaceMensaje;
import reto5.Modelo.Mensaje;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author juanc
 */
@Repository
public class MensajeRepositorio {
          @Autowired
    private InterfaceMensaje crud3;
    public List<Mensaje> getAll(){
        return (List<Mensaje>) crud3.findAll();
    }
    public Optional<Mensaje> getMessage(int id){
        return crud3.findById(id);
    }

    public Mensaje save(Mensaje message){
        return crud3.save(message);
    }
     public void delete(Mensaje mensaje){
        crud3.delete(mensaje);
    }
    
}
