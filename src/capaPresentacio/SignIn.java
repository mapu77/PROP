package capaPresentacio;

import capaDomini.Usuari.CtrlUser;
import capaDomini.Usuari.User;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JOptionPane;

/**
 *
 * @author edu
 */
public class SignIn extends javax.swing.JFrame {

    private static CtrlPresentacio CP;
    private javax.swing.JFrame parent;
    /**
     * Creates new form SignIn
     */
    public SignIn(javax.swing.JFrame parent, CtrlPresentacio CP) {
        super("Sign In");
        this.parent = parent;
        System.out.println("Mostrant sign in");
        this.CP = CP;
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        setMinimumSize(new Dimension(400, 300));
        setMaximumSize(new Dimension(400, 300));
        setSize(new Dimension(400, 300));
        
        Rectangle parentBounds = parent.getBounds();
        Dimension size = getSize();        
        
        // Center in the parent
        int x = Math.max(0, parentBounds.x + (parentBounds.width - size.width) / 2);
        int y = Math.max(0, parentBounds.y + (parentBounds.height - size.height) / 2);
        setLocation(new Point(x, y));    
        
        /* Colors traslucids */
        buttonPanel.setBackground(new Color(214,214,214,0));
        registerPanel.setBackground(new Color(214,214,214,153));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        repeatField = new javax.swing.JPasswordField();
        buttonPanel = new javax.swing.JPanel();
        createButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sign In");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        registerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        usernameLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        usernameLabel.setText("Username");

        usernameField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        usernameField.setText("Enter your username");
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFieldFocusLost(evt);
            }
        });
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        passwordLabel.setText("Password");

        passwordField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        passwordField.setText("jPasswordField1");
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });

        repeatField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        repeatField.setText("jPasswordField1");
        repeatField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                repeatFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                repeatFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(passwordField)
                    .addComponent(repeatField)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(repeatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(registerPanel);
        registerPanel.setBounds(12, 11, 376, 210);

        createButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        createButton.setText("Create User");
        createButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        resetButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        resetButton.setText("Reset");
        resetButton.setPreferredSize(new java.awt.Dimension(80, 29));
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(buttonPanel);
        buttonPanel.setBounds(12, 229, 376, 40);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaPresentacio/img/background.jpeg"))); // NOI18N
        backgroundLabel.setMaximumSize(new java.awt.Dimension(400, 300));
        backgroundLabel.setMinimumSize(new java.awt.Dimension(400, 300));
        backgroundLabel.setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 400, 300);
        backgroundLabel.getAccessibleContext().setAccessibleName("SignIn");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        passwordField.setText("");
        repeatField.setText("");
        usernameField.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        String nom = usernameField.getText();
        String pass = String.valueOf(passwordField.getPassword());
        if (pass.equals(String.valueOf(repeatField.getPassword()))) {
            if (CtrlUser.afegeixUsuari(nom, pass)) {
                JOptionPane.showMessageDialog(this,
                    "Your username has been created successfully", 
                    "Information", 
                    JOptionPane.INFORMATION_MESSAGE);
                PantallaPrincipal P = new PantallaPrincipal(nom, CP, this);
                parent.dispose();
                dispose();
            }
            else {
                JOptionPane.showMessageDialog(this,
                    "This username already exists\n"
                            +"Please, try another one", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(this,
                    "Passwords don't match", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_createButtonActionPerformed

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusGained
        usernameField.setText("");
    }//GEN-LAST:event_usernameFieldFocusGained

    private void usernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusLost
        if (usernameField.getText().isEmpty()) usernameField.setText("Enter here your username");
    }//GEN-LAST:event_usernameFieldFocusLost

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        passwordField.setText("");
    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        if (passwordField.getPassword().length == 0) passwordField.setText("jPasswordField1");
    }//GEN-LAST:event_passwordFieldFocusLost

    private void repeatFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_repeatFieldFocusGained
        repeatField.setText("");
    }//GEN-LAST:event_repeatFieldFocusGained

    private void repeatFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_repeatFieldFocusLost
        if (passwordField.getPassword().length == 0) repeatField.setText("jPasswordField1");
    }//GEN-LAST:event_repeatFieldFocusLost

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        System.out.println("Tancant sign in");
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton createButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JPasswordField repeatField;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
