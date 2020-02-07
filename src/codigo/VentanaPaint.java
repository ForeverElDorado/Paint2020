/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import codigo.formas.DibujoLibre;
import codigo.formas.Circulo;
import codigo.formas.Cuadrado;
import codigo.formas.Escribe;
import codigo.formas.Forma;
import codigo.formas.Estrella;
import codigo.formas.Pentagono;
import codigo.formas.Triangulo;
import codigo.formas.creaRecta;
import codigo.formas.Pipeta;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Guille López
 */
public class VentanaPaint extends javax.swing.JFrame {


    BufferedImage buffer, buffer2, buffer3 = null;

    Graphics2D bufferGraphics, bufferGraphics2, bufferGraphics3, jpanelGraphics = null;

    DibujoLibre dibujoLibre = null;
    creaRecta recta = null;
    Pipeta pipeta = null;
    Forma miForma = null;
    String grosor = "5";
    String goma = "10";
    //valores del texto
    String texto = "";
    int Xtex = 0;
    int Ytex = 0;
    int tamLetra = 50;
    int valormin = 0;
    int valormax = 200;
    Escribe _texto = null;
    Boolean relleno = false;

    ArrayList<BufferedImage> buffers = new ArrayList<>();

    /**
     * Creates new form VentanaPaint
     */
    public VentanaPaint() {
        initComponents();
        inicializaBuffers();
        Paleta.setSize(640, 450);
        Frase.setSize(420, 69);
    }

