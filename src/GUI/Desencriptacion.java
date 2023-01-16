package GUI;

/*
 * @author YG
 */
import Clases.CriptografiaRSA;
import java.awt.BorderLayout;
import java.math.BigInteger;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;

public class Desencriptacion extends javax.swing.JFrame {

    private CriptografiaRSA RSA;
    public BigInteger[] textoCifrado;

    public Desencriptacion() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/IconoCalavera.png")).getImage());
        this.setLocationRelativeTo(null);
        RSA = new CriptografiaRSA();

    }

    public int tamaño() {
        String Mensaje = this.Mensaje_Encriptado.getText();
        StringTokenizer tokens = new StringTokenizer(Mensaje);
        int i = 0;
        while (tokens.hasMoreTokens()) {
            tokens.nextToken();
            i++;
        }

        return i;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Clave_Privada = new javax.swing.JPanel();
        Privada_Text_n = new javax.swing.JTextField();
        Privada_Text_d = new javax.swing.JTextField();
        Etiqueta_n = new javax.swing.JLabel();
        Etiqueta_d = new javax.swing.JLabel();
        Imagen_Receptor = new javax.swing.JLabel();
        Etiqueta_Receptor = new javax.swing.JLabel();
        Texto_Encriptado = new javax.swing.JScrollPane();
        Mensaje_Encriptado = new javax.swing.JTextArea();
        btnDesencriptar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        Separador = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Desencriptado Mendiante RSA");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Clave_Privada.setBackground(new java.awt.Color(255, 255, 255));
        Clave_Privada.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clave Privada", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        Clave_Privada.setForeground(new java.awt.Color(255, 255, 255));
        Clave_Privada.setOpaque(false);
        Clave_Privada.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Privada_Text_n.setForeground(new java.awt.Color(0, 0, 0));
        Clave_Privada.add(Privada_Text_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 113, -1));

        Privada_Text_d.setForeground(new java.awt.Color(0, 0, 0));
        Clave_Privada.add(Privada_Text_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 113, -1));

        Etiqueta_n.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Etiqueta_n.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta_n.setText("b : ");
        Clave_Privada.add(Etiqueta_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        Etiqueta_d.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Etiqueta_d.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta_d.setText("a : ");
        Clave_Privada.add(Etiqueta_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        Imagen_Receptor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Imagen_Receptor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Emi.png"))); // NOI18N
        Clave_Privada.add(Imagen_Receptor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        Etiqueta_Receptor.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Etiqueta_Receptor.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta_Receptor.setText("RECEPTOR");
        Clave_Privada.add(Etiqueta_Receptor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        getContentPane().add(Clave_Privada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, 300));

        Texto_Encriptado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mensaje Desencriptado", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        Texto_Encriptado.setOpaque(false);

        Mensaje_Encriptado.setBackground(new java.awt.Color(0, 0, 0));
        Mensaje_Encriptado.setColumns(10);
        Mensaje_Encriptado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Mensaje_Encriptado.setForeground(new java.awt.Color(0, 0, 0));
        Mensaje_Encriptado.setLineWrap(true);
        Mensaje_Encriptado.setRows(5);
        Mensaje_Encriptado.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Mensaje_Encriptado.setEnabled(false);
        Texto_Encriptado.setViewportView(Mensaje_Encriptado);

        getContentPane().add(Texto_Encriptado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 270, 300));

        btnDesencriptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Candado.png"))); // NOI18N
        btnDesencriptar.setText("Desencriptar");
        btnDesencriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesencriptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDesencriptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CERRAR.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, -1));
        getContentPane().add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 490, 23));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flames.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDesencriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesencriptarActionPerformed
           try {
            BigInteger N = new BigInteger(this.Privada_Text_n.getText());
            BigInteger D = new BigInteger(this.Privada_Text_d.getText());
            RSA.setD(D);
            RSA.setN(N);

            textoCifrado = new BigInteger[tamaño()];
            String Mensaje = this.Mensaje_Encriptado.getText();
            StringTokenizer tokens = new StringTokenizer(Mensaje);
            int i = 0;
            while (tokens.hasMoreTokens()) {
                textoCifrado[i] = new BigInteger(tokens.nextToken());
                i++;
            }

            this.Mensaje_Encriptado.setText(RSA.desencripta(this.textoCifrado));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDesencriptarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false);

    }//GEN-LAST:event_btnCerrarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Clave_Privada;
    private javax.swing.JLabel Etiqueta_Receptor;
    private javax.swing.JLabel Etiqueta_d;
    private javax.swing.JLabel Etiqueta_n;
    private javax.swing.JLabel Imagen_Receptor;
    public javax.swing.JTextArea Mensaje_Encriptado;
    public javax.swing.JTextField Privada_Text_d;
    public javax.swing.JTextField Privada_Text_n;
    private javax.swing.JSeparator Separador;
    private javax.swing.JScrollPane Texto_Encriptado;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnDesencriptar;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
