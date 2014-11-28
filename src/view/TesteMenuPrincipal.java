/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ProdutoControl;
import control.PromocaoControl;
import java.util.Calendar;
import model.Produto;
import utilidades.Tela;
import view.categoria.MenuCategorias;
import view.produto.MenuProdutos;
import view.produto.MenuProdutosSelecionados;
import view.promocao.MenuPromocao;

/**
 *
 * @author bruno_azzi
 */
public class TesteMenuPrincipal extends javax.swing.JFrame {

    MenuProdutos menuProdutos = new MenuProdutos();
    MenuCategorias menuCategorias = new MenuCategorias();
    MenuPromocao menuPromocoes = new MenuPromocao();
    MenuProdutosSelecionados menuProdutosSelecionados = new MenuProdutosSelecionados();

    /**
     * Creates new form TesteMenuPrincipal
     */
    public TesteMenuPrincipal() {
        initComponents();
        initMenuProdutos();
        initMenuCategorias();
        initMenuPromocoes();
        initMenuProdutosSelecionados();

        //DEIXANDO A DESCRICAO PRODUTO SER MANIPULADA PELO MENU PRODUTOS
        menuProdutos.setMenuProdutosSelecionados(menuProdutosSelecionados);
        //DEIXANDO OS PRODUTOS SEREM MANIPULADOS PELO MENU CATEGORIA
        menuCategorias.setMenuProdutos(menuProdutos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(Tela.screenSizeTratado());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                updateListas(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 421, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateListas(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_updateListas
        menuCategorias.initCategorias();
    }//GEN-LAST:event_updateListas

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TesteMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TesteMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TesteMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TesteMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TesteMenuPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    private void initMenuProdutos() {
        menuProdutos.setVisible(true);
        menuProdutos.setBounds(Tela.menuProdutosBounds());
        this.add(menuProdutos);
    }

    private void initMenuCategorias() {
        menuCategorias.setVisible(true);
        menuCategorias.setBounds(Tela.menuCategoriaBounds());
        this.add(menuCategorias);
    }

    private void initMenuPromocoes() {
        PromocaoControl.verificarPromocoes();
        menuPromocoes.setVisible(true);
        menuPromocoes.setBounds(Tela.menuPromocoesBounds());
        this.add(menuPromocoes);
    }

    private void initMenuProdutosSelecionados() {
        menuProdutosSelecionados.setVisible(true);
        menuProdutosSelecionados.setBounds(Tela.menuProdutosSelecionadosBounds());
        this.add(menuProdutosSelecionados);
    }
}
