/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;

/**
 *
 * @author brunoazzi
 */
public class Tela {
    public static final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    public static final int screenHeight = SCREEN_SIZE.height-50;
    public static final int screenWidth = SCREEN_SIZE.width;
    
    //CATEGORIA
    public static Dimension menuCategoriaDimension(){
        return new Dimension(screenWidth, (int) (screenHeight*0.2));
    }
    
    public static Dimension menuCategoriaScrollPaneDimension(){
        return new Dimension((int)(screenWidth*0.5),(int) (screenHeight*0.2));
    }
    
    public static Rectangle menuCategoriaBounds() {
        return new Rectangle(0,0,screenWidth, (int) (screenHeight*0.2));
    }
    
    //PROMOCAO
    public static Dimension promocoesDimension(){
        return new Dimension(screenWidth, (int) (screenHeight*0.2));
    }
    
    //PRODUTOS
    public static Rectangle menuProdutosBounds(){
        return new Rectangle(0 , (int) (screenHeight*0.4),(int) (screenWidth*0.6), (int) (screenHeight*0.4));
    }
     public static Rectangle menuPromocoesBounds(){
        return new Rectangle(0 , (int) (screenHeight*0.1),(int) (screenWidth*0.6), (int) (screenHeight*0.4));
    }   
    public static Dimension menuProdutos(){
        return new Dimension((int) (screenWidth*0.4), (int) (screenHeight*0.6));
    }
    
    //DESCRICAO PRODUTO
    public static Rectangle menuDescricaoProduto(){
        return new Rectangle(0 , (int) (screenHeight*0.4),(int) (screenWidth*0.4), (int) (screenHeight*0.6));
    }
   
    //SCREEN SIZE
    public static Dimension screenSizeTratado(){
        return new Dimension((int) (screenWidth),(int) (screenHeight));
    }
    
}
