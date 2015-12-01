/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaPresentacio;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.Timer;

/**
 *
 * @author Oriolcapo
 */

public class PlayKenKen extends javax.swing.JFrame {
    
    private static int h=0, m=0, s=0;
    private Timer t;
    ArrayList<ArrayList<Integer> > mat;
    Scanner sn = new Scanner(System.in);
    int N, X, Y;
    
    public PlayKenKen(int N) {
        this.N = N;
        t=new Timer(1000, new startChrono());
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        InicialitzaTauler();
        t.start();
        
        Toolkit tool = Toolkit.getDefaultToolkit();
        Dimension dim = new Dimension(tool.getScreenSize());
        int height = (int) dim.getHeight();
        int width = (int) dim.getWidth();
        setLocation(width/2 - getWidth()/2, height/2 - getHeight()/2);
    }
    
    private void InicialitzaTauler() {
        int count = 0;
        mat = new ArrayList<ArrayList<Integer> >();
        for (int i=0; i<N; i++) {
            mat.add(new ArrayList<Integer>());
            for (int j=0; j<N; ++j) {
                if (j < 2) {
                    mat.get(i).add(count);
                }
                else {
                    mat.get(i).add(count+1);
                }
            }
            count+=2;
        }   
        int alt = Tauler.getHeight();
        int bSize = alt/N;
        count=1;
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                //JButton b = new JButton();
                JLabel b = new JLabel();
                Tauler.add(b);
                b.setBounds(j*bSize, i*bSize, bSize, bSize);
                MatteBorder border = creaMarge(i,j);
                b.setBorder(border);
                b.setVisible(true);
                b.setHorizontalAlignment(SwingConstants.CENTER);
                b.setVerticalAlignment(SwingConstants.CENTER);
                b.setFont(new Font("Comic Sants", Font.PLAIN, 30));
                b.setText("");
                //____________
                b.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        int a;
                        if (b.getText().equals("")) a = 0;
                        else a = Integer.parseInt(b.getText());
                        if (a < N) b.setText(Integer.toString(a+1));
                        else b.setText("1");
                        X = b.getX();
                        Y = b.getY();
                        //b.setText("");
                    }
                });
                //_____________
            }
            count+=2;
        }
    }
    
    public MatteBorder creaMarge (int i, int j) {
        int n = mat.size()-1;
        int Me = mat.get(i).get(j);        
        int u=1,d=1,l=1,r=1;

        if (i == 0) {
            u+=2;
            if (Me != mat.get(i+1).get(j)) d+=1;
            if (j>0 && j<n) {
                if (Me != mat.get(i).get(j+1)) r+=1;
                if (Me != mat.get(i).get(j-1)) l+=1;
            }
        }
        else if (i == n) {
            d+=2;
            if (Me != mat.get(i-1).get(j)) u+=1;
            if (j>0 && j<n) {
                if (Me != mat.get(i).get(j+1)) r+=1;
                if (Me != mat.get(i).get(j-1)) l+=1;
            }
        }
        if (j == 0) {
            l+=2;
            if (Me != mat.get(i).get(j+1)) r+=1;
            if (i>0 && i<n) {
                if (Me != mat.get(i+1).get(j)) d+=1;
                if (Me != mat.get(i-1).get(j)) u+=1;
            }
        }
        if (j == n) {
            r+=2;
            if (Me != mat.get(i).get(j-1)) l+=1;
            if (i>0 && i<n) {
                if (Me != mat.get(i+1).get(j)) d+=1;
                if (Me != mat.get(i-1).get(j)) u+=1;
            }
        }
        if (i!=0 && i!=n && j!=0 && j!=n) {
            if (Me != mat.get(i+1).get(j)) d+=1;
            if (Me != mat.get(i-1).get(j)) u+=1;
            if (Me != mat.get(i).get(j+1)) r+=1;
            if (Me != mat.get(i).get(j-1)) l+=1;
        }
        return BorderFactory.createMatteBorder(u,l,d,r,Color.black);
    }
    
    private class startChrono implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (s<59){
                s++;
                String sec= (s<10?"0":"")+s;
                seconds.setText(""+sec);
            }else{
                s=0;
                seconds.setText("00");
                if(m<59){
                    m++;
                    String min= (m<10?"0":"")+m;
                    minutes.setText(""+min);
                }else{
                    m=0;
                    minutes.setText("00");
                    h++;
                    String hr= (h<10?"0":"")+h;
                    hours.setText(""+hr);
                }
                
                    
            }
        }
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
        Tauler = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        PauseButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        BotoExit = new javax.swing.JButton();
        hours = new javax.swing.JLabel();
        minutes = new javax.swing.JLabel();
        seconds = new javax.swing.JLabel();
        TimeLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 620));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        javax.swing.GroupLayout TaulerLayout = new javax.swing.GroupLayout(Tauler);
        Tauler.setLayout(TaulerLayout);
        TaulerLayout.setHorizontalGroup(
            TaulerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );
        TaulerLayout.setVerticalGroup(
            TaulerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tauler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tauler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(230, 40, 509, 506);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaPresentacio/img/UndoButton.png"))); // NOI18N
        jButton1.setText("UNDO");
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 40, 168, 60);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaPresentacio/img/HintButton.png"))); // NOI18N
        jButton2.setText("HINT");
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 120, 168, 60);

        ResetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaPresentacio/img/ResetButton.png"))); // NOI18N
        ResetButton.setText("RESET");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ResetButton);
        ResetButton.setBounds(30, 200, 168, 60);

        PauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaPresentacio/img/PauseButton.png"))); // NOI18N
        PauseButton.setText("PAUSE");
        PauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PauseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PauseButton);
        PauseButton.setBounds(30, 280, 168, 60);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaPresentacio/img/SaveButtonn.png"))); // NOI18N
        jButton5.setText("SAVE");
        getContentPane().add(jButton5);
        jButton5.setBounds(30, 360, 168, 60);

        BotoExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaPresentacio/img/ExitButton.png"))); // NOI18N
        BotoExit.setText("EXIT");
        BotoExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotoExitActionPerformed(evt);
            }
        });
        getContentPane().add(BotoExit);
        BotoExit.setBounds(30, 446, 168, 100);

        hours.setText("00");
        getContentPane().add(hours);
        hours.setBounds(670, 10, 14, 16);

        minutes.setText("00");
        getContentPane().add(minutes);
        minutes.setBounds(690, 10, 14, 16);

        seconds.setText("00");
        getContentPane().add(seconds);
        seconds.setBounds(710, 10, 14, 16);

        TimeLabel.setText("Time:");
        getContentPane().add(TimeLabel);
        TimeLabel.setBounds(630, 10, 34, 16);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaPresentacio/img/background.jpeg"))); // NOI18N
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 800, 600);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotoExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotoExitActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_BotoExitActionPerformed
    
    int i=0;
    
    private void PauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PauseButtonActionPerformed
        if(i==0){
            t.stop();
            i=1;
            PauseButton.setText("CONTINUE");
        }else{
            t.start();
            i=0;
            PauseButton.setText("PAUSE");
        }
    }//GEN-LAST:event_PauseButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        t.stop();
        hours.setText("00"); h=0;
        minutes.setText("00"); m=0;
        seconds.setText("00"); s=0;
        i=0;
        PauseButton.setText("PAUSE");
    }//GEN-LAST:event_ResetButtonActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotoExit;
    private javax.swing.JButton PauseButton;
    private javax.swing.JButton ResetButton;
    private javax.swing.JPanel Tauler;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel hours;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minutes;
    private javax.swing.JLabel seconds;
    // End of variables declaration//GEN-END:variables
}
