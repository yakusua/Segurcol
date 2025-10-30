package org.example.segurcol.model;

import java.time.LocalDate;

public record AgendaItem(LocalDate fecha, String descripcion, Empleado empleado, Servicio servicio) {
}
