package org.example.segurcol.model;

import org.example.segurcol.model.enums.TipoNovedad;

import java.time.LocalDate;

public record RegistroNovedad(LocalDate fecha, String descripcion, TipoNovedad tipo, Servicio servicio, Empleado empleado) {
}

