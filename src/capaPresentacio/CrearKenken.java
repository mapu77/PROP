/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaPresentacio;

import capaDomini.Utils.CtrlJoc;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Oriolcapo
 */
public class CrearKenken extends javax.swing.JPanel {

    private String user;
    private javax.swing.JFrame parent;
    private String dif;
    private CtrlPresentacio CP;
    private CtrlJoc CJ;

    public CrearKenken() {
        initComponents();
    }
    
    public CrearKenken(String u, javax.swing.JFrame p, int index, CtrlPresentacio CP, CtrlJoc CJ) {
        super();
        parent = p;
        user = u;
        dif = "-";
        initComponents();        
        tabMenu.setSelectedIndex(index);
        this.CP = CP;
        this.CJ = CJ;
        PreviewPanel.setForeground(Color.black);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createPanel = new javax.swing.JPanel();
        tabMenu = new javax.swing.JTabbedPane();
        manualPanel = new javax.swing.JPanel();
        diffLabel = new javax.swing.JLabel();
        BoxDificultat = new javax.swing.JComboBox<>();
        PreviewLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        EditButton = new javax.swing.JButton();
        CreateSaveM = new javax.swing.JButton();
        CreatePlayM = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        PreviewPanel = new javax.swing.JPanel();
        Tauler = new javax.swing.JPanel();
        paramPanel = new javax.swing.JPanel();
        difLabel = new javax.swing.JLabel();
        difBox = new javax.swing.JComboBox<>();
        fixedLabel = new javax.swing.JLabel();
        operandLabel = new javax.swing.JLabel();
        Boto_Suma = new javax.swing.JButton();
        Boto_Resta = new javax.swing.JButton();
        Boto_Mult = new javax.swing.JButton();
        Boto_Div = new javax.swing.JButton();
        previewLabel = new javax.swing.JLabel();
        CreateSaveP = new javax.swing.JButton();
        CreatePlayP = new javax.swing.JButton();
        fixedFField = new javax.swing.JFormattedTextField();
        GenerateButton = new javax.swing.JButton();
        PreviewPanel1 = new javax.swing.JPanel();
        Tauler1 = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(598, 496));
        setLayout(new java.awt.CardLayout());

        createPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create KenKen", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        createPanel.setPreferredSize(new java.awt.Dimension(598, 496));

        tabMenu.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tabMenu.setPreferredSize(new java.awt.Dimension(575, 465));

        manualPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                manualPanelMouseReleased(evt);
            }
        });

        diffLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        diffLabel.setText("Select difficulty");

        BoxDificultat.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        BoxDificultat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "3x3", "4x4", "5x5", "6x6", "7x7", "8x8", "9x9" }));
        BoxDificultat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxDificultatActionPerformed(evt);
            }
        });

        PreviewLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        PreviewLabel.setText("Preview:");

        EditButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        EditButton.setText("Edit");
        EditButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        CreateSaveM.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CreateSaveM.setText("Create&Save");
        CreateSaveM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CreateSaveM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateSaveMActionPerformed(evt);
            }
        });

        CreatePlayM.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CreatePlayM.setText("Create&Play");
        CreatePlayM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CreatePlayM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatePlayMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreateSaveM, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreatePlayM, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CreateSaveM, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CreatePlayM, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));

        PreviewPanel.setMaximumSize(new java.awt.Dimension(350, 350));
        PreviewPanel.setMinimumSize(new java.awt.Dimension(350, 350));
        PreviewPanel.setPreferredSize(new java.awt.Dimension(350, 350));
        PreviewPanel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PreviewPanelFocusGained(evt);
            }
        });
        PreviewPanel.setLayout(new java.awt.CardLayout());

        Tauler.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tauler.setMaximumSize(new java.awt.Dimension(350, 350));
        Tauler.setMinimumSize(new java.awt.Dimension(350, 350));
        Tauler.setPreferredSize(new java.awt.Dimension(350, 350));

        javax.swing.GroupLayout TaulerLayout = new javax.swing.GroupLayout(Tauler);
        Tauler.setLayout(TaulerLayout);
        TaulerLayout.setHorizontalGroup(
            TaulerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );
        TaulerLayout.setVerticalGroup(
            TaulerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );

        PreviewPanel.add(Tauler, "card2");

        javax.swing.GroupLayout manualPanelLayout = new javax.swing.GroupLayout(manualPanel);
        manualPanel.setLayout(manualPanelLayout);
        manualPanelLayout.setHorizontalGroup(
            manualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manualPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manualPanelLayout.createSequentialGroup()
                        .addGroup(manualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BoxDificultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diffLabel)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(manualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PreviewLabel)
                    .addComponent(PreviewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        manualPanelLayout.setVerticalGroup(
            manualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manualPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diffLabel)
                    .addComponent(PreviewLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(manualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manualPanelLayout.createSequentialGroup()
                        .addComponent(BoxDificultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(PreviewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        tabMenu.addTab("Manually", manualPanel);

        difLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        difLabel.setText("Select difficulty");

        difBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        difBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "3x3", "4x4", "5x5", "6x6", "7x7", "8x8", "9x9" }));
        difBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difBoxActionPerformed(evt);
            }
        });

        fixedLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        fixedLabel.setText("<html>Minimum number<br>of fixed numbers</html>");

        operandLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        operandLabel.setText("Select the operands");

        Boto_Suma.setBackground(java.awt.Color.gray);
        Boto_Suma.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Boto_Suma.setText("+");
        Boto_Suma.setMaximumSize(new java.awt.Dimension(30, 30));
        Boto_Suma.setMinimumSize(new java.awt.Dimension(30, 30));
        Boto_Suma.setPreferredSize(new java.awt.Dimension(40, 35));
        Boto_Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boto_SumaActionPerformed(evt);
            }
        });

        Boto_Resta.setBackground(java.awt.Color.white);
        Boto_Resta.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Boto_Resta.setText("-");
        Boto_Resta.setToolTipText("");
        Boto_Resta.setMaximumSize(new java.awt.Dimension(30, 30));
        Boto_Resta.setMinimumSize(new java.awt.Dimension(30, 30));
        Boto_Resta.setPreferredSize(new java.awt.Dimension(40, 35));
        Boto_Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boto_RestaActionPerformed(evt);
            }
        });

        Boto_Mult.setBackground(java.awt.Color.white);
        Boto_Mult.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Boto_Mult.setText("x");
        Boto_Mult.setMaximumSize(new java.awt.Dimension(30, 30));
        Boto_Mult.setMinimumSize(new java.awt.Dimension(30, 30));
        Boto_Mult.setPreferredSize(new java.awt.Dimension(40, 35));
        Boto_Mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boto_MultActionPerformed(evt);
            }
        });

        Boto_Div.setBackground(java.awt.Color.white);
        Boto_Div.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Boto_Div.setText("/");
        Boto_Div.setMaximumSize(new java.awt.Dimension(30, 30));
        Boto_Div.setMinimumSize(new java.awt.Dimension(30, 30));
        Boto_Div.setPreferredSize(new java.awt.Dimension(40, 35));
        Boto_Div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boto_DivActionPerformed(evt);
            }
        });

        previewLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        previewLabel.setText("Preview:");

        CreateSaveP.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CreateSaveP.setText("Create&Save");
        CreateSaveP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CreateSaveP.setEnabled(false);
        CreateSaveP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateSavePActionPerformed(evt);
            }
        });

        CreatePlayP.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CreatePlayP.setText("Create&Play");
        CreatePlayP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CreatePlayP.setEnabled(false);
        CreatePlayP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatePlayPActionPerformed(evt);
            }
        });

        fixedFField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        fixedFField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fixedFField.setMaximumSize(new java.awt.Dimension(50, 27));
        fixedFField.setMinimumSize(new java.awt.Dimension(50, 27));
        fixedFField.setPreferredSize(new java.awt.Dimension(50, 27));
        fixedFField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                fixedFFieldInputMethodTextChanged(evt);
            }
        });
        fixedFField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fixedFFieldActionPerformed(evt);
            }
        });
        fixedFField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fixedFFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fixedFFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fixedFFieldKeyTyped(evt);
            }
        });

        GenerateButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GenerateButton.setText("Generate");
        GenerateButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GenerateButton.setEnabled(false);
        GenerateButton.setMaximumSize(new java.awt.Dimension(75, 36));
        GenerateButton.setMinimumSize(new java.awt.Dimension(75, 36));
        GenerateButton.setName(""); // NOI18N
        GenerateButton.setPreferredSize(new java.awt.Dimension(75, 36));
        GenerateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateButtonActionPerformed(evt);
            }
        });

        PreviewPanel1.setMaximumSize(new java.awt.Dimension(350, 350));
        PreviewPanel1.setMinimumSize(new java.awt.Dimension(350, 350));
        PreviewPanel1.setPreferredSize(new java.awt.Dimension(350, 350));
        PreviewPanel1.setLayout(new java.awt.CardLayout());

        Tauler1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tauler1.setMaximumSize(new java.awt.Dimension(350, 352));
        Tauler1.setMinimumSize(new java.awt.Dimension(350, 352));

        javax.swing.GroupLayout Tauler1Layout = new javax.swing.GroupLayout(Tauler1);
        Tauler1.setLayout(Tauler1Layout);
        Tauler1Layout.setHorizontalGroup(
            Tauler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );
        Tauler1Layout.setVerticalGroup(
            Tauler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        PreviewPanel1.add(Tauler1, "card2");

        javax.swing.GroupLayout paramPanelLayout = new javax.swing.GroupLayout(paramPanel);
        paramPanel.setLayout(paramPanelLayout);
        paramPanelLayout.setHorizontalGroup(
            paramPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paramPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paramPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CreatePlayP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CreateSaveP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fixedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(difLabel)
                    .addComponent(operandLabel)
                    .addGroup(paramPanelLayout.createSequentialGroup()
                        .addGroup(paramPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Boto_Suma, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(Boto_Mult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paramPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Boto_Div, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(Boto_Resta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(difBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fixedFField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenerateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(paramPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previewLabel)
                    .addComponent(PreviewPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        paramPanelLayout.setVerticalGroup(
            paramPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paramPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paramPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(difLabel)
                    .addComponent(previewLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paramPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(paramPanelLayout.createSequentialGroup()
                        .addComponent(difBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fixedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fixedFField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(operandLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paramPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boto_Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boto_Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paramPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boto_Mult, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boto_Div, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(GenerateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CreateSaveP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(CreatePlayP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PreviewPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        tabMenu.addTab("By Parameters", paramPanel);

        javax.swing.GroupLayout createPanelLayout = new javax.swing.GroupLayout(createPanel);
        createPanel.setLayout(createPanelLayout);
        createPanelLayout.setHorizontalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        createPanelLayout.setVerticalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addComponent(tabMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        tabMenu.getAccessibleContext().setAccessibleName("");

        add(createPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void BoxDificultatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxDificultatActionPerformed
        JComboBox a = (JComboBox)evt.getSource();
        dif = (String)a.getSelectedItem();
    }//GEN-LAST:event_BoxDificultatActionPerformed

    private void CreateSaveMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateSaveMActionPerformed
        if (PreviewPanel.getForeground().equals(Color.red)) {
            String d = (String)BoxDificultat.getSelectedItem();
            int id = CP.crearTauler();
            JOptionPane.showMessageDialog(this,
                        "Your KenKen has been saved successfully\n"
                                + "It is KenKen "+id+" of size " + d, 
                        "Saved", 
                        JOptionPane.INFORMATION_MESSAGE);
            removeAll();
            repaint();
            revalidate();
            add(new WelcomeToKenken());
            repaint();
            revalidate();
        }
        else {
            errorLabel.setText("<html>You must create a KenKen</html>");
        }
    }//GEN-LAST:event_CreateSaveMActionPerformed

    private void CreatePlayMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatePlayMActionPerformed
        if (PreviewPanel.getForeground().equals(Color.red)) {
            String d = (String)BoxDificultat.getSelectedItem();
            int id = CP.crearTauler();
            JOptionPane.showMessageDialog(this,
                        "Your KenKen has been saved successfully\n"
                                + "It is KenKen "+id+" of size " + d, 
                        "Saved", 
                        JOptionPane.INFORMATION_MESSAGE);
            PlayKenKen pk = new PlayKenKen(d,user,CP,String.valueOf(id),CJ,parent);
            parent.dispose();
        }
        else {
            errorLabel.setText("<html>You must create a KenKen</html>");
        }
    }//GEN-LAST:event_CreatePlayMActionPerformed

    private void CreatePlayPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatePlayPActionPerformed
        String d = (String)difBox.getSelectedItem();
        int id = CP.crearTauler();
        JOptionPane.showMessageDialog(this,
                    "Your KenKen has been saved successfully\n"
                            + "It is KenKen "+id+" of size " + d, 
                    "Saved", 
                    JOptionPane.INFORMATION_MESSAGE);
        PlayKenKen pk = new PlayKenKen(d,user,CP,String.valueOf(id),CJ,parent);
        parent.dispose();
    }//GEN-LAST:event_CreatePlayPActionPerformed

    private void CreateSavePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateSavePActionPerformed
        String d = (String)BoxDificultat.getSelectedItem();
        int id = CP.crearTauler();
        JOptionPane.showMessageDialog(this,
                    "Your KenKen has been saved successfully\n"
                            + "It is KenKen "+id+" of size " + d, 
                    "Saved", 
                    JOptionPane.INFORMATION_MESSAGE);
        removeAll();
        repaint();
        revalidate();
        add(new WelcomeToKenken());
        repaint();
        revalidate();
    }//GEN-LAST:event_CreateSavePActionPerformed

    private void Boto_DivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boto_DivActionPerformed
        Color c = Boto_Div.getBackground();
        if (c == Color.white) {
            Boto_Div.setBackground(Color.gray);
        }
        else Boto_Div.setBackground(Color.white);
        comprovaGenerate();
    }//GEN-LAST:event_Boto_DivActionPerformed

    private void Boto_MultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boto_MultActionPerformed
        Color c = Boto_Mult.getBackground();
        if (c == Color.white) {
            Boto_Mult.setBackground(Color.gray);
        }
        else Boto_Mult.setBackground(Color.white);
        comprovaGenerate();
    }//GEN-LAST:event_Boto_MultActionPerformed

    private void Boto_RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boto_RestaActionPerformed
        Color c = Boto_Resta.getBackground();
        if (c == Color.white) {
            Boto_Resta.setBackground(Color.gray);
        }
        else Boto_Resta.setBackground(Color.white);
        comprovaGenerate();
    }//GEN-LAST:event_Boto_RestaActionPerformed

    private void Boto_SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boto_SumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boto_SumaActionPerformed

    private void difBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difBoxActionPerformed
        JComboBox a = (JComboBox)evt.getSource();
        dif = (String)a.getSelectedItem();
        comprovaGenerate();
    }//GEN-LAST:event_difBoxActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        if (dif.equals("-")) errorLabel.setText("You must select a difficulty");
        else {
            errorLabel.setText("");
            Edit edit = new Edit (Integer.parseInt(dif.substring(0, 1)),user,this.PreviewPanel,CP);
            errorLabel.setText("<html></html>");
        }
    }//GEN-LAST:event_EditButtonActionPerformed

    private void fixedFFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixedFFieldActionPerformed
        // TODO add your handling code here:
        comprovaGenerate();
    }//GEN-LAST:event_fixedFFieldActionPerformed

    private void GenerateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateButtonActionPerformed
        int N = Integer.parseInt(dif.substring(0, 1));
        int iniX = Integer.parseInt(fixedFField.getText());
        ArrayList<String> Ops = new ArrayList<>();
        Ops.add("+");
        if (Boto_Resta.getBackground().equals(Color.gray)) Ops.add("-");
        if (Boto_Mult.getBackground().equals(Color.gray)) Ops.add("*");
        if (Boto_Div.getBackground().equals(Color.gray)) Ops.add("/");
        int[][] mat = CP.generaKenkenPerParametres(N, iniX, Ops);
        PreviewPanel1.removeAll();
        PreviewPanel1.repaint();
        PreviewPanel1.revalidate();
        PreviewPanel1.add(new Preview(mat,Ops,PreviewPanel1.getBounds()));
        PreviewPanel1.repaint();
        PreviewPanel1.revalidate();
        CreateSaveP.setEnabled(true);
        CreatePlayP.setEnabled(true);
        
    }//GEN-LAST:event_GenerateButtonActionPerformed

    private void fixedFFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_fixedFFieldInputMethodTextChanged
        // TODO add your handling code here:
        comprovaGenerate();
    }//GEN-LAST:event_fixedFFieldInputMethodTextChanged

    private void fixedFFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fixedFFieldKeyTyped
        // TODO add your handling code here:
        comprovaGenerate();
    }//GEN-LAST:event_fixedFFieldKeyTyped

    private void fixedFFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fixedFFieldKeyReleased
        // TODO add your handling code here:
        comprovaGenerate();
    }//GEN-LAST:event_fixedFFieldKeyReleased

    private void fixedFFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fixedFFieldKeyPressed
        // TODO add your handling code here:
        comprovaGenerate();
    }//GEN-LAST:event_fixedFFieldKeyPressed

    private void manualPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manualPanelMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_manualPanelMouseReleased

    private void PreviewPanelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PreviewPanelFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_PreviewPanelFocusGained

    private void comprovaGenerate() {
        if (!dif.equals("-") && !fixedFField.getText().equals("")) GenerateButton.setEnabled(true);
        else GenerateButton.setEnabled(false);
    }
    
    private void BotonsCreate() {
        if (!PreviewPanel.getForeground().equals(Color.red)) {
            CreateSaveM.setEnabled(true);
            CreatePlayM.setEnabled(true);
        }
        else {
            CreateSaveM.setEnabled(false);
            CreatePlayM.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boto_Div;
    private javax.swing.JButton Boto_Mult;
    private javax.swing.JButton Boto_Resta;
    private javax.swing.JButton Boto_Suma;
    private javax.swing.JComboBox<String> BoxDificultat;
    private javax.swing.JButton CreatePlayM;
    private javax.swing.JButton CreatePlayP;
    private javax.swing.JButton CreateSaveM;
    private javax.swing.JButton CreateSaveP;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton GenerateButton;
    private javax.swing.JLabel PreviewLabel;
    private javax.swing.JPanel PreviewPanel;
    private javax.swing.JPanel PreviewPanel1;
    private javax.swing.JPanel Tauler;
    private javax.swing.JPanel Tauler1;
    private javax.swing.JPanel createPanel;
    private javax.swing.JComboBox<String> difBox;
    private javax.swing.JLabel difLabel;
    private javax.swing.JLabel diffLabel;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JFormattedTextField fixedFField;
    private javax.swing.JLabel fixedLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel manualPanel;
    private javax.swing.JLabel operandLabel;
    private javax.swing.JPanel paramPanel;
    private javax.swing.JLabel previewLabel;
    private javax.swing.JTabbedPane tabMenu;
    // End of variables declaration//GEN-END:variables
}
