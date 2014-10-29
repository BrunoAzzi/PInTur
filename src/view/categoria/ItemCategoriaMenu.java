/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.categoria;

import model.Categoria;

/**
 *
 * @author bruno_azzi
 */
public class ItemCategoriaMenu extends javax.swing.JPanel {
    Categoria categoria = new Categoria();

    /**
     * Creates new form ItemCategoriaMenu
     */
    public ItemCategoriaMenu(Categoria categoria) {
        initComponents();
        setCategoria(categoria);
    }
    
    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
        jLabelCategoriaIcon.setIcon(categoria.getFotoCategoria().getFoto().getIcon());
        jLabelCategoriaDescription.setText(categoria.getNome());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCategoriaIcon = new javax.swing.JLabel();
        jLabelCategoriaDescription = new javax.swing.JLabel();

        jLabelCategoriaDescription.setText("<Descricao Categoria>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCategoriaIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelCategoriaDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelCategoriaIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCategoriaDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCategoriaDescription;
    private javax.swing.JLabel jLabelCategoriaIcon;
    // End of variables declaration//GEN-END:variables
}