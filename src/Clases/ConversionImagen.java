package Clases;

/*
 * @author YG
 */
import java.awt.image.*;

public class ConversionImagen {

    private BufferedImage imagen_inicial;
    private BufferedImage imagen_final;
    private double matrizImg[][];
    private double matrizImg_R[][];
    private double matrizImg_G[][];
    private double matrizImg_B[][];
    private int columnas;
    private int filas;
    private double r, g, b;
    private int numBandas;
    private WritableRaster raster;

    public ConversionImagen() {
    }

    public ConversionImagen(BufferedImage imagen_inicial) {

        this.imagen_inicial = imagen_inicial;
        filas = imagen_inicial.getHeight();
        columnas = imagen_inicial.getWidth();

        matrizImg = new double[filas][columnas];
        matrizImg_R = new double[filas][columnas];
        matrizImg_G = new double[filas][columnas];
        matrizImg_B = new double[filas][columnas];


        raster = imagen_inicial.getRaster();

        numBandas = raster.getNumBands();

    }

    //Covierte la Imagen a Matriz
    public void Imagen_Matriz() {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (numBandas == 3) {

                    r = raster.getSampleDouble(j, i, 0);
                    g = raster.getSampleDouble(j, i, 1);
                    b = raster.getSampleDouble(j, i, 2);
                    matrizImg[i][j] = (r + g + b) / 3;
                    matrizImg_R[i][j] = r;
                    matrizImg_G[i][j] = g;
                    matrizImg_B[i][j] = b;
                }
                if (numBandas == 1) {
                    matrizImg[i][j] = raster.getSampleDouble(j, i, 0);
                    matrizImg_R[i][j] = 0;
                    matrizImg_G[i][j] = 0;
                    matrizImg_B[i][j] = 0;
                }
            }
        }
    }

    //Matriz a Imagen en RGB
    public BufferedImage Matriz_Imagen(double Matriz_R[][], double Matriz_G[][], double Matriz_B[][]) {
        int alto = Matriz_R.length;
        int ancho = Matriz_R[0].length;

        imagen_final = new BufferedImage(ancho, alto, BufferedImage.TYPE_3BYTE_BGR);
        WritableRaster wr = imagen_final.getRaster();

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                wr.setSample(j, i, 0, Matriz_R[i][j]);
                wr.setSample(j, i, 1, Matriz_G[i][j]);
                wr.setSample(j, i, 2, Matriz_B[i][j]);
            }
        }

        imagen_final.setData(wr);

        return imagen_final;
    }
    //Matriz a Imagen en escala de Grises

    public BufferedImage Matriz_Imagen_EG(double Matriz[][]) {

        int alto = Matriz.length;
        int ancho = Matriz[0].length;

        imagen_final = new BufferedImage(ancho, alto, BufferedImage.TYPE_BYTE_GRAY);
        WritableRaster wr = imagen_final.getRaster();

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                wr.setSample(j, i, 0, Matriz[i][j]);
            }
        }

        imagen_final.setData(wr);

        return imagen_final;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public BufferedImage getImagen_final() {
        return imagen_final;
    }

    public void setImagen_final(BufferedImage imagen_final) {
        this.imagen_final = imagen_final;
    }

    public BufferedImage getImagen_inicial() {
        return imagen_inicial;
    }

    public void setImagen_inicial(BufferedImage imagen_inicial) {
        this.imagen_inicial = imagen_inicial;
    }

    public double[][] getMatrizImg() {
        return matrizImg;
    }

    public void setMatrizImg(double[][] matrizImg) {
        this.matrizImg = matrizImg;
    }

    public double[][] getMatrizImg_B() {
        return matrizImg_B;
    }

    public void setMatrizImg_B(double[][] matrizImg_B) {
        this.matrizImg_B = matrizImg_B;
    }

    public double[][] getMatrizImg_G() {
        return matrizImg_G;
    }

    public void setMatrizImg_G(double[][] matrizImg_G) {
        this.matrizImg_G = matrizImg_G;
    }

    public double[][] getMatrizImg_R() {
        return matrizImg_R;
    }

    public void setMatrizImg_R(double[][] matrizImg_R) {
        this.matrizImg_R = matrizImg_R;
    }

    public int getNumBandas() {
        return numBandas;
    }

    public void setNumBandas(int numBandas) {
        this.numBandas = numBandas;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public WritableRaster getRaster() {
        return raster;
    }

    public void setRaster(WritableRaster raster) {
        this.raster = raster;
    }
}
