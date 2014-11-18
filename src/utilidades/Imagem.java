/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilidades;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author brunoazzi
 */
public class Imagem {
    private static Image originalImage;
    
    public static Icon createResizedIcon(URL url, int scaledWidth, int scaledHeight, boolean preserveAlpha){
    	System.out.println("resizing...");
        
        try {
            originalImage = ImageIO.read(url);
        } catch (IOException ex) {
            Logger.getLogger(Imagem.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("URL dando Merda");
        }
        
    	int imageType = preserveAlpha ? BufferedImage.TYPE_INT_RGB : BufferedImage.TYPE_INT_ARGB;
        
    	BufferedImage scaledBI = new BufferedImage(scaledWidth, scaledHeight, imageType);
        
    	Graphics2D g = scaledBI.createGraphics();
        
    	if (preserveAlpha) {
    		g.setComposite(AlphaComposite.Src);
    	}
        
    	g.drawImage(originalImage, 0, 0, scaledWidth, scaledHeight, null); 
    	g.dispose();
        
        Image img = scaledBI;
        return new ImageIcon(img);
    }
    
    public static Icon createResizedIcon(URL url, int scale, boolean preserveAlpha){
        return createResizedIcon(url, scale, scale, preserveAlpha);
    }
   
    //TODO Checar metodo alternativo de redimensionamento de imagem;

    public static ImageIcon resizeImage(int width, int heigth, File file){
        BufferedImage bi = null;
        try {
            bi = ImageIO.read(file);
        } catch (IOException ex) {
            Logger.getLogger(Imagem.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedImage aux = new BufferedImage(width, heigth, bi.getType());//cria um buffer auxiliar com o tamanho desejado    
        Graphics2D g = aux.createGraphics();//pega a classe graphics do aux para edicao    
        AffineTransform at = AffineTransform.getScaleInstance((double) width / bi.getWidth(), (double) heigth / bi.getHeight());//cria a transformacao
        g.drawRenderedImage(bi, at);//pinta e transforma a imagem real no auxiliar
        return new ImageIcon(aux);
    }

    public static ImageIcon resizeImage(int width, int heigth, URL url){
        File basketImageFile = null;
        try {
            basketImageFile = new File(url.toURI());
        } catch (URISyntaxException ex) {
            Logger.getLogger(Imagem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resizeImage(width, heigth, basketImageFile);
    }
    
    public static ImageIcon resizeImage(int width, int heigth, ImageIcon image){
        BufferedImage bi = null;
        try {
            bi = ImageIO.read(ImageIO.createImageInputStream(image));
        } catch (IOException ex) {
            Logger.getLogger(Imagem.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedImage aux = new BufferedImage(width, heigth, bi.getType());//cria um buffer auxiliar com o tamanho desejado    
        Graphics2D g = aux.createGraphics();//pega a classe graphics do aux para edicao    
        AffineTransform at = AffineTransform.getScaleInstance((double) width / bi.getWidth(), (double) heigth / bi.getHeight());//cria a transformacao
        g.drawRenderedImage(bi, at);//pinta e transforma a imagem real no auxiliar
        return new ImageIcon(aux);
    }
    
//    public static File testeFileResizeImage(int width, int heigth, File file){
//        File returnFile = new File("image.jpg");
//        BufferedImage bi = null;
//        try {
//            bi = ImageIO.read(file);
//        } catch (IOException ex) {
//            Logger.getLogger(Imagem.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        BufferedImage aux = new BufferedImage(width, heigth, bi.getType());//cria um buffer auxiliar com o tamanho desejado    
//        Graphics2D g = aux.createGraphics();//pega a classe graphics do aux para edicao    
//        AffineTransform at = AffineTransform.getScaleInstance((double) width / bi.getWidth(), (double) heigth / bi.getHeight());//cria a transformacao
//        g.drawRenderedImage(bi, at);//pinta e transforma a imagem real no auxiliar
//        try {
//            ImageIO.write(bi, "jpg", returnFile);
//        } catch (IOException ex) {
//            Logger.getLogger(Imagem.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return returnFile;
//    }
}
