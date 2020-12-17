/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Espacio;
import java.util.List;

/**
 *
 * @author Anahi
 */
public class ControladorEspacio extends Controlador<Espacio>{
    
    public ControladorEspacio(String ruta) {
        super(ruta);
    }
    
    public void crearSitios(){
        var listaSitios=(List<Espacio>) getListaGenerica();
        int numero=0;
        
        while(numero<61){
            numero++;
            Espacio espacio= new Espacio(String.valueOf(numero), "Desocupado", null);
            listaSitios.add(espacio);
        }
        guardarDatos(listaSitios);
    }
    
}
