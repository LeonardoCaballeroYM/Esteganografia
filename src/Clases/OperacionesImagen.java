package Clases;

/*
 * @author YG
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class OperacionesImagen {

    private String ruta;
    private BufferedImage imagen;
    private FileNameExtensionFilter Filtro;
    String url, img;

    public OperacionesImagen() {
        imagen = null;
        ruta = "";
        Filtro = new FileNameExtensionFilter("Imagenes", "BMP", "JPG", "PNG");
    }

    public void Cargar_imagen_en_buffer(URL _url) {

        try {
            imagen = ImageIO.read(_url);
        } catch (IOException ex) {
        }
    }

    public void Scale() {
//        JFileChooser file = new JFileChooser();
//        file.showOpenDialog(this);
//        File archivo = file.getSelectedFile();
//        if (archivo != null) {
//            String foto = archivo.getPath();
//            ImageIcon icon = new ImageIcon(foto);
//            icon = new ImageIcon(icon.getImage().getScaledInstance(Area.getWidth(), Area.getHeight(), Image.SCALE_DEFAULT));
//            this.Area.setIcon(icon);
//        } else {
//            JOptionPane.showMessageDialog(null, "Porfavor seleccione una imagen");
//        }
    }

    public void Abrir_Dialogo(JLabel Imagen_Entrada) {

        JFileChooser selector = new JFileChooser();
        selector.setFileSelectionMode(JFileChooser.FILES_ONLY);
        selector.setFileFilter(Filtro);

        int returnVal = selector.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                URL url = selector.getSelectedFile().toURL();
                Cargar_imagen_en_buffer(url);

                ruta = selector.getSelectedFile().getPath();
                Imagen_Entrada.setVisible(false);
                Imagen_Entrada.setIcon(new ImageIcon(ruta));
                Imagen_Entrada.setVisible(true);
            } catch (Exception e) {
            }
        }

    }

    public void Guardar_Dialogo() {

        JFileChooser selector = new JFileChooser();
        selector.setFileSelectionMode(JFileChooser.FILES_ONLY);
        selector.setFileFilter(Filtro);

        int returnVal = selector.showSaveDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                url = selector.getSelectedFile().getPath();
                Guardar_imagen(url);
            } catch (Exception e) {
            }
        }

    }

    public void Guardar_imagen(String f) {

        try {
            String formato = (f.endsWith(".jpg")) ? "jpg" : "png";
            ImageIO.write(imagen, formato, new File(f));
        } catch (Exception e) {
        }
    }

    public FileNameExtensionFilter getFiltro() {
        return Filtro;
    }

    public void setFiltro(FileNameExtensionFilter Filtro) {
        this.Filtro = Filtro;
    }

    public BufferedImage getImagen() {
        return imagen;
    }

    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
