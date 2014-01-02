/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package función.trigonométrica;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Trigonométrica extends javax.swing.JFrame {

    /**
     * Creates new form Trigonométrica
     */
    public Trigonométrica() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        TextField_Adyacente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Button_Run = new javax.swing.JButton();
        TextField_Opuesto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TextField_Hipotenusa = new javax.swing.JTextField();
        RadioButton_Adyacente = new javax.swing.JRadioButton();
        RadioButton_Hipotenusa = new javax.swing.JRadioButton();
        RadioButton_Opuesto = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FunciónTrigonométrica");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Trigono.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("cm");

        Button_Run.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Button_Run.setText("Run");
        Button_Run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RunActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("cm");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("cm");

        buttonGroup1.add(RadioButton_Adyacente);
        RadioButton_Adyacente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RadioButton_Adyacente.setSelected(true);
        RadioButton_Adyacente.setText("Adyacente");
        RadioButton_Adyacente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton_AdyacenteActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadioButton_Hipotenusa);
        RadioButton_Hipotenusa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RadioButton_Hipotenusa.setText("Hipotenusa");
        RadioButton_Hipotenusa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton_HipotenusaActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadioButton_Opuesto);
        RadioButton_Opuesto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RadioButton_Opuesto.setText("Opuesto");
        RadioButton_Opuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton_OpuestoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(TextField_Hipotenusa, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addGap(29, 29, 29)))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextField_Opuesto))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextField_Adyacente, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addComponent(Button_Run)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(RadioButton_Adyacente)
                        .addGap(44, 44, 44)
                        .addComponent(RadioButton_Hipotenusa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RadioButton_Opuesto)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextField_Hipotenusa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextField_Opuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RadioButton_Adyacente)
                            .addComponent(RadioButton_Hipotenusa)
                            .addComponent(RadioButton_Opuesto))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_Adyacente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(Button_Run)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void Trigonometria(){
       //Declaro 6 variables de tipo double
       double adyacente, hipotenusa, opuesto, a, b, r;
       
       //Condición que evalúa el RadioButton si es seleccionado
       if (RadioButton_Adyacente.isSelected()) {
            //Condición que valida los TextField si  estos están vacío 
           if (TextField_Hipotenusa.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Ingrese un valor la campo del texto");
               //Coloca el Focus en el TextField_Hipotenusa
               TextField_Hipotenusa.requestFocus();
           
          }else{
           if (TextField_Opuesto.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Ingrese un valor la campo del texto");
               //Coloca el Focus en el TextField_Opuesto
               TextField_Opuesto.requestFocus();
           }else{
               /* Para sacar el Adyacente
                  Funciones que convierte en un tipo double el valor que se ingrese por 
                  los TextField y lo almacena en la variable opuesto y hipotenusa */
               opuesto = Double.parseDouble(TextField_Opuesto.getText());
               hipotenusa = Double.parseDouble(TextField_Hipotenusa.getText());
              /* Eleva al cuadrado el dato almacenado en las variable 
                 opuesto hipotenusa y loa almacena  en las variables a,b */
                a = Math.pow(hipotenusa, 2);
                b = Math.pow(opuesto, 2);
                //Resta los datos almacenado en las variables a, b
                r = a-b;
                /* Saca la raíz cuadrada del dato almacenado en la variable r y lo 
                   almacena en la variable adyacente */
                 adyacente = Math.sqrt(r);
                 JOptionPane.showMessageDialog(null, "Adyacente " + adyacente+ " Cm");
           }
           }
       }else{
           //Condición que evalúa el RadioButton si es seleccionado
       if (RadioButton_Hipotenusa.isSelected()) {
            //Condición que valida los TextField si  estos están vacío 
           if (TextField_Opuesto.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Ingrese un valor la campo del texto");
               //Coloca el Focus en el TextField_Opuesto
               TextField_Opuesto.requestFocus();
           
          }else{
           if (TextField_Adyacente.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Ingrese un valor la campo del texto");
               //Coloca el Focus en el TextField_Adyacente
               TextField_Adyacente.requestFocus();
           }else{
               /* Para sacar la Hipotenusa
                  Funciones que convierte en un tipo double el valor que se ingrese por 
                  los TextField y lo almacena en la variable opuesto y hipotenusa */
              opuesto = Double.parseDouble(TextField_Opuesto.getText());
              adyacente = Double.parseDouble(TextField_Adyacente.getText());
              /* Eleva al cuadrado el dato almacenado en las variable 
                 opuesto adyacente y loa almacena  en las variables a,b */
                a = Math.pow(opuesto, 2);
                b = Math.pow(adyacente, 2);
                //Suma los datos almacenado en las variables a, b
                r = a+b;
                /* Saca la raíz cuadrada del dato almacenado en la variable r y lo 
                   almacena en la variable hipotenusa */
                 hipotenusa = Math.sqrt(r);
                 JOptionPane.showMessageDialog(null, "Hipotenusa " + hipotenusa+ " Cm");
                }
              }
            }else{
               //Condición que evalúa el RadioButton si es seleccionado
       if (RadioButton_Opuesto.isSelected()) {
            //Condición que valida los TextField si  estos están vacío 
           if (TextField_Hipotenusa.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Ingrese un valor la campo del texto");
               //Coloca el Focus en el TextField_Hipotenusa
               TextField_Hipotenusa.requestFocus();
           
          }else{
           if (TextField_Adyacente.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Ingrese un valor la campo del texto");
               //Coloca el Focus en el TextField_Adyacente
               TextField_Adyacente.requestFocus();
           }else{
               /* Para sacar el lado opuesto
                  Funciones que convierte en un tipo double el valor que se ingrese por 
                  los TextField y lo almacena en la variable adyacente y hipotenusa */
              adyacente = Double.parseDouble(TextField_Adyacente.getText());
               hipotenusa = Double.parseDouble(TextField_Hipotenusa.getText());
              /* Eleva al cuadrado el dato almacenado en las variable 
                 opuesto adyacente y loa almacena  en las variables a,b */
                a = Math.pow(hipotenusa, 2);
                b = Math.pow(adyacente, 2);
                //Suma los datos almacenado en las variables a, b
                r = a-b;
                /* Saca la raíz cuadrada del dato almacenado en la variable r y lo 
                   almacena en la variable hipotenusa */
                 opuesto = Math.sqrt(r);
                 JOptionPane.showMessageDialog(null, "Opuesto " + opuesto+ " Cm");
                }
              }
            }
          }
      }
   }
    private void RadioButton_AdyacenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton_AdyacenteActionPerformed
        //Oculta el TextField_Adyacente
         TextField_Adyacente.setVisible(false);
         TextField_Hipotenusa.setVisible(true);
         TextField_Opuesto.setVisible(true);
         TextField_Hipotenusa.setText("");
         TextField_Opuesto.setText("");
    }//GEN-LAST:event_RadioButton_AdyacenteActionPerformed

    private void RadioButton_HipotenusaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton_HipotenusaActionPerformed
        //Oculta el TextField_Hipotenusa
         TextField_Adyacente.setVisible(true);
         TextField_Hipotenusa.setVisible(false);
         TextField_Opuesto.setVisible(true);
         TextField_Adyacente.setText("");
         TextField_Opuesto.setText("");
    }//GEN-LAST:event_RadioButton_HipotenusaActionPerformed

    private void RadioButton_OpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton_OpuestoActionPerformed
         //Oculta el TextField_Hipotenusa
         TextField_Adyacente.setVisible(true);
         TextField_Hipotenusa.setVisible(true);
         TextField_Opuesto.setVisible(false);
         TextField_Adyacente.setText("");
         TextField_Hipotenusa.setText("");
    }//GEN-LAST:event_RadioButton_OpuestoActionPerformed

    private void Button_RunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RunActionPerformed
        Trigonometria();
    }//GEN-LAST:event_Button_RunActionPerformed
   
   
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
            java.util.logging.Logger.getLogger(Trigonométrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trigonométrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trigonométrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trigonométrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trigonométrica().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Run;
    private javax.swing.JRadioButton RadioButton_Adyacente;
    private javax.swing.JRadioButton RadioButton_Hipotenusa;
    private javax.swing.JRadioButton RadioButton_Opuesto;
    private javax.swing.JTextField TextField_Adyacente;
    private javax.swing.JTextField TextField_Hipotenusa;
    private javax.swing.JTextField TextField_Opuesto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
