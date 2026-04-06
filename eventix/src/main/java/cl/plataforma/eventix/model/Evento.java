package cl.plataforma.eventix.model;

import lombock.AllArgsConstructor;
import lombock.Data;
import lombock.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Evento {
    private int codigoEvento;
    private String nombreEvento;
    private String tipoEvento;
    private int fecha;
    private String ubicacion;
    private int capacidadPersonas;

}
