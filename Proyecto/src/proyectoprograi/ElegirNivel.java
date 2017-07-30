package proyectoprograi;

import java.awt.Color;
import java.awt.event.*;
import java.awt.Image;
import javax.swing.*;
import javax.swing.JOptionPane;

public class ElegirNivel extends javax.swing.JFrame {

    int nivel = 0;
    String nombreJugador;
    Color trans = new Color(0, 0, 0, 0);

    public ElegirNivel(String nom) {
        initComponents();
        nombreJugador = nom;
        jLabel2.setText("Nombre del Jugador: " + nom);
        Inicial();
    }

    public void Inicial() {
        jButton1.setBackground(trans);
        jButton1.setOpaque(false);
        jButton2.setBackground(trans);
        jButton2.setOpaque(false);
        jButton3.setBackground(trans);
        jButton3.setOpaque(false);
        jButton4.setBackground(trans);
        jButton4.setOpaque(false);

        jLabel3.setText("Principiante? Prueba este Modo");
        jLabel4.setText("Vaya, Parece que ya Tienes Experiencia!");
        jLabel5.setText("Como que te Estas Haciendo Bueno en Esto");
        jLabel6.setText("Preparado Para el Reto Final?!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Elegir Nivel de Juego");
        setMinimumSize(new java.awt.Dimension(750, 550));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Elija el Nivel de Juego");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 0, 420, 70);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Dazul.png"))); // NOI18N
        jButton1.setText("Facil");
        jButton1.setBorder(null);
        jButton1.setMaximumSize(new java.awt.Dimension(50, 20));
        jButton1.setMinimumSize(new java.awt.Dimension(50, 20));
        jButton1.setPreferredSize(new java.awt.Dimension(50, 20));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 140, 140, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Dverde.png"))); // NOI18N
        jButton2.setText("Normal");
        jButton2.setBorder(null);
        jButton2.setMaximumSize(new java.awt.Dimension(50, 20));
        jButton2.setMinimumSize(new java.awt.Dimension(50, 20));
        jButton2.setPreferredSize(new java.awt.Dimension(50, 20));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(410, 140, 150, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Drojo.png"))); // NOI18N
        jButton3.setText("Dificil");
        jButton3.setBorder(null);
        jButton3.setMaximumSize(new java.awt.Dimension(50, 20));
        jButton3.setMinimumSize(new java.awt.Dimension(50, 20));
        jButton3.setPreferredSize(new java.awt.Dimension(50, 20));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(30, 310, 140, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Drojo.png"))); // NOI18N
        jButton4.setText("Experto");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(410, 310, 150, 40);

        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 60, 240, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 190, 230, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(410, 190, 300, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 360, 240, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(410, 360, 330, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        nivel = 1;
        VentanaJuego vVentanaJuego = new VentanaJuego(nivel, nombreJugador);
        vVentanaJuego.show();
        this.hide();
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        nivel = 2;
        VentanaJuego vVentanaJuego = new VentanaJuego(nivel, nombreJugador);
        vVentanaJuego.show();
        this.hide();
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        nivel = 3;
        VentanaJuego vVentanaJuego = new VentanaJuego(nivel, nombreJugador);
        vVentanaJuego.show();
        this.hide();
        this.dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        nivel = 4;
        VentanaJuego vVentanaJuego = new VentanaJuego(nivel, nombreJugador);
        vVentanaJuego.show();
        this.hide();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElegirNivel("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
