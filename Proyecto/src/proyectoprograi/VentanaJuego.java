/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprograi;
import ProyectoPrograI.*;
import javax.swing.ImageIcon;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author Epoch
 */
public class VentanaJuego extends javax.swing.JFrame {
ImageIcon Img1 = new ImageIcon(getClass().getResource("/imagenes/Dazul.png"));
ImageIcon Img2 = new ImageIcon(getClass().getResource("/imagenes/Dverde.png"));
ImageIcon Img3 = new ImageIcon(getClass().getResource("/imagenes/Drojo.png"));
ImageIcon dia1;

    /**
     * Creates new form VentanaJuego
     */
    public VentanaJuego() {
        initComponents();
        
        jButton3.setIcon(dia1);
        jButton3.setSize(10,10);
        jButton3.setText("");
        
        jButton4.setIcon(dia1);
        jButton4.setSize(10,10);
        jButton4.setText("");
        
        jButton5.setIcon(dia1);
        jButton5.setSize(10,10);
        jButton5.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Comenzar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        jButton5.setText("jButton5");

        jLabel1.setText("El marcador es: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(195, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(538, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    JFrame ventana;
    JLabel iconosMatriz[][];//logicMAT visible//
    int logicaMatriz[][];
    Random aleatorio;
    

    
    public void Same(int x, int y) {
        
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        repaint();
        setLayout(null); 
        
        iconosMatriz = new JLabel[x][y];//tamaño de logicMAT//
        logicaMatriz = new int[x][y];//logicMAT de enteros//
        aleatorio = new Random();

        
        for (int i = 0; i < iconosMatriz.length; i++) {
            for (int j = 0; j < iconosMatriz.length; j++) {
                iconosMatriz[i][j] = new JLabel(); //espacio de memoria/
                iconosMatriz[i][j].setLocation(0 + i * 30, 0 + j * 30);
                logicaMatriz[i][j] = aleatorio.nextInt(3) + 1;
                iconosMatriz[i][j].setText(""+logicaMatriz[i][j]);
                establecerIcono(Integer.parseInt(iconosMatriz[i][j].getText()));
                iconosMatriz[i][j].setText("");
                iconosMatriz[i][j].setIcon(dia1);
                iconosMatriz[i][j].setSize(iconosMatriz[i][j].getMinimumSize());
                iconosMatriz[i][j].setVisible(true);
                add(iconosMatriz[i][j]);

            }
        } 
        

        
        for (int i = 0; i < iconosMatriz.length; i++) { //
            for (int j = 0; j < iconosMatriz.length; j++) {

                iconosMatriz[i][j].addMouseListener(new MouseAdapter() { //funcion del mouse//
                    @Override
                    public void mouseClicked(MouseEvent ev) {
                        for (int k = 0; k < iconosMatriz.length; k++) {
                            for (int l = 0; l < iconosMatriz.length; l++) {//posicion en la logicMAT//
                                if (iconosMatriz[k][l] == ev.getSource()) {
                                    int thisColor = logicaMatriz[k][l];
                                    if(thisColor != -1){
                                     validateColor(k, l, thisColor);
                                     marcador();
                                    }
                                }
                            }

                        }
                    }
                });
            }
        }
    }

    public void validateColor(int k, int l, int thisColor) {

        if (k != 0) {
            if (logicaMatriz[k - 1][l] == thisColor) {
                logicaMatriz[k - 1][l] = -1;
                logicaMatriz[k][l] = -1;

                iconosMatriz[k - 1][l].setText("-1");
                iconosMatriz[k][l].setText("-1");
                
                validateColor(k-1, l, thisColor);
            }
        }

        if (k != 9) {
            if (logicaMatriz[k + 1][l] == thisColor) {
                logicaMatriz[k + 1][l] = -1;
                logicaMatriz[k][l] = -1;

                iconosMatriz[k + 1][l].setText("-1");
                iconosMatriz[k][l].setText("-1");
                
                validateColor(k+1, l,thisColor);
            }
        }

        if (l != 0) {
            if (logicaMatriz[k][l - 1] == thisColor) {
                logicaMatriz[k][l - 1] = -1;
                logicaMatriz[k][l] = -1;

                iconosMatriz[k][l - 1].setText("-1");
                iconosMatriz[k][l].setText("-1");
                
                validateColor(k, l-1, thisColor);
            }
        }

        if (l != 9) {
            if (logicaMatriz[k][l + 1] == thisColor) {
                logicaMatriz[k][l + 1] = -1;
                logicaMatriz[k][l] = -1;

                iconosMatriz[k][l + 1].setText("-1");
                iconosMatriz[k][l].setText("-1");
                
                validateColor(k, l+1,thisColor);
            }
        }
    }
    
    public ImageIcon establecerIcono(int num)
    {
        if(num==1){
        dia1=Img1;
        }
        else if(num==2){
        dia1=Img2;
        }
        else if (num==3){
        dia1=Img3;
        }
        else if (num==-1){
        dia1=null;    
        }
    return dia1;
    }
    
    private void marcador(){
        int cont = 0;
        int marcador;
        for (int i = 0; i < iconosMatriz.length; i++) { //
            for (int j = 0; j < iconosMatriz.length; j++) {
                if(logicaMatriz[i][j]==-1){
                    cont += 1;
                }
            }
        }
        marcador = 2*cont;
        this.jLabel1.setText("El marcador es: " + marcador);        
}

    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VentanaMarcador vVentanaMarcador = new VentanaMarcador();
        vVentanaMarcador.show();
        this.setVisible(false);
        this.dispose();        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int x = 10;
        int y = 10;
        Same(x,y);
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
