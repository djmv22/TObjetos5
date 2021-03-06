/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Cuenta;
import javax.swing.JOptionPane;

/**
 *
 * @author DanielDeJesus
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    Cuenta c;
    public Principal() {
        initComponents();
        txtNumeroCuenta.setEditable(true);
        txtNumeroIdentificacion.setEditable(true);
        txtSaldoActual.setEditable(true);
        txtInteresAnual.setEditable(false);
        txtModificarSueldo.setEditable(false);
        cmdGuardar.setEnabled(true);
        cmdIngreso.setEnabled(false);
        cmdRetiro.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdActualizarSaldo.setEnabled(false);
        cmdLimpiar.setEnabled(true);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroCuenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSaldoActual = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroIdentificacion = new javax.swing.JTextField();
        cmdGuardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtModificarSueldo = new javax.swing.JTextField();
        cmdIngreso = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmdRetiro = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        cmdMostrar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdActualizarSaldo = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtInteresAnual = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel1.setText("Taller Objetos 5");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Creación de cuentas"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("N° de la cuenta:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtNumeroCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroCuentaKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumeroCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 110, -1));

        jLabel4.setText("Saldo actual:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtSaldoActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaldoActualKeyTyped(evt);
            }
        });
        jPanel2.add(txtSaldoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 80, -1));

        jLabel3.setText("N° de identificación: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtNumeroIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroIdentificacionKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumeroIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 100, -1));

        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 250, 190));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificación de saldo"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtModificarSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModificarSueldoKeyTyped(evt);
            }
        });
        jPanel3.add(txtModificarSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 100, -1));

        cmdIngreso.setText("Ingreso");
        cmdIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIngresoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel6.setText("Ingreso o retiro de saldo:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        cmdRetiro.setText("Retiro");
        cmdRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRetiroActionPerformed(evt);
            }
        });
        jPanel3.add(cmdRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 260, 130));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane2.setViewportView(txtResultado);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 350, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 370, 130));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Mas Opciones"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel5.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel5.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 110, -1));

        cmdActualizarSaldo.setText("Actualizar Saldo");
        cmdActualizarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActualizarSaldoActionPerformed(evt);
            }
        });
        jPanel5.add(cmdActualizarSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 260, 110));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Interes"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Interes anual:");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtInteresAnual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInteresAnualKeyTyped(evt);
            }
        });
        jPanel6.add(txtInteresAnual, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 80, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 250, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(626, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        long nCuenta,nIdentificacion;
        double sueldoA;
        
        if(txtNumeroCuenta.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite el numero de la cuenta", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumeroCuenta.requestFocusInWindow();
        }
        else if(txtNumeroIdentificacion.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite el numero de identificación", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumeroIdentificacion.requestFocusInWindow();
        }
        else if(Long.parseLong(txtNumeroCuenta.getText().trim())== 0){
            JOptionPane.showMessageDialog(this, "El número de la cuenta no puede ser cero", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumeroCuenta.requestFocusInWindow();
            txtNumeroCuenta.selectAll();
        }
        else if(Long.parseLong(txtNumeroIdentificacion.getText().trim())== 0){
            JOptionPane.showMessageDialog(this, "El número de identificación no puede ser cero", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumeroIdentificacion.requestFocusInWindow();
            txtNumeroIdentificacion.selectAll();
        }
        else{
            try{
                if (txtSaldoActual.getText().isEmpty()){
                    nIdentificacion = Long.parseLong(txtNumeroIdentificacion.getText());
                    nCuenta = Long.parseLong(txtNumeroCuenta.getText());
                    
                    c = new Cuenta(nCuenta,nIdentificacion);
                    
                    JOptionPane.showMessageDialog(this, "Cuenta creada exitosamente");
                    txtNumeroCuenta.setText("");
                    txtNumeroIdentificacion.setText("");
                    txtSaldoActual.setText("");
                    txtInteresAnual.setText("");
                    txtModificarSueldo.setText("");
                    txtNumeroCuenta.setEditable(false);
                    txtNumeroIdentificacion.setEditable(false);
                    txtSaldoActual.setEditable(false);
                    txtInteresAnual.setEditable(true);
                    txtModificarSueldo.setEditable(true);
                    cmdGuardar.setEnabled(false);
                    cmdIngreso.setEnabled(true);
                    cmdRetiro.setEnabled(true);
                    cmdMostrar.setEnabled(true);
                    cmdActualizarSaldo.setEnabled(true);
                    cmdLimpiar.setEnabled(true);
                    
                }
                else{
                nIdentificacion = Long.parseLong(txtNumeroIdentificacion.getText());
                nCuenta = Long.parseLong(txtNumeroCuenta.getText());
                sueldoA = Double.parseDouble(txtSaldoActual.getText());
                
                c = new Cuenta(nCuenta,nIdentificacion,sueldoA);
                
                JOptionPane.showMessageDialog(this, "Cuenta creada exitosamente");
                txtNumeroCuenta.setText("");
                txtNumeroIdentificacion.setText("");
                txtSaldoActual.setText("");
                txtInteresAnual.setText("");
                txtModificarSueldo.setText("");
                txtNumeroCuenta.setEditable(false);
                txtNumeroIdentificacion.setEditable(false);
                txtSaldoActual.setEditable(false);
                txtInteresAnual.setEditable(true);
                txtModificarSueldo.setEditable(true);
                cmdGuardar.setEnabled(false);
                cmdIngreso.setEnabled(true);
                cmdRetiro.setEnabled(true);
                cmdMostrar.setEnabled(true);
                cmdActualizarSaldo.setEnabled(true);
                cmdLimpiar.setEnabled(true);
                
               }
                
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Valor no valido", "Error", JOptionPane.ERROR_MESSAGE);
            } 
            
        }
        
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        String aux;
        if(c.getNumeroCuenta()==0 && c.getNumeroIdentificacion()==0){
            aux = "No hay cuenta que mostrar";
            txtNumeroCuenta.setEditable(false);
                txtNumeroIdentificacion.setEditable(false);
                txtSaldoActual.setEditable(false);
                txtInteresAnual.setEditable(false);
                txtModificarSueldo.setEditable(true);
                cmdGuardar.setEnabled(false);
                cmdIngreso.setEnabled(true);
                cmdRetiro.setEnabled(true);
                cmdMostrar.setEnabled(true);
                cmdActualizarSaldo.setEnabled(true);
                cmdLimpiar.setEnabled(true);
        }
        else{
        aux = c.mostrar();
        txtNumeroCuenta.setEditable(false);
                txtNumeroIdentificacion.setEditable(false);
                txtSaldoActual.setEditable(false);
                txtInteresAnual.setEditable(false);
                txtModificarSueldo.setEditable(true);
                cmdGuardar.setEnabled(false);
                cmdIngreso.setEnabled(true);
                cmdRetiro.setEnabled(true);
                cmdMostrar.setEnabled(true);
                cmdActualizarSaldo.setEnabled(true);
                cmdLimpiar.setEnabled(true);
        }
        txtResultado.setText(aux);
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdActualizarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActualizarSaldoActionPerformed
        double interesA;
        if (txtInteresAnual.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite el interes anual", "Error", JOptionPane.ERROR_MESSAGE);
            txtInteresAnual.requestFocusInWindow();
        }
        else if (Double.parseDouble(txtInteresAnual.getText().trim())==0){
            JOptionPane.showMessageDialog(this, "El interes no puede ser cero", "Error", JOptionPane.ERROR_MESSAGE);
            txtInteresAnual.requestFocusInWindow();
            txtInteresAnual.selectAll();
        }
        else{
            try{
                interesA = Double.parseDouble(txtInteresAnual.getText());
        c.actualizarSaldo(interesA);
        txtResultado.setText("Su saldo actual es: "+c.getSaldoActual());
        txtNumeroCuenta.setEditable(false);
                txtNumeroIdentificacion.setEditable(false);
                txtSaldoActual.setEditable(false);
                txtInteresAnual.setEditable(true);
                txtModificarSueldo.setEditable(true);
                cmdGuardar.setEnabled(false);
                cmdIngreso.setEnabled(true);
                cmdRetiro.setEnabled(true);
                cmdMostrar.setEnabled(true);
                cmdActualizarSaldo.setEnabled(true);
                cmdLimpiar.setEnabled(true);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Valor no valido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_cmdActualizarSaldoActionPerformed

    private void cmdIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIngresoActionPerformed
        double ingreso;
        if(txtModificarSueldo.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite el valor a ingresar", "Error", JOptionPane.ERROR_MESSAGE);
            txtModificarSueldo.requestFocusInWindow();
        }
        else{
            try{
                ingreso = Double.parseDouble(txtModificarSueldo.getText());
                c.ingresar(ingreso);
                txtResultado.setText("Su saldo actual es: "+c.getSaldoActual());
                txtModificarSueldo.setText("");
                txtNumeroCuenta.setEditable(false);
                txtNumeroIdentificacion.setEditable(false);
                txtSaldoActual.setEditable(false);
                txtInteresAnual.setEditable(true);
                txtModificarSueldo.setEditable(true);
                cmdGuardar.setEnabled(false);
                cmdIngreso.setEnabled(true);
                cmdRetiro.setEnabled(true);
                cmdMostrar.setEnabled(true);
                cmdActualizarSaldo.setEnabled(true);
                cmdLimpiar.setEnabled(true);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Valor no valido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_cmdIngresoActionPerformed

    private void cmdRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRetiroActionPerformed
        double egreso;
        if(txtModificarSueldo.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite el valor a retirar", "Error", JOptionPane.ERROR_MESSAGE);
            txtModificarSueldo.requestFocusInWindow();
        }
        else{
            try{
                egreso = Double.parseDouble(txtModificarSueldo.getText());
                if(c.getSaldoActual()>=egreso){
                   c.retirar(egreso);
                   txtResultado.setText("Su saldo actual es: "+c.getSaldoActual());
                   txtModificarSueldo.setText("");
                   txtNumeroCuenta.setEditable(false);
                txtNumeroIdentificacion.setEditable(false);
                txtSaldoActual.setEditable(false);
                txtInteresAnual.setEditable(true);
                txtModificarSueldo.setEditable(true);
                cmdGuardar.setEnabled(false);
                cmdIngreso.setEnabled(true);
                cmdRetiro.setEnabled(true);
                cmdMostrar.setEnabled(true);
                cmdActualizarSaldo.setEnabled(true);
                cmdLimpiar.setEnabled(true);
                }
                else{
                    JOptionPane.showMessageDialog(this, "El valor a retirar es mayor a su saldo actual", "Error", JOptionPane.ERROR_MESSAGE);
                    txtModificarSueldo.requestFocusInWindow();
                    txtModificarSueldo.selectAll();
                    txtNumeroCuenta.setEditable(false);
                txtNumeroIdentificacion.setEditable(false);
                txtSaldoActual.setEditable(false);
                txtInteresAnual.setEditable(true);
                txtModificarSueldo.setEditable(true);
                cmdGuardar.setEnabled(false);
                cmdIngreso.setEnabled(true);
                cmdRetiro.setEnabled(true);
                cmdMostrar.setEnabled(true);
                cmdActualizarSaldo.setEnabled(true);
                cmdLimpiar.setEnabled(true);
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Valor no valido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_cmdRetiroActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        int aux;
        aux = JOptionPane.showConfirmDialog(this, "¿Estás seguro(a) que deseas eliminar la cuenta?", "Pregunta", JOptionPane.YES_NO_OPTION);
        if (aux == JOptionPane.YES_OPTION){
            c = new Cuenta();
            JOptionPane.showMessageDialog(this, "Cuenta eliminada exitosamente");
            txtInteresAnual.setText("");
            txtResultado.setText("");
            txtModificarSueldo.setText("");
            txtNumeroCuenta.setEditable(true);
            txtNumeroIdentificacion.setEditable(true);
            txtSaldoActual.setEditable(true);
            txtInteresAnual.setEditable(true);
            txtModificarSueldo.setEditable(false);
            cmdGuardar.setEnabled(true);
            cmdIngreso.setEnabled(false);
            cmdRetiro.setEnabled(false);
            cmdMostrar.setEnabled(false);
            cmdActualizarSaldo.setEnabled(false);
            cmdLimpiar.setEnabled(true);
            txtNumeroCuenta.requestFocusInWindow();
        }
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void txtNumeroCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroCuentaKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroCuentaKeyTyped

    private void txtNumeroIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroIdentificacionKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroIdentificacionKeyTyped

    private void txtSaldoActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaldoActualKeyTyped
        
    }//GEN-LAST:event_txtSaldoActualKeyTyped

    private void txtInteresAnualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInteresAnualKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtInteresAnualKeyTyped

    private void txtModificarSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModificarSueldoKeyTyped
        
    }//GEN-LAST:event_txtModificarSueldoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdActualizarSaldo;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdIngreso;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdRetiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtInteresAnual;
    private javax.swing.JTextField txtModificarSueldo;
    private javax.swing.JTextField txtNumeroCuenta;
    private javax.swing.JTextField txtNumeroIdentificacion;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextField txtSaldoActual;
    // End of variables declaration//GEN-END:variables
}
