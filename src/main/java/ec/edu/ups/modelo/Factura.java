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
public class Factura implements Serializable {
    private int numero;
    private Calendar fechaIngreso;
    private Calendar fechaSalida;;
    private double total;
    private Cliente cliente;
    private Espacio espacio;
    private String estado;

    public Factura() {
    }

    public Factura(int numero) {
        this.numero = numero;
    }

    public Factura(int numero, Calendar fechaIngreso, Cliente cliente, Espacio espacio, String estado) {
        this.numero = numero;
        this.fechaIngreso = fechaIngreso;
        this.cliente = cliente;
        this.espacio = espacio;
        this.estado=estado;
    }

    public Factura(int numero, Calendar fechaIngreso, Calendar fechaSalida, String estado, double total, Cliente cliente, Espacio espacio) {
        this.numero = numero;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.total = total;
        this.cliente = cliente;
        this.espacio = espacio;
    }   

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.numero;
        return hash;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
        final Factura other = (Factura) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Factura{" + "numero=" + numero + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", total=" + total + ", cliente=" + cliente + ", espacio=" + espacio + '}';
    }

    

    
}
