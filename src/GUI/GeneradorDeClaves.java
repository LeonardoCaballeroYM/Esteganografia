package GUI;

/*
 * @author YG
 */
import Clases.CriptografiaRSA;
import javax.swing.ImageIcon;

public class GeneradorDeClaves extends javax.swing.JFrame {

    private CriptografiaRSA RSA;
    public boolean Activado;

    public GeneradorDeClaves() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/IconoCalavera.png")).getImage());
        this.setLocationRelativeTo(null);
        Activado = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Clave_Privada = new javax.swing.JPanel();
        Privada_Text_n = new javax.swing.JTextField();
        Privada_Text_d = new javax.swing.JTextField();
        Etiqueta_n = new javax.swing.JLabel();
        Etiqueta_d = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Clave_Publica = new javax.swing.JPanel();
        Publica_Text_n = new javax.swing.JTextField();
        Publica_Text_e = new javax.swing.JTextField();
        Etiqueta_n1 = new javax.swing.JLabel();
        Etiqueta_e = new javax.swing.JLabel();
        Etiqueta_Num_Primos = new javax.swing.JLabel();
        Tam_NumPrimos = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        Separador = new javax.swing.JSeparator();
        btnCerrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Generador de claves RSA");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clave Privada");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        Clave_Privada.setBackground(new java.awt.Color(51, 51, 51));
        Clave_Privada.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Clave_Privada.setForeground(new java.awt.Color(51, 51, 51));

        Privada_Text_n.setForeground(new java.awt.Color(0, 0, 0));
        Privada_Text_n.setEnabled(false);

        Privada_Text_d.setForeground(new java.awt.Color(0, 0, 0));
        Privada_Text_d.setEnabled(false);

        Etiqueta_n.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Etiqueta_n.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta_n.setText("b : ");

        Etiqueta_d.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Etiqueta_d.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta_d.setText("a : ");

        javax.swing.GroupLayout Clave_PrivadaLayout = new javax.swing.GroupLayout(Clave_Privada);
        Clave_Privada.setLayout(Clave_PrivadaLayout);
        Clave_PrivadaLayout.setHorizontalGroup(
            Clave_PrivadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Clave_PrivadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Clave_PrivadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Etiqueta_n, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Etiqueta_d))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Clave_PrivadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Privada_Text_n, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Privada_Text_d, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        Clave_PrivadaLayout.setVerticalGroup(
            Clave_PrivadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Clave_PrivadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Clave_PrivadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Etiqueta_d)
                    .addComponent(Privada_Text_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Clave_PrivadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Etiqueta_n)
                    .addComponent(Privada_Text_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Clave_Privada, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 123, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clave Publica");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        Clave_Publica.setBackground(new java.awt.Color(51, 51, 51));
        Clave_Publica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Clave_Publica.setForeground(new java.awt.Color(51, 51, 51));

        Publica_Text_n.setForeground(new java.awt.Color(0, 0, 0));
        Publica_Text_n.setEnabled(false);

        Publica_Text_e.setForeground(new java.awt.Color(0, 0, 0));
        Publica_Text_e.setEnabled(false);

        Etiqueta_n1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Etiqueta_n1.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta_n1.setText("u : ");

        Etiqueta_e.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Etiqueta_e.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta_e.setText("f : ");

        javax.swing.GroupLayout Clave_PublicaLayout = new javax.swing.GroupLayout(Clave_Publica);
        Clave_Publica.setLayout(Clave_PublicaLayout);
        Clave_PublicaLayout.setHorizontalGroup(
            Clave_PublicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Clave_PublicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Clave_PublicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Etiqueta_n1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Etiqueta_e))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Clave_PublicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Publica_Text_n, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Publica_Text_e, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        Clave_PublicaLayout.setVerticalGroup(
            Clave_PublicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Clave_PublicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Clave_PublicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Etiqueta_e)
                    .addComponent(Publica_Text_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Clave_PublicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Etiqueta_n1)
                    .addComponent(Publica_Text_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Clave_Publica, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 123, -1, -1));

        Etiqueta_Num_Primos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Etiqueta_Num_Primos.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta_Num_Primos.setText("Tamaño de Numero Primos a Generar ");
        getContentPane().add(Etiqueta_Num_Primos, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 33, -1, -1));

        Tam_NumPrimos.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Tam_NumPrimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 31, 83, -1));

        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/generar.png"))); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 61, -1, -1));
        getContentPane().add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 405, 12));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CERRAR.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flames.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

        if (!this.Tam_NumPrimos.getText().isEmpty()) {
            try {
                this.Privada_Text_d.setEnabled(true);
                this.Privada_Text_n.setEnabled(true);
                this.Publica_Text_e.setEnabled(true);
                this.Publica_Text_n.setEnabled(true);
                RSA = new CriptografiaRSA(Integer.parseInt(this.Tam_NumPrimos.getText()));
                this.Privada_Text_d.setText(RSA.getD() + "");//
                this.Privada_Text_n.setText(RSA.getN() + "");//
                this.Publica_Text_e.setText(RSA.getE() + "");
                this.Publica_Text_n.setText(RSA.getN() + "");
                Activado = true;
//                this.Privada_Text_d.setText(RSA.getD() + "");//
//                this.Privada_Text_n.setText(RSA.getN() + "");//
            } catch (Exception e) {
            }

        } else {
            Activado = false;
        }

    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false);
        Activado = true;
    }//GEN-LAST:event_btnCerrarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Clave_Privada;
    private javax.swing.JPanel Clave_Publica;
    private javax.swing.JLabel Etiqueta_Num_Primos;
    private javax.swing.JLabel Etiqueta_d;
    private javax.swing.JLabel Etiqueta_e;
    private javax.swing.JLabel Etiqueta_n;
    private javax.swing.JLabel Etiqueta_n1;
    public javax.swing.JTextField Privada_Text_d;
    public javax.swing.JTextField Privada_Text_n;
    public javax.swing.JTextField Publica_Text_e;
    public javax.swing.JTextField Publica_Text_n;
    private javax.swing.JSeparator Separador;
    public javax.swing.JTextField Tam_NumPrimos;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
