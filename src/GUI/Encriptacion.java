package GUI;

/*
 * @author YG
 */
import Clases.CriptografiaRSA;
import java.math.BigInteger;
import javax.swing.ImageIcon;

public class Encriptacion extends javax.swing.JFrame {

    private CriptografiaRSA RSA;
    public BigInteger[] textoCifrado;

    public Encriptacion() {

        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/IconoCalavera.png")).getImage());
        RSA = new CriptografiaRSA();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Clave_Publica = new javax.swing.JPanel();
        Publica_Text_n = new javax.swing.JTextField();
        Publica_Text_e = new javax.swing.JTextField();
        Etiqueta_n = new javax.swing.JLabel();
        Etiqueta_e = new javax.swing.JLabel();
        Imagen_Emisor = new javax.swing.JLabel();
        Etiqueta_Emisor = new javax.swing.JLabel();
        btnEncriptar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        Separador = new javax.swing.JSeparator();
        Texto_Encriptado = new javax.swing.JScrollPane();
        Mensaje_Encriptado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Encriptado Mendiante RSA");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Clave_Publica.setBackground(new java.awt.Color(255, 255, 255));
        Clave_Publica.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clave Publica", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        Clave_Publica.setForeground(new java.awt.Color(255, 255, 255));
        Clave_Publica.setOpaque(false);

        Publica_Text_n.setForeground(new java.awt.Color(0, 0, 0));

        Publica_Text_e.setForeground(new java.awt.Color(0, 0, 0));

        Etiqueta_n.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Etiqueta_n.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta_n.setText("u : ");

        Etiqueta_e.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Etiqueta_e.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta_e.setText("f : ");

        Imagen_Emisor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Emi.png"))); // NOI18N

        Etiqueta_Emisor.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Etiqueta_Emisor.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta_Emisor.setText("EMISOR");

        javax.swing.GroupLayout Clave_PublicaLayout = new javax.swing.GroupLayout(Clave_Publica);
        Clave_Publica.setLayout(Clave_PublicaLayout);
        Clave_PublicaLayout.setHorizontalGroup(
            Clave_PublicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Clave_PublicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Clave_PublicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Etiqueta_n, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Etiqueta_e))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Clave_PublicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Clave_PublicaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Etiqueta_Emisor))
                    .addComponent(Publica_Text_n, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Publica_Text_e, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Imagen_Emisor))
                .addContainerGap())
        );
        Clave_PublicaLayout.setVerticalGroup(
            Clave_PublicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Clave_PublicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Imagen_Emisor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Etiqueta_Emisor)
                .addGap(18, 18, 18)
                .addGroup(Clave_PublicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Etiqueta_e)
                    .addComponent(Publica_Text_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Clave_PublicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Etiqueta_n)
                    .addComponent(Publica_Text_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(Clave_Publica, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 26, -1, 300));

        btnEncriptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Llave.png"))); // NOI18N
        btnEncriptar.setText("Encriptar");
        btnEncriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncriptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEncriptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CERRAR.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, -1));
        getContentPane().add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 501, 10));

        Texto_Encriptado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mensaje Encriptado", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        Texto_Encriptado.setOpaque(false);

        Mensaje_Encriptado.setBackground(new java.awt.Color(0, 0, 0));
        Mensaje_Encriptado.setColumns(10);
        Mensaje_Encriptado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Mensaje_Encriptado.setForeground(new java.awt.Color(0, 0, 0));
        Mensaje_Encriptado.setLineWrap(true);
        Mensaje_Encriptado.setRows(5);
        Mensaje_Encriptado.setBorder(null);
        Mensaje_Encriptado.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Mensaje_Encriptado.setEnabled(false);
        Mensaje_Encriptado.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        Mensaje_Encriptado.setSelectionColor(new java.awt.Color(0, 0, 0));
        Texto_Encriptado.setViewportView(Mensaje_Encriptado);

        getContentPane().add(Texto_Encriptado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 270, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flames.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnEncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncriptarActionPerformed
        BigInteger N = new BigInteger(this.Publica_Text_n.getText());
        BigInteger E = new BigInteger(this.Publica_Text_e.getText());
        RSA.setE(E);
        RSA.setN(N);
        textoCifrado = RSA.encripta(this.Mensaje_Encriptado.getText());
        String cadena = "";
        for (int i = 0; i < textoCifrado.length; i++) {
            cadena = cadena + textoCifrado[i];
            if (i != textoCifrado.length - 1) {
                cadena = cadena + " ";
            }
        }
        this.Mensaje_Encriptado.setText(cadena);

    }//GEN-LAST:event_btnEncriptarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Clave_Publica;
    private javax.swing.JLabel Etiqueta_Emisor;
    private javax.swing.JLabel Etiqueta_e;
    private javax.swing.JLabel Etiqueta_n;
    private javax.swing.JLabel Imagen_Emisor;
    public javax.swing.JTextArea Mensaje_Encriptado;
    public javax.swing.JTextField Publica_Text_e;
    public javax.swing.JTextField Publica_Text_n;
    private javax.swing.JSeparator Separador;
    public javax.swing.JScrollPane Texto_Encriptado;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEncriptar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
