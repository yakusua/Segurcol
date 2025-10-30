package org.example.segurcol.model;

import java.time.LocalDate;
import java.util.List;

public interface Agendable {

    void programar(LocalDate fecha, String descripcion);

    List<AgendaItem> obtenerAgenda(LocalDate desde, LocalDate hasta);
}

