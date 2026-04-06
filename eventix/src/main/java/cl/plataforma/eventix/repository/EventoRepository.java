package cl.plataforma.eventix.repository;

import cl.plataforma.eventix.model.Evento;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository

public class EventoRepository {
    private List<Evento> todoEventos=new ArrayList<>();

    public List<Evento> obtenerEventos(){
        return todoEventos;
    }



    public Evento buscarPorCodigo (int codigo){
        for (Evento evento:todoEventos){
            if (Evento.getCodigoEvento()==codigoEvento){
                return evento;
            }
                return evento;

        }
         return null;
    }
   


    public Evento guardar (Evento eve){
        listaEventos.add(eve);
        return eve;
    }



    public Evento actualizar(Evento eve){
        int codigoEvento=0;
        int idPosicion=0;

        for (int i=0;i<listaEventos.size();i++){
            if(listaEventos.get(i).getCodigoEvento()==eve.getCodigoEvento()){

                codigoEvento=eve.getCodigo();
                idPosicion=i;

            }
        }

        Evento eve1=new Evento();
        eve1.setCodigoEvento(codigoEvento);
        eve1.setNombreEvento(eve.getNombreEvento());
        eve1.setTipoEvento(eve.getTipoEvento());
        eve1.setFecha(eve.getFecha());
        eve1.setUbicacion(eve.getUbicacion());
        eve1.setCapacidadPersonas(eve.getCapacidadPersonas());

        listaEventos.set(idPosicion,eve1);
        return eve1;

    }


    public void eliminar (int codigoEvento){
        Evento evento=buscarPorCodigo(codigoEvento);
        if (evento !=null){
            listaEventos.remove(evento);
        }
    }

     
}

//Desarrollar un microservicio backend utilizando Java Spring Boot, que permita gestionar
//los eventos del sistema mediante una API REST.
//El microservicio deberá implementar operaciones que permitan:
// Registrar nuevos eventos
// Consultar eventos existentes
// Actualizar información de eventos
// Eliminar eventos del sistema
// Realizar consultas específicas sobre los eventos registrados