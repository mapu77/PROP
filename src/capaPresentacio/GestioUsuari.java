/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaPresentacio;

/**
 *
 * @author Oriolcapo
 */
public class GestioUsuari extends javax.swing.JPanel {

    /**
     * Creates new form GestioUsuari
     */
    public GestioUsuari() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserSettingsPanel = new javax.swing.JPanel();
        PasswordTitle = new javax.swing.JLabel();
        passwordFieldOld = new javax.swing.JTextField();
        NewPasswordTitle = new javax.swing.JLabel();
        passwordFieldNew = new javax.swing.JTextField();
        passwordFieldNew2 = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        ImgSettings = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 500));

        UserSettingsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User settings", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        UserSettingsPanel.setMaximumSize(new java.awt.Dimension(600, 500));
        UserSettingsPanel.setMinimumSize(new java.awt.Dimension(590, 490));

        PasswordTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PasswordTitle.setText("Change Password");

        passwordFieldOld.setText("Introduce your password...");
        passwordFieldOld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldOldActionPerformed(evt);
            }
        });

        NewPasswordTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NewPasswordTitle.setText("New Password");

        passwordFieldNew.setText("Introduce your password... (Min. 5 characters)");
        passwordFieldNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldNewActionPerformed(evt);
            }
        });

        passwordFieldNew2.setText("Repeat the new password...");
        passwordFieldNew2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldNew2ActionPerformed(evt);
            }
        });

        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaPresentacio/img/SaveButtonn.png"))); // NOI18N
        SaveButton.setText("Save");

        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaPresentacio/img/ExitButton.png"))); // NOI18N
        ExitButton.setText("Exit");

        ImgSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaPresentacio/img/UserSettings.png"))); // NOI18N

        javax.swing.GroupLayout UserSettingsPanelLayout = new javax.swing.GroupLayout(UserSettingsPanel);
        UserSettingsPanel.setLayout(UserSettingsPanelLayout);
        UserSettingsPanelLayout.setHorizontalGroup(
            UserSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserSettingsPanelLayout.createSequentialGroup()
                .addGroup(UserSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordTitle)
                    .addComponent(NewPasswordTitle)
                    .addGroup(UserSettingsPanelLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(ImgSettings)))
                .addGap(0, 219, Short.MAX_VALUE))
            .addGroup(UserSettingsPanelLayout.createSequentialGroup()
                .addGroup(UserSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UserSettingsPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SaveButton)
                        .addGap(8, 8, 8)
                        .addComponent(ExitButton))
                    .addComponent(passwordFieldNew2)
                    .addComponent(passwordFieldNew)
                    .addComponent(passwordFieldOld, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        UserSettingsPanelLayout.setVerticalGroup(
            UserSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserSettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PasswordTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordFieldOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NewPasswordTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordFieldNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordFieldNew2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(UserSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton)
                    .addComponent(ExitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(ImgSettings)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserSettingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserSettingsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFieldOldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldOldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldOldActionPerformed

    private void passwordFieldNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldNewActionPerformed

    private void passwordFieldNew2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldNew2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldNew2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel ImgSettings;
    private javax.swing.JLabel NewPasswordTitle;
    private javax.swing.JLabel PasswordTitle;
    private javax.swing.JButton SaveButton;
    private javax.swing.JPanel UserSettingsPanel;
    private javax.swing.JTextField passwordFieldNew;
    private javax.swing.JTextField passwordFieldNew2;
    private javax.swing.JTextField passwordFieldOld;
    // End of variables declaration//GEN-END:variables
}
