package Form;
import Conexion.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Editar extends javax.swing.JFrame {
    
    Conection cc = new Conection();
    Connection cn = cc.conexion();
   
    public Editar() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarDatos();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdGuardar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCurso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCalificacion = new javax.swing.JTextField();
        cmdCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtAlumnos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmdGuardar.setText("Actualizar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombres del Alumno:");

        jLabel2.setText("Apellidos del Alumno:");

        jLabel3.setText("Curso:");

        jLabel4.setText("Calificacion:");

        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Id:");

        txtID.setEditable(false);

        jtAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellidos", "Curso", "Calificacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAlumnosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtAlumnos);
        if (jtAlumnos.getColumnModel().getColumnCount() > 0) {
            jtAlumnos.getColumnModel().getColumn(0).setResizable(false);
            jtAlumnos.getColumnModel().getColumn(1).setResizable(false);
            jtAlumnos.getColumnModel().getColumn(2).setResizable(false);
            jtAlumnos.getColumnModel().getColumn(3).setResizable(false);
            jtAlumnos.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCalificacion)
                    .addComponent(txtCurso)
                    .addComponent(txtApellidos)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre)
                    .addComponent(jLabel5)
                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdCancelar)
                            .addComponent(cmdGuardar)
                            .addComponent(cmdLimpiar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        modificar();
        borrarDatos();
        mostrarDatos();
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        borrarDatos();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        Menu Men = new Menu();
        Men.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void jtAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAlumnosMouseClicked
       int filaSelect = jtAlumnos.getSelectedRow();
       String id = (String) jtAlumnos.getValueAt(filaSelect, 0);
       txtID.setText(id);
       
       txtNombre.setText((String) jtAlumnos.getValueAt(filaSelect, 1));
       txtApellidos.setText((String) jtAlumnos.getValueAt(filaSelect, 2));
       txtCurso.setText((String) jtAlumnos.getValueAt(filaSelect, 3));
       txtCalificacion.setText((String) jtAlumnos.getValueAt(filaSelect, 4));
    }//GEN-LAST:event_jtAlumnosMouseClicked

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
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar().setVisible(true);
            }
        });
    }

    
     public void borrarDatos()
    {
        this.txtID.setText("");
        this.txtNombre.setText("");
        this.txtApellidos.setText("");
        this.txtCurso.setText("");
        this.txtCalificacion.setText("");
    }
    
    public void modificar(){
        
    try{
    
        String SQL = "update alumnos set nombres =?, apellidos =?,curso=?, calificacion =? where idalumnos = ?";
        
        int filaSelect = jtAlumnos.getSelectedRow();
        String id = (String) jtAlumnos.getValueAt(filaSelect, 0);
        PreparedStatement pst = cn.prepareStatement(SQL);
        
        
        pst.setString(1, txtNombre.getText());
        pst.setString(2, txtApellidos.getText());
        pst.setString(3,txtCurso.getText());
        pst.setString(4, txtCalificacion.getText());
        pst.setString(5, id);
        pst.execute();
        
        JOptionPane.showMessageDialog(null,"Registro Actualizado Exitosamente");
        
    }catch (Exception e)
    {
        JOptionPane.showMessageDialog(null,"Error al Registrar");
        
    }
    }
    
 public void mostrarDatos()
    {
    
        String[] titulos = {"ID","Nombre","Apellidos", "Curso", "Calificacion"};
        
        String[] registros = new String[7];
        
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
        String sql = "select * from  alumnos";
        
        try{
        
        Statement  st = cn.createStatement();
        ResultSet  rs = st.executeQuery(sql);
        
        while(rs.next()){
        
            registros[0] = rs.getString("idAlumnos");
            registros[1] = rs.getString(("Nombres"));
            registros[2] = rs.getString("Apellidos");
            registros[3] = rs.getString("Curso");
            registros[4] = rs.getString("Calificacion");
            
            modelo.addRow(registros);
        }
        
        jtAlumnos.setModel(modelo);
        
        } catch (Exception e)
        {
        JOptionPane.showMessageDialog(null, "Error al mostrar Datos" + e.getMessage());
        }
        
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtAlumnos;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCalificacion;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
