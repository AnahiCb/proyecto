/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorEspacio;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Espacio;
import ec.edu.ups.modelo.Vehiculo;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Anahi
 */
public class InformacionEspacios extends javax.swing.JInternalFrame {

    private ControladorCliente controladorCliente;
    private ControladorVehiculo controladorVehiculo;
    private ControladorEspacio controladorEspacio;
    private VentanaPrincipal ventanaPrincipal;
    private GestionVehiculo gestionVehiculo;
    private Ticket ticket;

    public InformacionEspacios(ControladorCliente controladorCliente, ControladorVehiculo controladorVehiculo, ControladorEspacio controladorEspacio, VentanaPrincipal ventanaPrincipal, GestionVehiculo gestionVehiculo, Ticket ticket) {
        
        initComponents();
        this.controladorCliente = controladorCliente;
        this.controladorVehiculo = controladorVehiculo;
        this.controladorEspacio = controladorEspacio;
        this.ventanaPrincipal = ventanaPrincipal;
        this.gestionVehiculo = gestionVehiculo;
        this.ticket = ticket;
    }
    private void limpiar() {
        txtNumero.setText("");
        cbxEstado.setSelectedIndex(0);
        txtPlaca.setText("");
        txtNombre.setText("");
        txtCedula.setText("");
    }  
    public void validarEstado(){
        controladorEspacio.getListaGenerica().stream().map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn1.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn1.setEnabled(true);
                    txt1.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn1.setEnabled(false);
                        txt1.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn2.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn2.setEnabled(true);
                    txt2.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn2.setEnabled(false);
                        txt2.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn3.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn3.setEnabled(true);
                    txt3.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn3.setEnabled(false);
                        txt3.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn4.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn4.setEnabled(true);
                    txt4.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn4.setEnabled(false);
                        txt4.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn5.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn5.setEnabled(true);
                    txt5.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn5.setEnabled(false);
                        txt5.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn6.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn6.setEnabled(true);
                    txt6.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn6.setEnabled(false);
                        txt6.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn7.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn7.setEnabled(true);
                    txt7.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn7.setEnabled(false);
                        txt7.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn8.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn8.setEnabled(true);
                    txt8.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn8.setEnabled(false);
                        txt8.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn9.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn9.setEnabled(true);
                    txt9.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn9.setEnabled(false);
                        txt9.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn10.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn10.setEnabled(true);
                    txt10.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn10.setEnabled(false);
                        txt10.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn11.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn11.setEnabled(true);
                    txt11.setBackground(Color.WHITE);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn11.setEnabled(false);
                        txt11.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn12.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn12.setEnabled(true);
                    txt12.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn12.setEnabled(false);
                        txt12.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn13.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn13.setEnabled(true);
                    txt13.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn13.setEnabled(false);
                        txt13.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn14.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn14.setEnabled(true);
                    txt14.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn14.setEnabled(false);
                        txt14.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn15.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn15.setEnabled(true);
                    txt15.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn15.setEnabled(false);
                        txt15.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn16.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn16.setEnabled(true);
                    txt16.setBackground(Color.WHITE);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn16.setEnabled(false);
                        txt16.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn17.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn17.setEnabled(true);
                    txt17.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn17.setEnabled(false);
                        txt17.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn18.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn18.setEnabled(true);
                    txt18.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn18.setEnabled(false);
                        txt18.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn19.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn19.setEnabled(true);
                    txt19.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn19.setEnabled(false);
                        txt19.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn20.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn20.setEnabled(true);
                    txt20.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn20.setEnabled(false);
                        txt20.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn21.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn21.setEnabled(true);
                    txt21.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn21.setEnabled(false);
                        txt21.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn22.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn22.setEnabled(true);
                    txt22.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn22.setEnabled(false);
                        txt22.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn23.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn23.setEnabled(true);
                    txt23.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn23.setEnabled(false);
                        txt23.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn24.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn24.setEnabled(true);
                    txt24.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn24.setEnabled(false);
                        txt24.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn25.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn25.setEnabled(true);
                    txt25.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn25.setEnabled(false);
                        txt25.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn26.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn26.setEnabled(true);
                    txt26.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn26.setEnabled(false);
                        txt26.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn27.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn27.setEnabled(true);
                    txt27.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn27.setEnabled(false);
                        txt27.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn28.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn28.setEnabled(true);
                    txt28.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn28.setEnabled(false);
                        txt28.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn29.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn29.setEnabled(true);
                    txt29.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn29.setEnabled(false);
                        txt29.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn30.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn30.setEnabled(true);
                    txt30.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn30.setEnabled(false);
                        txt30.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn31.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn31.setEnabled(true);
                    txt31.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn31.setEnabled(false);
                        txt31.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn32.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn32.setEnabled(true);
                    txt32.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn32.setEnabled(false);
                        txt32.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn33.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn33.setEnabled(true);
                    txt33.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn33.setEnabled(false);
                        txt33.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn34.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn34.setEnabled(true);
                    txt34.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn34.setEnabled(false);
                        txt34.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn35.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn35.setEnabled(true);
                    txt35.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn35.setEnabled(false);
                        txt35.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn36.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn36.setEnabled(true);
                    txt36.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn36.setEnabled(false);
                        txt36.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn37.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn37.setEnabled(true);
                    txt37.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn37.setEnabled(false);
                        txt37.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn38.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn38.setEnabled(true);
                    txt38.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn38.setEnabled(false);
                        txt38.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn39.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn39.setEnabled(true);
                    txt39.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn39.setEnabled(false);
                        txt39.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn40.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn40.setEnabled(true);
                    txt40.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn40.setEnabled(false);
                        txt40.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn41.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn41.setEnabled(true);
                    txt41.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn41.setEnabled(false);
                        txt41.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn42.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn42.setEnabled(true);
                    txt42.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn42.setEnabled(false);
                        txt42.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn43.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn43.setEnabled(true);
                    txt43.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn43.setEnabled(false);
                        txt43.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn44.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn44.setEnabled(true);
                    txt44.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn44.setEnabled(false);
                        txt44.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn45.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn45.setEnabled(true);
                    txt45.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn45.setEnabled(false);
                        txt45.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn46.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn46.setEnabled(true);
                    txt46.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn46.setEnabled(false);
                        txt46.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn47.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn47.setEnabled(true);
                    txt47.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn47.setEnabled(false);
                        txt47.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn48.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn48.setEnabled(true);
                    txt48.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn48.setEnabled(false);
                        txt48.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn49.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn49.setEnabled(true);
                    txt49.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn49.setEnabled(false);
                        txt49.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn50.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn50.setEnabled(true);
                    txt50.setBackground(Color.GREEN);
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn50.setEnabled(false);
                        txt50.setBackground(Color.RED);
                    }
                }   
            }
            return sitio;
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        cbxEstado = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnGenerar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        txt10 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        txt12 = new javax.swing.JTextField();
        txt13 = new javax.swing.JTextField();
        txt14 = new javax.swing.JTextField();
        txt15 = new javax.swing.JTextField();
        txt16 = new javax.swing.JTextField();
        txt17 = new javax.swing.JTextField();
        txt18 = new javax.swing.JTextField();
        txt19 = new javax.swing.JTextField();
        txt20 = new javax.swing.JTextField();
        txt21 = new javax.swing.JTextField();
        txt22 = new javax.swing.JTextField();
        txt23 = new javax.swing.JTextField();
        txt24 = new javax.swing.JTextField();
        txt25 = new javax.swing.JTextField();
        txt26 = new javax.swing.JTextField();
        txt27 = new javax.swing.JTextField();
        txt28 = new javax.swing.JTextField();
        txt29 = new javax.swing.JTextField();
        txt30 = new javax.swing.JTextField();
        txt31 = new javax.swing.JTextField();
        txt32 = new javax.swing.JTextField();
        txt33 = new javax.swing.JTextField();
        txt34 = new javax.swing.JTextField();
        txt35 = new javax.swing.JTextField();
        txt36 = new javax.swing.JTextField();
        txt37 = new javax.swing.JTextField();
        txt38 = new javax.swing.JTextField();
        txt39 = new javax.swing.JTextField();
        txt40 = new javax.swing.JTextField();
        txt41 = new javax.swing.JTextField();
        txt42 = new javax.swing.JTextField();
        txt43 = new javax.swing.JTextField();
        txt44 = new javax.swing.JTextField();
        txt45 = new javax.swing.JTextField();
        txt46 = new javax.swing.JTextField();
        txt47 = new javax.swing.JTextField();
        txt48 = new javax.swing.JTextField();
        txt49 = new javax.swing.JTextField();
        txt50 = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn27 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn29 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn34 = new javax.swing.JButton();
        btn35 = new javax.swing.JButton();
        btn36 = new javax.swing.JButton();
        btn37 = new javax.swing.JButton();
        btn38 = new javax.swing.JButton();
        btn39 = new javax.swing.JButton();
        btn40 = new javax.swing.JButton();
        btn41 = new javax.swing.JButton();
        btn42 = new javax.swing.JButton();
        btn43 = new javax.swing.JButton();
        btn44 = new javax.swing.JButton();
        btn45 = new javax.swing.JButton();
        btn46 = new javax.swing.JButton();
        btn47 = new javax.swing.JButton();
        btn48 = new javax.swing.JButton();
        btn49 = new javax.swing.JButton();
        btn50 = new javax.swing.JButton();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Espacio:");

        jLabel2.setText("Estado:");

        jLabel3.setText("Cédula Cliente:");

        jLabel4.setText("Nombre Cliente:");

        jLabel5.setText("Placa Vehículo:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Ocupado", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(28, 28, 28)
                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtCedula)))
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(49, 49, 49)
                                .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 204, 51));

        jLabel6.setText("Libre");

        jLabel8.setText("Ocupado");

        jTextField3.setBackground(new java.awt.Color(255, 0, 0));

        jLabel9.setText("0-30 min → $0.75");

        jLabel10.setText("31-60 min → $1.00");

        jLabel11.setText("más de una Hora → $0.05");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(28, 28, 28)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(25, 25, 25))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnGenerar.setText("GenerarTicket");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnGenerar))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnGenerar)
                .addGap(30, 30, 30)
                .addComponent(btnCancelar)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        txt1.setBackground(new java.awt.Color(0, 204, 0));
        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1.setText("1");

        txt2.setBackground(new java.awt.Color(0, 204, 0));
        txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2.setText("2");
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        txt3.setBackground(new java.awt.Color(0, 204, 0));
        txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3.setText("3");

        txt4.setBackground(new java.awt.Color(0, 204, 0));
        txt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4.setText("4");

        txt5.setBackground(new java.awt.Color(0, 204, 0));
        txt5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5.setText("5");

        txt6.setBackground(new java.awt.Color(0, 204, 0));
        txt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6.setText("6");

        txt7.setBackground(new java.awt.Color(0, 204, 0));
        txt7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7.setText("7");

        txt8.setBackground(new java.awt.Color(0, 204, 0));
        txt8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8.setText("8");

        txt9.setBackground(new java.awt.Color(0, 204, 0));
        txt9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9.setText("9");

        txt10.setBackground(new java.awt.Color(0, 204, 0));
        txt10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt10.setText("10");

        txt11.setBackground(new java.awt.Color(0, 204, 0));
        txt11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt11.setText("11");

        txt12.setBackground(new java.awt.Color(0, 204, 0));
        txt12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt12.setText("12");

        txt13.setBackground(new java.awt.Color(0, 204, 0));
        txt13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt13.setText("13");

        txt14.setBackground(new java.awt.Color(0, 204, 0));
        txt14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt14.setText("14");

        txt15.setBackground(new java.awt.Color(0, 204, 0));
        txt15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt15.setText("15");

        txt16.setBackground(new java.awt.Color(0, 204, 0));
        txt16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt16.setText("16");
        txt16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt16ActionPerformed(evt);
            }
        });

        txt17.setBackground(new java.awt.Color(0, 204, 0));
        txt17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt17.setText("17");

        txt18.setBackground(new java.awt.Color(0, 204, 0));
        txt18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt18.setText("18");

        txt19.setBackground(new java.awt.Color(0, 204, 0));
        txt19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt19.setText("19");

        txt20.setBackground(new java.awt.Color(0, 204, 0));
        txt20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt20.setText("20");

        txt21.setBackground(new java.awt.Color(0, 204, 0));
        txt21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt21.setText("21");

        txt22.setBackground(new java.awt.Color(0, 204, 0));
        txt22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt22.setText("22");

        txt23.setBackground(new java.awt.Color(0, 204, 0));
        txt23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt23.setText("23");

        txt24.setBackground(new java.awt.Color(0, 204, 0));
        txt24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt24.setText("24");

        txt25.setBackground(new java.awt.Color(0, 204, 0));
        txt25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt25.setText("25");

        txt26.setBackground(new java.awt.Color(0, 204, 0));
        txt26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt26.setText("26");

        txt27.setBackground(new java.awt.Color(0, 204, 0));
        txt27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt27.setText("27");

        txt28.setBackground(new java.awt.Color(0, 204, 0));
        txt28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt28.setText("28");

        txt29.setBackground(new java.awt.Color(0, 204, 0));
        txt29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt29.setText("29");

        txt30.setBackground(new java.awt.Color(0, 204, 0));
        txt30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt30.setText("30");

        txt31.setBackground(new java.awt.Color(0, 204, 0));
        txt31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt31.setText("31");

        txt32.setBackground(new java.awt.Color(0, 204, 0));
        txt32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt32.setText("32");

        txt33.setBackground(new java.awt.Color(0, 204, 0));
        txt33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt33.setText("33");

        txt34.setBackground(new java.awt.Color(0, 204, 0));
        txt34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt34.setText("34");

        txt35.setBackground(new java.awt.Color(0, 204, 0));
        txt35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt35.setText("35");

        txt36.setBackground(new java.awt.Color(0, 204, 0));
        txt36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt36.setText("36");

        txt37.setBackground(new java.awt.Color(0, 204, 0));
        txt37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt37.setText("37");

        txt38.setBackground(new java.awt.Color(0, 204, 0));
        txt38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt38.setText("38");

        txt39.setBackground(new java.awt.Color(0, 204, 0));
        txt39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt39.setText("39");

        txt40.setBackground(new java.awt.Color(0, 204, 0));
        txt40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt40.setText("40");

        txt41.setBackground(new java.awt.Color(0, 204, 0));
        txt41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt41.setText("41");

        txt42.setBackground(new java.awt.Color(0, 204, 0));
        txt42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt42.setText("42");

        txt43.setBackground(new java.awt.Color(0, 204, 0));
        txt43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt43.setText("43");

        txt44.setBackground(new java.awt.Color(0, 204, 0));
        txt44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt44.setText("44");

        txt45.setBackground(new java.awt.Color(0, 204, 0));
        txt45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt45.setText("45");

        txt46.setBackground(new java.awt.Color(0, 204, 0));
        txt46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt46.setText("46");

        txt47.setBackground(new java.awt.Color(0, 204, 0));
        txt47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt47.setText("47");

        txt48.setBackground(new java.awt.Color(0, 204, 0));
        txt48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt48.setText("48");

        txt49.setBackground(new java.awt.Color(0, 204, 0));
        txt49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt49.setText("49");

        txt50.setBackground(new java.awt.Color(0, 204, 0));
        txt50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt50.setText("50");

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn10.setText("10");
        btn10.setToolTipText("");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.setText("11");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setText("12");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.setText("13");
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn14.setText("14");
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        btn15.setText("15");
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btn16.setText("16");
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        btn17.setText("17");
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });

        btn18.setText("18");
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });

        btn19.setText("19");
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });

        btn20.setText("20");
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn21.setText("21");
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn22.setText("22");
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        btn23.setText("23");
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });

        btn24.setText("24");
        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn24ActionPerformed(evt);
            }
        });

        btn25.setText("25");
        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn25ActionPerformed(evt);
            }
        });

        btn26.setText("26");
        btn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn26ActionPerformed(evt);
            }
        });

        btn27.setText("27");
        btn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn27ActionPerformed(evt);
            }
        });

        btn28.setText("28");
        btn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn28ActionPerformed(evt);
            }
        });

        btn29.setText("29");
        btn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn29ActionPerformed(evt);
            }
        });

        btn30.setText("30");
        btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30ActionPerformed(evt);
            }
        });

        btn31.setText("31");
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });

        btn32.setText("32");
        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });

        btn33.setText("33");
        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });

        btn34.setText("34");
        btn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn34ActionPerformed(evt);
            }
        });

        btn35.setText("35");
        btn35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn35ActionPerformed(evt);
            }
        });

        btn36.setText("36");
        btn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn36ActionPerformed(evt);
            }
        });

        btn37.setText("37");
        btn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn37ActionPerformed(evt);
            }
        });

        btn38.setText("38");
        btn38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn38ActionPerformed(evt);
            }
        });

        btn39.setText("39");
        btn39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn39ActionPerformed(evt);
            }
        });

        btn40.setText("40");
        btn40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn40ActionPerformed(evt);
            }
        });

        btn41.setText("41");
        btn41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn41ActionPerformed(evt);
            }
        });

        btn42.setText("42");
        btn42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn42ActionPerformed(evt);
            }
        });

        btn43.setText("43");
        btn43.setToolTipText("");
        btn43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn43ActionPerformed(evt);
            }
        });

        btn44.setText("44");
        btn44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn44ActionPerformed(evt);
            }
        });

        btn45.setText("45");
        btn45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn45ActionPerformed(evt);
            }
        });

        btn46.setText("46");
        btn46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn46ActionPerformed(evt);
            }
        });

        btn47.setText("47");
        btn47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn47ActionPerformed(evt);
            }
        });

        btn48.setText("48");
        btn48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn48ActionPerformed(evt);
            }
        });

        btn49.setText("49");
        btn49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn49ActionPerformed(evt);
            }
        });

        btn50.setText("50");
        btn50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn50ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txt19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt25, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(534, 534, 534)
                        .addComponent(txt26, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt27, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt28, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt29, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt30, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn15)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt46, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt47, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn47)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn48)
                            .addComponent(txt48, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt49, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn49))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn50)
                            .addComponent(txt50, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn32))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt31, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn16))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn17))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txt32, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn18)
                            .addComponent(txt33, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt34, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn34))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt35, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt36, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn36)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt37, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt38, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn38)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn41))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt39, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt40, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt41, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt42, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn42))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt43, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt44, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt45, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn45))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn30)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt9)
                    .addComponent(txt8)
                    .addComponent(txt7)
                    .addComponent(txt6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(btn4)
                    .addComponent(btn5)
                    .addComponent(btn6)
                    .addComponent(btn7)
                    .addComponent(btn8)
                    .addComponent(btn9)
                    .addComponent(btn10)
                    .addComponent(btn11)
                    .addComponent(btn12)
                    .addComponent(btn13)
                    .addComponent(btn14)
                    .addComponent(btn15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt30, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(txt29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt18, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn16)
                    .addComponent(btn17)
                    .addComponent(btn18)
                    .addComponent(btn19)
                    .addComponent(btn20)
                    .addComponent(btn21)
                    .addComponent(btn22)
                    .addComponent(btn23)
                    .addComponent(btn24)
                    .addComponent(btn25)
                    .addComponent(btn26)
                    .addComponent(btn27)
                    .addComponent(btn28)
                    .addComponent(btn29)
                    .addComponent(btn30))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn31)
                    .addComponent(btn32)
                    .addComponent(btn33)
                    .addComponent(btn34)
                    .addComponent(btn35)
                    .addComponent(btn36)
                    .addComponent(btn37)
                    .addComponent(btn38)
                    .addComponent(btn39)
                    .addComponent(btn40)
                    .addComponent(btn41)
                    .addComponent(btn42)
                    .addComponent(btn43)
                    .addComponent(btn44)
                    .addComponent(btn45))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt48, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn46)
                    .addComponent(btn47)
                    .addComponent(btn48)
                    .addComponent(btn49)
                    .addComponent(btn50))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       System.out.println(btnBuscar.getText());
        String palaca= txtPlaca.getText();
        Vehiculo v = new Vehiculo(palaca);
        Vehiculo vehiculo = controladorVehiculo.leer(v);
        if(vehiculo!= null){
            Cliente cliente= vehiculo.getPropietario();
            txtNombre.setText(cliente.getNombre());
            txtCedula.setText(cliente.getCedula()+cliente.getApellido());
            
        }else{
            int opcion=JOptionPane.showConfirmDialog(this, "Vehiculo no encontrado desea crear uno"); 
            if(opcion== JOptionPane.YES_OPTION)
            {
                ventanaPrincipal.getDesktopPane().add(gestionVehiculo);
                gestionVehiculo.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        boolean resultado = false;
        String numero= txtNumero.getText();
        String estado=(String) cbxEstado.getSelectedItem();
        String nombre= txtNombre.getText();
        String palaca= txtPlaca.getText();
        Vehiculo v = new Vehiculo(palaca);
        Vehiculo vehiculo = controladorVehiculo.leer(v);
        
        Espacio sit= new Espacio(numero);
        if (numero.isEmpty()||estado.isEmpty()||nombre.isEmpty()||palaca.isEmpty()||estado.equals("Libre")) {
            JOptionPane.showMessageDialog(this, "Obligatorio llenar todos los campos");
        }else{
            if(controladorEspacio.leer(sit)!= null){
                Espacio sitio= new Espacio(numero, estado, vehiculo);
                resultado =controladorEspacio.actualizar(sitio);    
            }else{
               Espacio sitio= new Espacio(numero, estado, vehiculo);
               resultado =controladorEspacio.crear(sitio);
            } 
            ticket.setNumero(numero);
            ticket.setVisible(true);
            limpiar();
            JOptionPane.showMessageDialog(this, "Ticket generado");
            validarEstado();
            
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        validarEstado();
    }//GEN-LAST:event_formInternalFrameActivated

    private void txt16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt16ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        txtNumero.setText(btn1.getText());
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        txtNumero.setText(btn2.getText());
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        txtNumero.setText(btn3.getText());
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        txtNumero.setText(btn4.getText());
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        txtNumero.setText(btn5.getText());
        txt5.setBackground(Color.red);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        txtNumero.setText(btn6.getText());
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        txtNumero.setText(btn7.getText());
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        txtNumero.setText(btn8.getText());
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        txtNumero.setText(btn9.getText());
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        txtNumero.setText(btn10.getText());
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        txtNumero.setText(btn11.getText());
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        txtNumero.setText(btn12.getText());
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        txtNumero.setText(btn13.getText());
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        txtNumero.setText(btn14.getText());
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        txtNumero.setText(btn15.getText());
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        txtNumero.setText(btn16.getText());
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
        txtNumero.setText(btn17.getText());
    }//GEN-LAST:event_btn17ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
        txtNumero.setText(btn18.getText());
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn19ActionPerformed
        txtNumero.setText(btn19.getText());
    }//GEN-LAST:event_btn19ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        txtNumero.setText(btn20.getText());
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        txtNumero.setText(btn21.getText());
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        txtNumero.setText(btn22.getText());
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        txtNumero.setText(btn23.getText());
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24ActionPerformed
        txtNumero.setText(btn24.getText());
    }//GEN-LAST:event_btn24ActionPerformed

    private void btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25ActionPerformed
        txtNumero.setText(btn25.getText());
    }//GEN-LAST:event_btn25ActionPerformed

    private void btn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn26ActionPerformed
        txtNumero.setText(btn26.getText());
    }//GEN-LAST:event_btn26ActionPerformed

    private void btn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn27ActionPerformed
        txtNumero.setText(btn27.getText());
    }//GEN-LAST:event_btn27ActionPerformed

    private void btn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn28ActionPerformed
        txtNumero.setText(btn28.getText());
    }//GEN-LAST:event_btn28ActionPerformed

    private void btn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn29ActionPerformed
        txtNumero.setText(btn29.getText());
    }//GEN-LAST:event_btn29ActionPerformed

    private void btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30ActionPerformed
        txtNumero.setText(btn30.getText());
    }//GEN-LAST:event_btn30ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        txtNumero.setText(btn31.getText());
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        txtNumero.setText(btn32.getText());
    }//GEN-LAST:event_btn32ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        txtNumero.setText(btn33.getText());
    }//GEN-LAST:event_btn33ActionPerformed

    private void btn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn34ActionPerformed
        txtNumero.setText(btn34.getText());
    }//GEN-LAST:event_btn34ActionPerformed

    private void btn35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn35ActionPerformed
        txtNumero.setText(btn35.getText());
    }//GEN-LAST:event_btn35ActionPerformed

    private void btn36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn36ActionPerformed
        txtNumero.setText(btn36.getText());
    }//GEN-LAST:event_btn36ActionPerformed

    private void btn37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn37ActionPerformed
        txtNumero.setText(btn37.getText());
    }//GEN-LAST:event_btn37ActionPerformed

    private void btn38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn38ActionPerformed
        txtNumero.setText(btn38.getText());
    }//GEN-LAST:event_btn38ActionPerformed

    private void btn39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn39ActionPerformed
       txtNumero.setText(btn39.getText());
    }//GEN-LAST:event_btn39ActionPerformed

    private void btn40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn40ActionPerformed
       txtNumero.setText(btn40.getText());
    }//GEN-LAST:event_btn40ActionPerformed

    private void btn41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn41ActionPerformed
      txtNumero.setText(btn41.getText());
    }//GEN-LAST:event_btn41ActionPerformed

    private void btn42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn42ActionPerformed
       txtNumero.setText(btn42.getText());
    }//GEN-LAST:event_btn42ActionPerformed

    private void btn43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn43ActionPerformed
        txtNumero.setText(btn43.getText());
    }//GEN-LAST:event_btn43ActionPerformed

    private void btn44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn44ActionPerformed
        txtNumero.setText(btn44.getText());
    }//GEN-LAST:event_btn44ActionPerformed

    private void btn45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn45ActionPerformed
        txtNumero.setText(btn45.getText());
    }//GEN-LAST:event_btn45ActionPerformed

    private void btn46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn46ActionPerformed
        txtNumero.setText(btn46.getText());
    }//GEN-LAST:event_btn46ActionPerformed

    private void btn47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn47ActionPerformed
        txtNumero.setText(btn47.getText());
    }//GEN-LAST:event_btn47ActionPerformed

    private void btn48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn48ActionPerformed
        txtNumero.setText(btn48.getText());
    }//GEN-LAST:event_btn48ActionPerformed

    private void btn49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn49ActionPerformed
        txtNumero.setText(btn49.getText());
    }//GEN-LAST:event_btn49ActionPerformed

    private void btn50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn50ActionPerformed
       txtNumero.setText(btn50.getText());
    }//GEN-LAST:event_btn50ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn35;
    private javax.swing.JButton btn36;
    private javax.swing.JButton btn37;
    private javax.swing.JButton btn38;
    private javax.swing.JButton btn39;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn40;
    private javax.swing.JButton btn41;
    private javax.swing.JButton btn42;
    private javax.swing.JButton btn43;
    private javax.swing.JButton btn44;
    private javax.swing.JButton btn45;
    private javax.swing.JButton btn46;
    private javax.swing.JButton btn47;
    private javax.swing.JButton btn48;
    private javax.swing.JButton btn49;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn50;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt14;
    private javax.swing.JTextField txt15;
    private javax.swing.JTextField txt16;
    private javax.swing.JTextField txt17;
    private javax.swing.JTextField txt18;
    private javax.swing.JTextField txt19;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt20;
    private javax.swing.JTextField txt21;
    private javax.swing.JTextField txt22;
    private javax.swing.JTextField txt23;
    private javax.swing.JTextField txt24;
    private javax.swing.JTextField txt25;
    private javax.swing.JTextField txt26;
    private javax.swing.JTextField txt27;
    private javax.swing.JTextField txt28;
    private javax.swing.JTextField txt29;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt30;
    private javax.swing.JTextField txt31;
    private javax.swing.JTextField txt32;
    private javax.swing.JTextField txt33;
    private javax.swing.JTextField txt34;
    private javax.swing.JTextField txt35;
    private javax.swing.JTextField txt36;
    private javax.swing.JTextField txt37;
    private javax.swing.JTextField txt38;
    private javax.swing.JTextField txt39;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt40;
    private javax.swing.JTextField txt41;
    private javax.swing.JTextField txt42;
    private javax.swing.JTextField txt43;
    private javax.swing.JTextField txt44;
    private javax.swing.JTextField txt45;
    private javax.swing.JTextField txt46;
    private javax.swing.JTextField txt47;
    private javax.swing.JTextField txt48;
    private javax.swing.JTextField txt49;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt50;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
