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
public class ByTypeR extends javax.swing.JPanel {

    /**
     * Creates new form Ranking2
     */
    public ByTypeR() {
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

        jPanel1 = new javax.swing.JPanel();
        rankingLabel1 = new javax.swing.JLabel();
        GrankingLabel1 = new javax.swing.JLabel();
        threeButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        sixButton1 = new javax.swing.JButton();
        sevenButton1 = new javax.swing.JButton();
        eightButton1 = new javax.swing.JButton();
        nineButton2 = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        rankingLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rankingLabel1.setText("RANKING");
        rankingLabel1.setAlignmentX(250.0F);
        rankingLabel1.setAlignmentY(300.0F);

        GrankingLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GrankingLabel1.setText("Ranking by Type:");

        threeButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        threeButton.setText("3 x 3");
        threeButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        fourButton.setText("4 x 4");
        fourButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        fiveButton.setText("5 x 5");
        fiveButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sixButton1.setText("6 x 6");
        sixButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sevenButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sevenButton1.setText("7 x 7");
        sevenButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eightButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        eightButton1.setText("8 x 8");
        eightButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eightButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButton1ActionPerformed(evt);
            }
        });

        nineButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nineButton2.setText("9 x 9");
        nineButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sevenButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eightButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(nineButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sixButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GrankingLabel1))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rankingLabel1)
                        .addGap(233, 233, 233))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(rankingLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(GrankingLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sixButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eightButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sevenButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(nineButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void eightButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eightButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GrankingLabel1;
    private javax.swing.JButton eightButton1;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nineButton2;
    private javax.swing.JLabel rankingLabel1;
    private javax.swing.JButton sevenButton1;
    private javax.swing.JButton sixButton1;
    private javax.swing.JButton threeButton;
    // End of variables declaration//GEN-END:variables
}
