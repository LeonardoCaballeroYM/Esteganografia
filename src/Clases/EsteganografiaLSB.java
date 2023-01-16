package Clases;

/*
 * @author YG
 */

import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;

public class EsteganografiaLSB {

    private BufferedImage Imagen;
    private ConversionImagen Conv;
    private String Firma = "UNT";
    private double R[][];
    private double G[][];
    private double B[][];
    private int Longitud;
    private String mensaje_binario;
    private String mensaje_original;
    private int contador = 0;

    public EsteganografiaLSB(BufferedImage Imagen) {
        this.Imagen = Imagen;
        Conv = new ConversionImagen(this.Imagen);
        Conv.Imagen_Matriz();

        R = Conv.getMatrizImg_R();
        G = Conv.getMatrizImg_G();
        B = Conv.getMatrizImg_B();

    }

    public BufferedImage Ocultar_Mensaje(String Mensaje) {

        this.Mensaje_Total_Binario(Mensaje);

        int cont = 0;
        int r, g, b;

        for (int i = 0; i < Imagen.getHeight(); i++) {
            for (int j = 0; j < Imagen.getWidth(); j++) {

                if (cont <= this.mensaje_binario.length()) {

                    String rojo = "" + Caracter_Binario(R[i][j]);
                    String verde = Caracter_Binario(G[i][j]);
                    String azul = Caracter_Binario(B[i][j]);

                    rojo = Reemplazar_LSB(rojo);
                    verde = Reemplazar_LSB(verde);
                    azul = Reemplazar_LSB(azul);

                    r = Integer.parseInt(rojo, 2);
                    g = Integer.parseInt(verde, 2);
                    b = Integer.parseInt(azul, 2);

                } else {
                    r = (int) R[i][j];
                    g = (int) G[i][j];
                    b = (int) B[i][j];
                }

                R[i][j] = (double) r;
                G[i][j] = (double) g;
                B[i][j] = (double) b;

                cont += 3;

            }


        }
        return Conv.Matriz_Imagen(R, G, B);

    }

    public String Ver_Mensaje(BufferedImage f) {

        mensaje_original = "";

        if (Leer_Firma(f)) {

            LeerLongitudDelMensaje(f);
            String[] s = new String[this.Longitud];
            String tmp = "";


            for (int i = 0; i < Imagen.getHeight(); i++) {
                for (int j = 0; j < Imagen.getWidth(); j++) {

                    String rojo = Caracter_Binario(R[i][j]);
                    String verde = Caracter_Binario(G[i][j]);
                    String azul = Caracter_Binario(B[i][j]);

                    rojo = Capturar_LSB(rojo);
                    verde = Capturar_LSB(verde);
                    azul = Capturar_LSB(azul);

                    if (tmp.length() <= ((this.Longitud + (2 * Firma.length())) * 8)) {
                        tmp = tmp + rojo + verde + azul;
                    } else {
                        break;
                    }
                }
            }
            int cortar = this.Firma.length() * 8 + 16;
            tmp = tmp.substring(cortar, cortar + Longitud * 8);

            int count_tmp = 0;

            for (int a = 0; a < (this.Longitud * 8); a = a + 8) {
                s[count_tmp] = tmp.substring(a, a + 8);
                count_tmp++;
            }
            mensaje_original = MensajeBinario_Cadena(s);

        }
        else {
            JOptionPane.showMessageDialog(null, "No existe ningún mensaje oculto", "Mensaje", JOptionPane.WARNING_MESSAGE);
        }

        return mensaje_original;
    }

    private void LeerLongitudDelMensaje(BufferedImage f) {
        String t = "";
        for (int j = 8; j < 14; j++) {
            String rojo = Caracter_Binario(R[0][j]);
            String verde = Caracter_Binario(G[0][j]);
            String azul = Caracter_Binario(B[0][j]);

            rojo = Capturar_LSB(rojo);
            verde = Capturar_LSB(verde);
            azul = Capturar_LSB(azul);
            t = t + rojo + verde + azul;
        }
        this.Longitud = toCharInt(t.substring(1, 16));
    }

    private int toCharInt(String binario) {
        int i = Integer.parseInt(binario, 2);
        return i;
    }

    private boolean Leer_Firma(BufferedImage f) {

        String Firma_Verificar = "";

        for (int j = 0; j < 8; j++) {

            String rojo = Caracter_Binario(R[0][j]);
            String verde = Caracter_Binario(G[0][j]);
            String azul = Caracter_Binario(B[0][j]);

            rojo = Capturar_LSB(rojo);
            verde = Capturar_LSB(verde);
            azul = Capturar_LSB(azul);

            Firma_Verificar = Firma_Verificar + rojo + verde + azul;
        }
        if (Binario_Caracter(Firma_Verificar.substring(0, 8)).equals("U")
                && Binario_Caracter(Firma_Verificar.substring(8, 16)).equals("N")
                && Binario_Caracter(Firma_Verificar.substring(16, 24)).equals("T")) {
            return true;
        }

        return false;
    }

    private String Caracter_Binario(double caracter) {

        byte byteDeCaracter = (byte) caracter;

        String binario = "";
        for (int i = 7; i >= 0; i--) {
            binario = binario + (((byteDeCaracter & (1 << i)) > 0) ? "1" : "0");
        }
        return binario;
    }

    private String MensajeBinario_Cadena(String[] mensaje) {
        String mo = "";
        for (int i = 0; i < mensaje.length; i++) {
            mo = mo + Binario_Caracter(mensaje[i]);
        }
        return mo;
    }

    private String Binario_Caracter(String binario) {
        int i = Integer.parseInt(binario, 2);
        String aChar = new Character((char) i).toString();
        return aChar;

    }

    private void Mensaje_Total_Binario(String Mensaje) {
        String bi = "";

        Longitud = Mensaje.length();
        for (int i = 15; i >= 0; i--) {
            bi = bi + (((Longitud & (1 << i)) > 0) ? "1" : "0");
        }


        mensaje_binario = Cadena_Binario(Firma) + bi + Cadena_Binario(Mensaje);
    }

    private String Cadena_Binario(String mensaje) {
        String mb = "";
        char[] mensaje_tmp = mensaje.toCharArray();
        for (int i = 0; i < mensaje_tmp.length; i++) {
            mb = mb + Caracter_Binario((byte) mensaje_tmp[i]);
        }
        return mb;
    }

    private String Capturar_LSB(String binario) {
        return binario.substring(7, 8);
    }

    private String Reemplazar_LSB(String Color_RGB) {
        if (contador < mensaje_binario.length()) {
            Color_RGB = Color_RGB.substring(0, 7) + mensaje_binario.substring(contador, contador + 1);
            contador++;
        }
        return Color_RGB;
    }
    
    
}
