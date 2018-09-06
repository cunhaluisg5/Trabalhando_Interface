/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import dao.ProdutoDao;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produtos;

/**
 *
 * @author Luis
 */
public class Produto extends javax.swing.JDialog {

    ProdutoDao dao;
    
    public Produto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbcabecalho = new javax.swing.JLabel();
        lbcodigo = new javax.swing.JLabel();
        tfcodigo = new javax.swing.JTextField();
        lbnome = new javax.swing.JLabel();
        tfnome = new javax.swing.JTextField();
        lbdescricao = new javax.swing.JLabel();
        tfdescricao = new javax.swing.JTextField();
        lbpreco = new javax.swing.JLabel();
        tfpreco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbinfo = new javax.swing.JTable();
        btnovo = new javax.swing.JButton();
        btsalvar = new javax.swing.JButton();
        btexcluir = new javax.swing.JButton();
        bteditar = new javax.swing.JButton();
        btpesquisar = new javax.swing.JButton();
        btsair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Produto");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lbcabecalho.setBackground(new java.awt.Color(0, 102, 102));
        lbcabecalho.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbcabecalho.setForeground(new java.awt.Color(0, 51, 51));
        lbcabecalho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbcabecalho.setText("Tela de Produto");

        lbcodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbcodigo.setText("Código:");

        tfcodigo.setEditable(false);
        tfcodigo.setEnabled(false);

        lbnome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbnome.setText("Nome:");

        lbdescricao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbdescricao.setText("Descrição:");

        lbpreco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbpreco.setText("Preço:");

        tbinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Descrição", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbinfo.getTableHeader().setReorderingAllowed(false);
        tbinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbinfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbinfo);
        if (tbinfo.getColumnModel().getColumnCount() > 0) {
            tbinfo.getColumnModel().getColumn(0).setResizable(false);
            tbinfo.getColumnModel().getColumn(1).setResizable(false);
            tbinfo.getColumnModel().getColumn(2).setResizable(false);
            tbinfo.getColumnModel().getColumn(3).setResizable(false);
        }

        btnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/novo.jpg"))); // NOI18N
        btnovo.setText("Novo");
        btnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovoActionPerformed(evt);
            }
        });

        btsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar.gif"))); // NOI18N
        btsalvar.setText("Salvar");
        btsalvar.setEnabled(false);
        btsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvarActionPerformed(evt);
            }
        });

        btexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/DEL.jpg"))); // NOI18N
        btexcluir.setText("Excluir");
        btexcluir.setEnabled(false);

        bteditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/edit.png"))); // NOI18N
        bteditar.setText("Editar");
        bteditar.setEnabled(false);

        btpesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Buscar.jpg"))); // NOI18N
        btpesquisar.setText("Pesquisar");

        btsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.gif"))); // NOI18N
        btsair.setText("Sair");
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbcabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbpreco)
                            .addComponent(lbdescricao)
                            .addComponent(lbnome)
                            .addComponent(lbcodigo)
                            .addComponent(tfpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bteditar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btpesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btsair, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addComponent(tfnome)
                            .addComponent(tfdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbcabecalho)
                .addGap(27, 27, 27)
                .addComponent(lbcodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbnome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbdescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbpreco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bteditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btsair, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
        int recebe = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair", JOptionPane.YES_NO_OPTION);
        if(recebe == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_btsairActionPerformed

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed
        try{
            Produtos obj = new Produtos();
            obj.setNome(tfnome.getText());
            obj.setDescricao(tfdescricao.getText());
            obj.setPreco(Double.parseDouble(tfpreco.getText()));
            dao = new ProdutoDao();
            dao.cadastrarProduto(obj);
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o produto!", "Produto não Cadastrado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btsalvarActionPerformed

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
        tfnome.setText("");
        tfdescricao.setText("");
        tfpreco.setText("");
        tfnome.requestFocus();
        bteditar.setEnabled(true);
        btexcluir.setEnabled(true);
        btsalvar.setEnabled(true);
    }//GEN-LAST:event_btnovoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void tbinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbinfoMouseClicked
        tfcodigo.setText(tbinfo.getValueAt(tbinfo.getSelectedRow(), 0).toString());
        tfnome.setText(tbinfo.getValueAt(tbinfo.getSelectedRow(), 1).toString());
        tfdescricao.setText(tbinfo.getValueAt(tbinfo.getSelectedRow(), 2).toString());
        tfpreco.setText(tbinfo.getValueAt(tbinfo.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tbinfoMouseClicked

    public void listar(){
        try{
            dao = new ProdutoDao();
            List<Produtos> lista = dao.listarProdutos();
            DefaultTableModel modelo = (DefaultTableModel) tbinfo.getModel();
            modelo.setNumRows(0);
            for(Produtos p : lista){
                modelo.addRow(new Object[]{
                    p.getId(),
                    p.getNome(),
                    p.getDescricao(),
                    p.getPreco()
                });
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não foi possível listar os produtos!");
        }
    }

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
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Produto dialog = new Produto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bteditar;
    private javax.swing.JButton btexcluir;
    private javax.swing.JButton btnovo;
    private javax.swing.JButton btpesquisar;
    private javax.swing.JButton btsair;
    private javax.swing.JButton btsalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbcabecalho;
    private javax.swing.JLabel lbcodigo;
    private javax.swing.JLabel lbdescricao;
    private javax.swing.JLabel lbnome;
    private javax.swing.JLabel lbpreco;
    private javax.swing.JTable tbinfo;
    private javax.swing.JTextField tfcodigo;
    private javax.swing.JTextField tfdescricao;
    private javax.swing.JTextField tfnome;
    private javax.swing.JTextField tfpreco;
    // End of variables declaration//GEN-END:variables
}
