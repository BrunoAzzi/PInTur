/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author bruno_azzi
 */
public class Formatador {
    
    public static String charArrayToString(char[] password){
        String senha = "";
        for (char c : password) {
            senha += Character.toString(c);
        }
        return senha;
    }
    
}
