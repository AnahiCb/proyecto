/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Administrador;

/**
 *
 * @author Anahi
 */
public class ControladorAdministrador {
     Administrador administrador = new Administrador("ana@gmail.com", "12345", 1, "0150550200", "Ana", "Gonzalez");
    
    public Administrador iniciarSesion(String correo, String contraseña){
        if (administrador.getCorreo().equals(correo) && administrador.getContraseña().equals(contraseña)) {
            return administrador;
        }
        return null;
    }
}
