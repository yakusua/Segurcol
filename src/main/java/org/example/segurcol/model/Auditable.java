package org.example.segurcol.model;

import java.time.LocalDateTime;
import java.util.LinkedList;

public interface Auditable {
    default void reguistrarNovedad(RegistroNovedad Novedad){}
    default LinkedList<RegistroNovedad> obtenerNovedades(LocalDateTime desde,LocalDateTime hasta){
        return null;
    }
}
