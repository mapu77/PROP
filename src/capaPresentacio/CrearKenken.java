/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaPresentacio;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

/**
 *
 * @author Oriolcapo
 */
public class CrearKenken extends javax.swing.JPanel {

    private String user;
    private javax.swing.JFrame parent;
    /**
     * Creates new form Crear_Kenken
     */
    public CrearKenken() {
        initComponents();
    }
    
    public CrearKenken(String u, javax.swing.JFrame p) {
        super();
        parent = p;
        user = u;
        initComponents();
        
        /*Rectangle parentBounds = parent.getBounds();
        Dimension size = getSize();
        // Center in the parent
        int x = Math.max(0, parentBounds.x + (parentBounds.width - size.width) / 2);
        int y = Math.max(0, parentBounds.y + (parentBounds.height - size.height) / 2);
        setLocation();*/
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
        Boto_Manually = new javax.swing.JButton();
        Boto_ByParameters = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setLayout(new java.awt.CardLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create KenKen", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        Boto_Manually.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Boto_Manually.setText("Manually");
        Boto_Manually.setMaximumSize(new java.awt.Dimension(200, 200));
        Boto_Manually.setMinimumSize(new java.awt.Dimension(200, 200));
        Boto_Manually.setPreferredSize(new java.awt.Dimension(200, 200));
        Boto_Manually.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boto_ManuallyActionPerformed(evt);
            }
        });

        Boto_ByParameters.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Boto_ByParameters.setText("By Parameters");
        Boto_ByParameters.setMaximumSize(new java.awt.Dimension(200, 200));
        Boto_ByParameters.setMinimumSize(new java.awt.Dimension(200, 200));
        Boto_ByParameters.setPreferredSize(new java.awt.Dimension(200, 200));
        Boto_ByParameters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boto_ByParametersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Boto_Manually, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(Boto_ByParameters, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boto_Manually, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boto_ByParameters, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void Boto_ManuallyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boto_ManuallyActionPerformed
        // TODO add your handling code here:
        removeAll();
        repaint();
        revalidate();
        //afegint JPanel
        add(new CrearKenkenManualment(user,parent));
        repaint();
        revalidate();        
    }//GEN-LAST:event_Boto_ManuallyActionPerformed

    private void Boto_ByParametersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boto_ByParametersActionPerformed
        // TODO add your handling code here:
                //esborrant JPanel
        removeAll();
        repaint();
        revalidate();
        //afegint JPanel
        add(new CrearKenkenByParameters(user,parent));
        repaint();
        revalidate();
    }//GEN-LAST:event_Boto_ByParametersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boto_ByParameters;
    private javax.swing.JButton Boto_Manually;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