    private void inicializaBuffers() {
        //Creo una imagen del mismo ancho y alto que el Lienzo (jPanel1)
        buffer = (BufferedImage) Lienzo.createImage(Lienzo.getWidth(), Lienzo.getHeight());
        buffer2 = (BufferedImage) Lienzo.createImage(Lienzo.getWidth(), Lienzo.getHeight());
        buffer3 = (BufferedImage) Lienzo.createImage(Lienzo.getWidth(), Lienzo.getHeight());

        //Creo una imagen modificable
        bufferGraphics = buffer.createGraphics();
        bufferGraphics2 = buffer2.createGraphics();
        bufferGraphics3 = buffer3.createGraphics();

        //Inicializo el buffer para que se pinte de blanco entero
        bufferGraphics.setColor(Color.WHITE);
        bufferGraphics.fillRect(0, 0, Lienzo.getWidth(), Lienzo.getHeight());

        bufferGraphics2.setColor(Color.WHITE);
        bufferGraphics2.fillRect(0, 0, Lienzo.getWidth(), Lienzo.getHeight());

        //Enlazamos el Lienzo (jPanel1) con el jPanelGraphics
        jpanelGraphics = (Graphics2D) Lienzo.getGraphics();
        //nos guarda el buffer anterior para deshacer
        bufferGraphics3.drawImage(buffer2, null, this);
        buffers.add(buffer3);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //pinto el buffer sobre el Lienzo (jLabel1)
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

        Paleta = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Documentos = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        Frase = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        Lienzo = new javax.swing.JPanel();
        Colores = new javax.swing.JButton();
        Grosor = new javax.swing.JSlider();
        herramientas1 = new codigo.Herramientas();
        panelColores1 = new codigo.PanelColores();
        Menus = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Guardar = new javax.swing.JMenuItem();
        Cargar = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        Deshacer = new javax.swing.JMenuItem();

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PaletaLayout = new javax.swing.GroupLayout(Paleta.getContentPane());
        Paleta.getContentPane().setLayout(PaletaLayout);
        PaletaLayout.setHorizontalGroup(
            PaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaletaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PaletaLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(127, 127, 127))
        );
        PaletaLayout.setVerticalGroup(
            PaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaletaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout DocumentosLayout = new javax.swing.GroupLayout(Documentos.getContentPane());
        Documentos.getContentPane().setLayout(DocumentosLayout);
        DocumentosLayout.setHorizontalGroup(
            DocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DocumentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DocumentosLayout.setVerticalGroup(
            DocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DocumentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane1.setViewportView(jTextArea2);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton4.setText("SUBMIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FraseLayout = new javax.swing.GroupLayout(Frase.getContentPane());
        Frase.getContentPane().setLayout(FraseLayout);
        FraseLayout.setHorizontalGroup(
            FraseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FraseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(22, 22, 22))
        );
        FraseLayout.setVerticalGroup(
            FraseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FraseLayout.createSequentialGroup()
                .addGroup(FraseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 41, Short.MAX_VALUE))
        );

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
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LienzoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout LienzoLayout = new javax.swing.GroupLayout(Lienzo);
        Lienzo.setLayout(LienzoLayout);
        LienzoLayout.setHorizontalGroup(
            LienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        LienzoLayout.setVerticalGroup(
            LienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Colores.setText("Más colores");
        Colores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColoresActionPerformed(evt);
            }
        });

        Grosor.setOrientation(javax.swing.JSlider.VERTICAL);
        Grosor.setMaximumSize(new java.awt.Dimension(20, 20000));
        Grosor.setMinimumSize(new java.awt.Dimension(20, 40));
        Grosor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                GrosorStateChanged(evt);
            }
        });

        File.setText("File");

        Guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        File.add(Guardar);

        Cargar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        Cargar.setText("Cargar");
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });
        File.add(Cargar);

        Menus.add(File);

        Edit.setText("Edit");

        Deshacer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        Deshacer.setText("Deshacer");
        Deshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeshacerActionPerformed(evt);
            }
        });
        Edit.add(Deshacer);

        Menus.add(Edit);

        setJMenuBar(Menus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(390, Short.MAX_VALUE)
                        .addComponent(Colores, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelColores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(herramientas1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Grosor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lienzo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Grosor, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(herramientas1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 93, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelColores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Colores, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LienzoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LienzoMouseDragged
        bufferGraphics.drawImage(buffer2, 0, 0, null);
        switch (herramientas1.formaElegida) {//valores de las herramientas
            case 0:
                dibujoLibre.dibujate(bufferGraphics2, evt.getX(), evt.getY(), grosor);
                break;
            //Circulo    
            case 1:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            //Triangulo
            case 3:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            //Cuadrado
            case 4:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            //Pentagono
            case 5:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;

            case 6:
                recta.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            //Texto
            case 7:
                break;

            case 11:
                dibujoLibre.dibujate(bufferGraphics2, evt.getX(), evt.getY(), goma);
                break;
            //Estrella 
            case 256:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;

        }
        repaint(0, 0, 1, 1);
    }//GEN-LAST:event_LienzoMouseDragged

    private void LienzoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LienzoMousePressed
        switch (herramientas1.formaElegida) {
            case 0:
                dibujoLibre = new DibujoLibre(evt.getX(), evt.getY(), panelColores1.colorSeleccionado);
                dibujoLibre.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;

            case 1:
                miForma = new Circulo(evt.getX(), evt.getY(), 64, panelColores1.colorSeleccionado, herramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;

            case 3:
                miForma = new Triangulo(evt.getX(), evt.getY(), 3, panelColores1.colorSeleccionado, herramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;

            case 4:
                miForma = new Cuadrado(evt.getX(), evt.getY(), 4, panelColores1.colorSeleccionado, herramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;

            case 5:
                miForma = new Pentagono(evt.getX(), evt.getY(), 5, panelColores1.colorSeleccionado, herramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;

            case 6:
                recta = new creaRecta(evt.getX(), evt.getY(), panelColores1.colorSeleccionado);
                recta.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;

            case 11:
                dibujoLibre = new DibujoLibre(evt.getX(), evt.getY(), Color.WHITE);
                dibujoLibre.dibujate(bufferGraphics, evt.getX(), evt.getY(), goma);
                break;

            case 12:
                pipeta = new Pipeta(evt.getX(), evt.getY(), buffer2);
                panelColores1.colorSeleccionado = pipeta.copiarColor(evt.getX(), evt.getY(), buffer2, panelColores1.colorSeleccionado);
                panelColores1.colorActual.setBackground(panelColores1.colorSeleccionado);
                break;

            case 256:
                miForma = new Estrella(evt.getX(), evt.getY(), 256, panelColores1.colorSeleccionado, herramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
        }
    }//GEN-LAST:event_LienzoMousePressed

   
    private void LienzoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LienzoMouseReleased
        if (herramientas1.formaElegida > 0 && herramientas1.formaElegida < 6 || herramientas1.formaElegida == 256) {
            miForma.dibujate(bufferGraphics2, evt.getX(), evt.getY(), grosor);
        } else if (herramientas1.formaElegida == 6) {
            recta.dibujate(bufferGraphics2, evt.getX(), evt.getY(), grosor);
        } else if (herramientas1.formaElegida == 7) {
            Frase.setLocation(evt.getX(), evt.getY());
            Frase.setVisible(true);
            Xtex = evt.getX();
            Ytex = evt.getY();
        }
        else if (herramientas1.formaElegida == 88) {
            int xFlood = evt.getX();
            int yFlood = evt.getY();
            int rgb = buffer.getRGB(xFlood, yFlood);
            Color c = new Color(rgb);
            fill(xFlood, yFlood, c, panelColores1.colorSeleccionado);
            jpanelGraphics.drawImage(buffer2, 0, 0, null);
            bufferGraphics2.drawImage(buffer2, 0, 0, null);
        }
        if (herramientas1.formaElegida != 7) {
            buffer3 = (BufferedImage) Lienzo.createImage(Lienzo.getWidth(), Lienzo.getHeight());
            bufferGraphics3 = buffer3.createGraphics();
            bufferGraphics3.drawImage(buffer2, null, this);
            buffers.add(buffer3);
        } 
    }//GEN-LAST:event_LienzoMouseReleased

    public <Queue> void fill(int x, int y, Color colorBase, Color colorNuevo) {//relleno usando recursion
        java.util.Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));

        while (!queue.isEmpty()) {
            Point pt = queue.remove();
            if (pt.x < 0 || pt.x >= buffer2.getWidth() || pt.y < 0 || pt.y >= buffer2.getHeight() || colorBase.getRGB() != buffer2.getRGB(pt.x, pt.y)) {
                continue;
            }
            buffer2.setRGB(pt.x, pt.y, colorNuevo.getRGB());
            //jPanelGraphics.drawImage(buffer, 0, 0, null);
            queue.add(new Point(pt.x - 1, pt.y));
            queue.add(new Point(pt.x + 1, pt.y));
            queue.add(new Point(pt.x, pt.y - 1));
            queue.add(new Point(pt.x, pt.y + 1));
        }
        jpanelGraphics.drawImage(buffer2, 0, 0, null);
    }
    private void ColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColoresActionPerformed
        Paleta.setVisible(true);
    }//GEN-LAST:event_ColoresActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Paleta.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Paleta.setVisible(false);
        panelColores1.colorSeleccionado = jColorChooser1.getColor();
        panelColores1.colorActual.setBackground(jColorChooser1.getColor());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        int seleccion = jFileChooser1.showSaveDialog(this);
        if (seleccion == jFileChooser1.APPROVE_OPTION) {
            //Si entra aquí es porque el usuario ha pulsado en "guardar"
            File fichero = jFileChooser1.getSelectedFile();
            String nombre = fichero.getName();
            String extension = nombre.substring(nombre.lastIndexOf('.') + 1, nombre.length());
            if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png")) {
                try {
                    ImageIO.write(buffer, "png", fichero);
                } catch (IOException e) {
                }
            }
        } else {
            //Mensaje de extensión no válida
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void GrosorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_GrosorStateChanged
        grosor = Integer.toString(Grosor.getValue() / 5) + "f";
        goma = Integer.toString(Grosor.getValue() / 5) + "f";
        tamLetra = Grosor.getValue() * 2;
    }//GEN-LAST:event_GrosorStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        texto = jTextArea1.getText();
        Frase.setVisible(false);
        _texto = new Escribe(Xtex, Ytex, texto);
        _texto.escribe(jpanelGraphics, Xtex, Ytex, texto, panelColores1.colorSeleccionado, tamLetra);
        _texto.escribe(bufferGraphics, Xtex, Ytex, texto, panelColores1.colorSeleccionado, tamLetra);
        _texto.escribe(bufferGraphics2, Xtex, Ytex, texto, panelColores1.colorSeleccionado, tamLetra);
        jpanelGraphics.drawImage(buffer2, 0, 0, null);
        jTextArea1.setText("");
        buffer3 = (BufferedImage) Lienzo.createImage(Lienzo.getWidth(), Lienzo.getHeight());
        bufferGraphics3 = buffer3.createGraphics();
        bufferGraphics3.drawImage(buffer2, null, this);
        buffers.add(buffer3);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
        //Si entra aquí es porque el usuario ha pulsado en "Cargar"
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("archivo jpg", "jpg"));
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("archivo png", "jpg"));
        int seleccion = jFileChooser1.showOpenDialog(this);

        //Segunda parte del botón, selección de archivo
        if (seleccion == jFileChooser1.APPROVE_OPTION) {
            File fichero = jFileChooser1.getSelectedFile();
            String nombre = fichero.getName();
            String extension = nombre.substring(nombre.lastIndexOf('.') + 1, nombre.length());

            //Tercera parte del botón, mostrar archivo.
            if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png")) {
                try {
                    bufferGraphics.drawImage(ImageIO.read(fichero), 0, 0, null);
                    bufferGraphics2.drawImage(ImageIO.read(fichero), 0, 0, null);
                    repaint(0, 0, 1, 1);
                } catch (IOException ex) {
                }
            }
        }
    }//GEN-LAST:event_CargarActionPerformed

    private void DeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeshacerActionPerformed
        if (buffers.size() > 1) {//acceso directo para el deshacer
            bufferGraphics2.drawImage(buffers.get(buffers.size() - 2), 0, 0, null);
            buffers.remove(buffers.size() - 1);
            jpanelGraphics.drawImage(buffer2, 0, 0, null);
        }
    }//GEN-LAST:event_DeshacerActionPerformed

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
    private javax.swing.JMenuItem Cargar;
    private javax.swing.JButton Colores;
    private javax.swing.JMenuItem Deshacer;
    private javax.swing.JDialog Documentos;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenu File;
    private javax.swing.JDialog Frase;
    private javax.swing.JSlider Grosor;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JPanel Lienzo;
    private javax.swing.JMenuBar Menus;
    private javax.swing.JDialog Paleta;
    private codigo.Herramientas herramientas1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private codigo.PanelColores panelColores1;
    // End of variables declaration//GEN-END:variables
}
