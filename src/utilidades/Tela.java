/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author brunoazzi
 */
public class Tela {
    public static final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    public static final int screenHeight = SCREEN_SIZE.height;
    public static final int screenWidth = SCREEN_SIZE.width;
    
    public static Dimension menuCategoriaDimension(){
        return new Dimension(screenWidth, (int) (screenHeight*0.2));
    }
    
    public static Dimension menuCategoriaScrollPaneDimension(){
        return new Dimension((int)(screenWidth*0.5),(int) (screenHeight*0.2));
    }
    
    public static Dimension promocoesDimension(){
        return new Dimension(screenWidth, (int) (screenHeight*0.2));
    }
    
    public static Dimension menuProdutos(){
        return new Dimension((int) (screenWidth*0.4), (int) (screenHeight*0.6));
    }
    
    public static Dimension menuDescricaoProduto(){
        return new Dimension((int) (screenWidth*0.6), (int) (screenHeight*0.6));
    }
    
    public static Dimension screenSizeTratado(){
        return new Dimension((int) (screenWidth),(int) (screenHeight-20));
    }
    
}
