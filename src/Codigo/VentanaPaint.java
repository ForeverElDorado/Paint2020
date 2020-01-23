/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import Codigo.formas.Circulo;
import Codigo.formas.Estrella;
import Codigo.formas.Forma;
import Codigo.formas.Pemtagono;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author aghsk
 */
public class VentanaPaint extends javax.swing.JFrame {

    //sirve para poder dibujar en el JPANLE "LIENZO"
    BufferedImage buffer = null;
    Graphics2D bufferGraphics, jpanelGraphics = null;
    Circulo miCirculo = null;
    Forma miForma = null;

    /**
     * Creates new form VentanaPaint
     */
    public VentanaPaint() {
        initComponents();
        inicializaBuffers();
    }

    private void inicializaBuffers() {
        //Voy a crear una imagen del mismo tamaño que "Lienzo"
        buffer = (BufferedImage) Lienzo.createImage(Lienzo.getWidth(), Lienzo.getHeight());
        //creo una imagen modificada
        bufferGraphics = buffer.createGraphics();
        //inicializo el buffer para que se pinte de blanco
        bufferGraphics.setColor(Color.white);
        //creando rectangulo
        bufferGraphics.fillRect(0, 0, Lienzo.getWidth(), Lienzo.getHeight());
        //enlazamos el Lienzo jPanel cone el JpanelGraphics
        jpanelGraphics = (Graphics2D) Lienzo.getGraphics();
    }
    //se encarga de dibujar los elementos que puse en la pantalla

    @Override
    public void paint(Graphics g) {
        super.paint(g);//llama al metodo que lo hace correctamente (paint)

        //pinto el buffer sobre el JPanel Lienzo
        jpanelGraphics.drawImage(buffer, 0, 0, null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lienzo = new javax.swing.JPanel();
        panelColores2 = new Codigo.PanelColores();
        herramientas2 = new Codigo.Herramientas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lienzo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                LienzoMouseDragged(evt);
            }
        });
        Lienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LienzoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout LienzoLayout = new javax.swing.GroupLayout(Lienzo);
        Lienzo.setLayout(LienzoLayout);
        LienzoLayout.setHorizontalGroup(
            LienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 852, Short.MAX_VALUE)
        );
        LienzoLayout.setVerticalGroup(
            LienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(herramientas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelColores2, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(herramientas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelColores2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LienzoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LienzoMouseDragged
        switch (herramientas2.formaElegida) {
            case 0:
                //metodo para el raton
                bufferGraphics.setColor(panelColores2.colorSeleccionado);
                bufferGraphics.fillRect(evt.getX(), evt.getY(), 4, 4);
                //para repintar la pantalla
                repaint(0, 0, 1, 1);
                break;
            case 1:
                miCirculo.dibujate(bufferGraphics, evt.getX());
                break;
            case 5:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY());
                break;
            case 256:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY());
                break;

        }
        repaint(0, 0, 1, 1);
    }//GEN-LAST:event_LienzoMouseDragged

    private void LienzoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LienzoMousePressed
        // TODO add your handling code here:
        switch (herramientas2.formaElegida) {
            case 0:

                break;
            case 1:
                miCirculo = new Circulo(evt.getX(), evt.getY(), 1, panelColores2.colorSeleccionado, true);
                miCirculo.dibujate(bufferGraphics, evt.getX());
                break;
            case 5:
                miForma = new Pemtagono(evt.getX(), evt.getY(), 5, panelColores2.colorSeleccionado, false);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY());
                break;
            case 256:
                miForma = new Estrella(evt.getX(), evt.getY(), 256, panelColores2.colorSeleccionado, false);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY());
                break;
        }
    }//GEN-LAST:event_LienzoMousePressed

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
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Lienzo;
    private Codigo.Herramientas herramientas2;
    private Codigo.PanelColores panelColores2;
    // End of variables declaration//GEN-END:variables
}
