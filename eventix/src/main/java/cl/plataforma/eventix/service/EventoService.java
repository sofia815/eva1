package cl.plataforma.eventix.service;

import cl.plataforma.eventix.model.Evento;
import cl.plataforma.eventix.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class EventoService {
    @Autowired
    private EventoRepository eventoRepository;
    public List<Evento>gEventos(){
        return eventoRepository.obtenerEventos();
    }
    public Evento saveEvento(Evento evento){
        return libroRepository.guardar(evento);

    }

    public Evento getCodigoEvento(int codigoEvento){
        return libroRepository.buscarPorCodigo(codigoEvento);
    }

}







