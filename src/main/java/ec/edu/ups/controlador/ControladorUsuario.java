/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Usuario;
import java.util.List;


/**
 *
 * @author Anahi
 */
public class ControladorUsuario extends Controlador<Usuario>{
    private Usuario usuario;
    
    public ControladorUsuario(String ruta) {
        super(ruta);
    }
    
    public Usuario iniciarSesion(String correo, String contraseña) {
        
       var listaDocente= (List<Usuario>) getListaGenerica();
        
        Usuario usuario= listaDocente.stream().filter(usu-> usu.getCorreo().equals(correo)&&usu.getContraseña().equals(contraseña)).findFirst().get();
        if(usuario!=null){
            Usuario.instance=usuario;
            return Usuario.getInstance();
        }
        return null;
    }
    
}
