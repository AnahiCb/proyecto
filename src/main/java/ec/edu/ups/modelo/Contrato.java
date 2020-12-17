/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author Anahi
 */
public class Contrato implements Serializable {
    private int codigo;
    private Cliente cliente;
    private Espacio espacio;
    private Calendar fechaIngreso;
    private Calendar fechaSalida;
    private String estado;
    private double pago;

    public Contrato(int codigo) {
        this.codigo = codigo;
    }

    public Contrato(int codigo, Cliente cliente, Espacio espacio, Calendar fechaIngreso, Calendar fechaSalida, String estado, double pago) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.espacio = espacio;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
        this.pago = pago;
    }

    public Contrato() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Espacio getEspacio() {
        return espacio;
    }

    public void setEspacio(Espacio espacio) {
        this.espacio = espacio;
    }

    public Calendar getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Calendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Calendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Calendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contrato other = (Contrato) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Contrato{" + "codigo=" + codigo + ", cliente=" + cliente + ", espacio=" + espacio + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", estado=" + estado + ", pago=" + pago + '}';
    }
    
}
