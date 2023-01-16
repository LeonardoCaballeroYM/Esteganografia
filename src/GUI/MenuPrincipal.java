package GUI;

/*
 * @author YG
 */
import Clases.EsteganografiaLSB;
import Clases.OperacionesImagen;
import Clases.ConversionImagen;
import Clases.CriptografiaRSA;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    private OperacionesImagen a = new OperacionesImagen();
    private ConversionImagen c = new ConversionImagen();
    private BufferedImage Image;
    private Encriptacion ventana_RSA_Enc;
    private Desencriptacion ventana_RSA_Des;
    private CriptografiaRSA RSA;
    private GeneradorDeClaves Claves;

    public MenuPrincipal() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/IconoCalavera.png")).getImage());
        ventana_RSA_Enc = new Encriptacion();
        ventana_RSA_Des = new Desencriptacion();
        Claves = new GeneradorDeClaves();
        setLocationRelativeTo(null);
    }

    public void Limpiar() {
        Area_Mensaje.setText("");
        Ima.setIcon(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Separador = new javax.swing.JSeparator();
        Ocultar = new org.edisoncor.gui.button.ButtonTask();
        Ver = new org.edisoncor.gui.button.ButtonTask();
        Limpiar = new org.edisoncor.gui.button.ButtonTask();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area_Mensaje = new javax.swing.JTextArea();
        Ima = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Abrir_Imagen = new javax.swing.JMenuItem();
        Guardar_Imagen = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Salir = new javax.swing.JMenuItem();
        RSA_MENU = new javax.swing.JMenu();
        Encriptacion = new javax.swing.JMenuItem();
        Desencriptacion = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        Generar_Claves = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Esteganografia");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Separador.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 352, 732, 15));

        Ocultar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ocultar.setForeground(new java.awt.Color(255, 255, 255));
        Ocultar.setText("OCULTAR");
        Ocultar.setDescription("Ocultar Texto");
        Ocultar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Ocultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OcultarActionPerformed(evt);
            }
        });
        getContentPane().add(Ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 179, 40));

        Ver.setForeground(new java.awt.Color(255, 255, 255));
        Ver.setText("Limpiar");
        Ver.setDescription("Limpiar texto e imagen");
        Ver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerActionPerformed(evt);
            }
        });
        getContentPane().add(Ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 230, 50));

        Limpiar.setForeground(new java.awt.Color(255, 255, 255));
        Limpiar.setText("VER");
        Limpiar.setDescription("Ver Texto");
        Limpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 153, 50));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(null, "Texto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jScrollPane1.setName(""); // NOI18N
        jScrollPane1.setOpaque(false);
        jScrollPane1.setWheelScrollingEnabled(false);

        Area_Mensaje.setColumns(20);
        Area_Mensaje.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Area_Mensaje.setLineWrap(true);
        Area_Mensaje.setRows(5);
        jScrollPane1.setViewportView(Area_Mensaje);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 250, 280));
        jScrollPane1.getAccessibleContext().setAccessibleName("Texto Oculto");
        jScrollPane1.getAccessibleContext().setAccessibleDescription("");

        Ima.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        getContentPane().add(Ima, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 440, 270));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Imagen", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 460, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flames.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 410));

        Menu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMenu1.setText("Archivo");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Abrir_Imagen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        Abrir_Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Abrir.png"))); // NOI18N
        Abrir_Imagen.setText("Abrir");
        Abrir_Imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Abrir_ImagenActionPerformed(evt);
            }
        });
        jMenu1.add(Abrir_Imagen);

        Guardar_Imagen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        Guardar_Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        Guardar_Imagen.setText("Guardar");
        Guardar_Imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar_ImagenActionPerformed(evt);
            }
        });
        jMenu1.add(Guardar_Imagen);
        jMenu1.add(jSeparator1);

        Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu1.add(Salir);

        Menu.add(jMenu1);

        RSA_MENU.setText("Claves");

        Encriptacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Encriptacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Llave.png"))); // NOI18N
        Encriptacion.setText("Encriptacion");
        Encriptacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncriptacionActionPerformed(evt);
            }
        });
        RSA_MENU.add(Encriptacion);

        Desencriptacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        Desencriptacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Candado.png"))); // NOI18N
        Desencriptacion.setText("Desencriptacion");
        Desencriptacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesencriptacionActionPerformed(evt);
            }
        });
        RSA_MENU.add(Desencriptacion);
        RSA_MENU.add(jSeparator3);

        Generar_Claves.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        Generar_Claves.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/generar.png"))); // NOI18N
        Generar_Claves.setText("Generar Claves");
        Generar_Claves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Generar_ClavesActionPerformed(evt);
            }
        });
        RSA_MENU.add(Generar_Claves);

        Menu.add(RSA_MENU);

        setJMenuBar(Menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
        Login uff = new Login();
        uff.setVisible(true);
        uff.setLocationRelativeTo(null);
    }//GEN-LAST:event_SalirActionPerformed

    private void Abrir_ImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Abrir_ImagenActionPerformed
        a.Abrir_Dialogo(Ima);
        Image = a.getImagen();
            ImageIcon icon = new ImageIcon(Image);
            icon = new ImageIcon(icon.getImage().getScaledInstance(Ima.getWidth(), Ima.getHeight(), Image.SCALE_DEFAULT));
            this.Ima.setIcon(icon);
        this.Area_Mensaje.setText("");
    }//GEN-LAST:event_Abrir_ImagenActionPerformed

    private void Guardar_ImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar_ImagenActionPerformed
        if (this.Image != null) {
            try {
                EsteganografiaLSB E = new EsteganografiaLSB(Image);
                BufferedImage Imagen_Final = E.Ocultar_Mensaje(this.Area_Mensaje.getText());
                a.setImagen(Imagen_Final);
                JOptionPane.showMessageDialog(null, "Porfavor guarde su imagen con extension .bmp o .png para no distorsionar el Texto oculto");
                a.Guardar_Dialogo();
                JOptionPane.showMessageDialog(null, "La Imagen se guardo En : " + a.getUrl());
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha cargado Ninguna Imagen!!!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Guardar_ImagenActionPerformed

    private void Guardar_imagen_con_Texto() {
        try {
            int A = JOptionPane.showConfirmDialog(jPanel1, "¿Desea Ocultar el Texto?");
            if (A == 0) {
                this.Area_Mensaje.setText(ventana_RSA_Enc.Mensaje_Encriptado.getText());
            }
            if (!this.Area_Mensaje.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El Texto se Oculto en la Imagen");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ocultar mensaje..." + e.getMessage());
        }
    }

    private void OcultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OcultarActionPerformed
        int Bandera = -1;
        String Mensaje = "";
        if (this.Area_Mensaje.getText().isEmpty() && this.Image == null) {
            Bandera = 2;
        } else {
            if (this.Area_Mensaje.getText().isEmpty()) {
                Bandera = 1;
            } else if (this.Image == null) {
                Bandera = 0;
            }
        }
        if (Bandera == -1) {
            Guardar_imagen_con_Texto();
        } else {
            if (Bandera == 2) {
                Mensaje = "No se ha cargado ninguna Imagen y No se ha escrito ningun Texto...";
            }
            if (Bandera == 1) {
                Mensaje = "No se ha escrito ningun Texto...";
            }
            if (Bandera == 0) {
                Mensaje = "No se ha cargado Ninguna Imagen...";
            }
            JOptionPane.showMessageDialog(null, Mensaje, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_OcultarActionPerformed

    private void VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerActionPerformed
        Limpiar();
    }//GEN-LAST:event_VerActionPerformed

    private void Generar_ClavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Generar_ClavesActionPerformed
        this.Claves.setVisible(true);
    }//GEN-LAST:event_Generar_ClavesActionPerformed

    private void EncriptacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncriptacionActionPerformed
        ventana_RSA_Enc.setVisible(true);
        ventana_RSA_Enc.Mensaje_Encriptado.setText(this.Area_Mensaje.getText());
        if (Claves.Activado == true) {
            ventana_RSA_Enc.Publica_Text_n.setText(this.Claves.Publica_Text_n.getText());
            ventana_RSA_Enc.Publica_Text_e.setText(this.Claves.Publica_Text_e.getText());
        }
    }//GEN-LAST:event_EncriptacionActionPerformed

    private void DesencriptacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesencriptacionActionPerformed
        ventana_RSA_Des.setVisible(true);
        ventana_RSA_Des.Mensaje_Encriptado.setText(this.Area_Mensaje.getText());
        ventana_RSA_Des.Privada_Text_d.setText(Claves.Privada_Text_d.getText() + "");
        ventana_RSA_Des.Privada_Text_n.setText(Claves.Privada_Text_n.getText() + "");
    }//GEN-LAST:event_DesencriptacionActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        try {
            EsteganografiaLSB E = new EsteganografiaLSB(Image);
            this.Area_Mensaje.setText(E.Ver_Mensaje(Image));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_LimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Abrir_Imagen;
    private javax.swing.JTextArea Area_Mensaje;
    private javax.swing.JMenuItem Desencriptacion;
    private javax.swing.JMenuItem Encriptacion;
    private javax.swing.JMenuItem Generar_Claves;
    private javax.swing.JMenuItem Guardar_Imagen;
    private javax.swing.JLabel Ima;
    private org.edisoncor.gui.button.ButtonTask Limpiar;
    private javax.swing.JMenuBar Menu;
    private org.edisoncor.gui.button.ButtonTask Ocultar;
    private javax.swing.JMenu RSA_MENU;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JSeparator Separador;
    private org.edisoncor.gui.button.ButtonTask Ver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
