/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import model.Foto;

/**
 *
 * @author brunoazzi
 */
public class ImageChooser extends FileDialog {
    File file;

    public ImageChooser(Frame parent) {
        super(parent);
        setTitle("Escolha uma imagem");
        this.setAutoRequestFocus(true);
        //TODO ver como se aceita apenas imagens
    }

    public byte[] getImage(){
        byte[] image = new byte[(int) getSingleImageFile().length()];

        try {
            FileInputStream fileInputStream = new FileInputStream(getSingleImageFile());
            fileInputStream.read(image);
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return image;
    }
            
    public File getSingleImageFile(){
        return super.getFiles()[0];
    }
    
    public Foto getFoto(){
        Foto foto = new Foto();
        foto.setImage(getImage());
        return foto;
    }
    
    public ImageIcon getIcon(){
        return new ImageIcon(getImage());
    }
    
}
