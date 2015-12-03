/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaPresentacio;

import capaDomini.CtrlDomini;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

/**
 *
 * @author edu
 */
public class PantallaInici extends javax.swing.JFrame {

    private CtrlPresentacio CP;
    private Font font;
    
    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaInici(CtrlPresentacio CP) {
        this.CP = CP;
        initComponents();
        pack();
        setVisible(true);      
        font = new Font(Font.SANS_SERIF,Font.PLAIN,12);
        /* Centra la pantalla */
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(new Point((screenSize.width - frameSize.width) / 2,
                              (screenSize.height - frameSize.height) / 2));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogInPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        signinLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        KenKenPanel = new javax.swing.JPanel();
        kenkenLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();
        mainMenu = new javax.swing.JMenuBar();
        menuitemFile = new javax.swing.JMenu();
        siginItemMenu = new javax.swing.JMenuItem();
        exitItemMenu = new javax.swing.JMenuItem();
        menuitemHelp = new javax.swing.JMenu();
        aboutItemMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KenKen");
        setBounds(new java.awt.Rectangle(300, 300, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setName("Inici"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        LogInPanel.setBackground(new Color(214,214,214,153));
        LogInPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));
        LogInPanel.setNextFocusableComponent(usernameField);
        LogInPanel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                LogInPanelPropertyChange(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        usernameLabel.setText("Username");
        usernameLabel.setAlignmentX(1.0F);

        usernameField.setAlignmentX(1.0F);
        usernameField.setNextFocusableComponent(passwordField);
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        usernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameFieldKeyPressed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        passwordLabel.setText("Password");
        passwordLabel.setAlignmentX(1.0F);

        passwordField.setAlignmentX(1.0F);
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        signinLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        signinLabel.setForeground(new java.awt.Color(0, 0, 255));
        signinLabel.setText("<html><u>Not registered?</u></html>");
        signinLabel.setAlignmentX(1.0F);
        signinLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signinLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                signinLabelFocusGained(evt);
            }
        });
        signinLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinLabelMouseClicked(evt);
            }
        });
        signinLabel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                signinLabelPropertyChange(evt);
            }
        });

        loginButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        loginButton.setText("Log In");
        loginButton.setToolTipText("Log In");
        loginButton.setAlignmentX(1.0F);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        errorLabel.setBackground(new Color(214,214,214,0));
        errorLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setMaximumSize(new java.awt.Dimension(151, 29));
        errorLabel.setMinimumSize(new java.awt.Dimension(151, 29));
        errorLabel.setOpaque(true);
        errorLabel.setPreferredSize(new java.awt.Dimension(151, 29));

        javax.swing.GroupLayout LogInPanelLayout = new javax.swing.GroupLayout(LogInPanel);
        LogInPanel.setLayout(LogInPanelLayout);
        LogInPanelLayout.setHorizontalGroup(
            LogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogInPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LogInPanelLayout.createSequentialGroup()
                        .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(usernameField)
                    .addComponent(passwordField)
                    .addComponent(signinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel)
                    .addComponent(usernameLabel))
                .addContainerGap())
        );
        LogInPanelLayout.setVerticalGroup(
            LogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogInPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(LogInPanel);
        LogInPanel.setBounds(440, 150, 281, 215);

        KenKenPanel.setPreferredSize(new java.awt.Dimension(200, 200));

        kenkenLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaPresentacio/img/kenken.jpg"))); // NOI18N

        javax.swing.GroupLayout KenKenPanelLayout = new javax.swing.GroupLayout(KenKenPanel);
        KenKenPanel.setLayout(KenKenPanelLayout);
        KenKenPanelLayout.setHorizontalGroup(
            KenKenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(KenKenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(KenKenPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(kenkenLabel)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        KenKenPanelLayout.setVerticalGroup(
            KenKenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
            .addGroup(KenKenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(KenKenPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(kenkenLabel)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(KenKenPanel);
        KenKenPanel.setBounds(60, 150, 300, 225);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaPresentacio/img/background.jpeg"))); // NOI18N
        backgroundLabel.setOpaque(true);
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 800, 600);

        mainMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        mainMenu.setName(""); // NOI18N

        menuitemFile.setText("File");

        siginItemMenu.setText("Sign In");
        siginItemMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siginItemMenuMouseClicked(evt);
            }
        });
        siginItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siginItemMenuActionPerformed(evt);
            }
        });
        menuitemFile.add(siginItemMenu);

        exitItemMenu.setText("Exit");
        exitItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemMenuActionPerformed(evt);
            }
        });
        menuitemFile.add(exitItemMenu);

        mainMenu.add(menuitemFile);

        menuitemHelp.setText("Help");

        aboutItemMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaPresentacio/img/Help.png"))); // NOI18N
        aboutItemMenu.setText("About");
        aboutItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutItemMenuActionPerformed(evt);
            }
        });
        menuitemHelp.add(aboutItemMenu);

        mainMenu.add(menuitemHelp);

        setJMenuBar(mainMenu);

        getAccessibleContext().setAccessibleName("Inici");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitItemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitItemMenuActionPerformed

    private void aboutItemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutItemMenuActionPerformed
        About about = new About(this);
        about.setVisible(true);
    }//GEN-LAST:event_aboutItemMenuActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void siginItemMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siginItemMenuMouseClicked

    }//GEN-LAST:event_siginItemMenuMouseClicked

    private void signinLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinLabelMouseClicked
        SignIn signin = new SignIn(this);
        signin.setVisible(true);
    }//GEN-LAST:event_signinLabelMouseClicked

    private void signinLabelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_signinLabelPropertyChange

    }//GEN-LAST:event_signinLabelPropertyChange

    private void signinLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signinLabelFocusGained

    }//GEN-LAST:event_signinLabelFocusGained

    private void LogInPanelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_LogInPanelPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_LogInPanelPropertyChange

    private void siginItemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siginItemMenuActionPerformed
        SignIn signin = new SignIn(this);
        signin.setVisible(true);
    }//GEN-LAST:event_siginItemMenuActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String nom = usernameField.getText();
        String pwd = String.valueOf(passwordField.getPassword());
        if (CP.comprovarUsuari(nom,pwd)) {
            PantallaPrincipal P = new PantallaPrincipal(nom, CP, this);
            dispose();
        }
        else {
            errorLabel.setText("<html>Username or password<br>are incorrect</html>");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void usernameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String nom = usernameField.getText();
            String pwd = String.valueOf(passwordField.getPassword());
            if (CP.comprovarUsuari(nom,pwd)) {
                PantallaPrincipal P = new PantallaPrincipal(nom, CP, this);
                dispose();
            }
            else {
                errorLabel.setText("<html>Username or password<br>are incorrect</html>");
            }
        }
    }//GEN-LAST:event_usernameFieldKeyPressed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String nom = usernameField.getText();
            String pwd = String.valueOf(passwordField.getPassword());
            if (CP.comprovarUsuari(nom,pwd)) {
                PantallaPrincipal P = new PantallaPrincipal(nom, CP, this);
                dispose();
            }
            else {
                errorLabel.setText("<html>Username or password<br>are incorrect</html>");
            }
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel KenKenPanel;
    private javax.swing.JPanel LogInPanel;
    private javax.swing.JMenuItem aboutItemMenu;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JMenuItem exitItemMenu;
    private javax.swing.JLabel kenkenLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JMenuBar mainMenu;
    private javax.swing.JMenu menuitemFile;
    private javax.swing.JMenu menuitemHelp;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JMenuItem siginItemMenu;
    private javax.swing.JLabel signinLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
