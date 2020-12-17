/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Anahi
 */
public abstract class Controlador <E>{
     private List<E> listaGenerica;
    private String ruta;

    public Controlador(String ruta) {
        listaGenerica = new ArrayList<>();
        this.ruta = ruta;

        this.cargarDatos();
    }

    //public abstract boolean validar(T obj);

    public void cargarDatos() {
        try {
            FileInputStream archivo = new FileInputStream(ruta);
            ObjectInputStream objetoLectura = new ObjectInputStream(archivo);

            listaGenerica = (List<E>) objetoLectura.readObject();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean guardarDatos(List<E> listaGuardar) {
        try {
            FileOutputStream archivo = new FileOutputStream(ruta);
            ObjectOutputStream objetoEscritura = new ObjectOutputStream(archivo);

            objetoEscritura.writeObject(listaGuardar);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean crear(E objeto) {
        listaGenerica.add(objeto);
        return guardarDatos(listaGenerica);
        
    }
    
    public E leer(E objeto) {

        List<Controlador> lista = new ArrayList();
        Controlador t;
        Iterator i = listaGenerica.iterator();
        while (i.hasNext()) {
            t = (Controlador) i.next();
            lista.add(t);
            
        }
        return null;

    }

    public boolean actualizar(E objetoActalizado) {
        for (E objeto : listaGenerica) {
            if (objeto.equals(objetoActalizado)) {
                listaGenerica.set(listaGenerica.indexOf(objeto), objetoActalizado);
                return guardarDatos(listaGenerica);
            }
        }
        return false;
    }

    public boolean eliminar(E objeto) {
        listaGenerica.remove(objeto);
        return guardarDatos(listaGenerica);
    }

    public List<E> getListaGenerica() {
        return listaGenerica;
    }
    
     public int cargarCodigo(){
        if (getListaGenerica().size() > 0) {
            return getListaGenerica().size() + 1;
        } else {
            return 1;
        }
    }
    
}
