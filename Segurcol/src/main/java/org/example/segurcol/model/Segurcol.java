package org.example.segurcol.model;

import org.example.segurcol.model.enums.EstadoEquipo;

import java.util.LinkedList;

public class Segurcol {
    public String nit;
    public String ubicacion;
    public LinkedList<Empleado> empleados;
    public LinkedList<Servicio> servicios;
    public LinkedList<Equipo> equipos;
    public LinkedList<RegistroNovedad> novedades;

    public Segurcol(String nit, String ubicacion) {
        this.nit = nit;
        this.ubicacion = ubicacion;
        this.empleados = new LinkedList<>();
        this.servicios = new LinkedList<>();
        this.equipos = new LinkedList<>();
        this.novedades = new LinkedList<>();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void agregarServicio(Servicio s) {
        servicios.add(s);
    }

    public void agregarEquipo(Equipo eq) {
        equipos.add(eq);
    }

    public void registrarNovedad(RegistroNovedad n) {
        novedades.add(n);
    }

    public LinkedList<Empleado> getEmpleados() {
        return empleados;
    }

    public Empleado buscarEmpleadoPorDocumento(String documento) {
        for (Empleado e : empleados) {
            if (e.getDocumento().equals(documento)) {
                return e;
            }
        }
        return null;
    }

    public boolean actualizarEstadoEquipo(String codigo, EstadoEquipo nuevoEstado) {
        for (Equipo eq : equipos) {
            if (eq.getCodigo().equals(codigo)) {
                Equipo actualizado = new Equipo(eq.getCodigo(),eq.getValorReposicion(),eq.getEstadoEquipo(), eq.getTipoEquipo());
                equipos.set(equipos.indexOf(eq), actualizado);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarEmpleado(String cedula) {
        return empleados.removeIf(e -> e.getDocumento().equals(cedula));
    }

    public boolean eliminarEquipo(String codigo) {
        return equipos.removeIf(eq -> eq.getCodigo().equals(codigo));
    }
}
