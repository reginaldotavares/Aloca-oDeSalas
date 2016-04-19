/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.telas;

import br.com.sistema.controller.FacadeAssistente;
import br.com.sistema.modelos.Alocacao;
import br.com.sistema.modelos.Material;
import br.com.sistema.modelos.ModeloTabelaMaterial;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Reginaldo
 */
    public class SelecionarMaterial extends javax.swing.JFrame {
    FacadeAssistente fachadaAssistente = new FacadeAssistente();
    private ModeloTabelaMaterial tabelaDireita;
    private ModeloTabelaMaterial tabelaEsquerda;
    private AlocarEvento telaEvento;
    /**
     * Creates new form SelecionarMaterial
     */
    public SelecionarMaterial() throws SQLException {
        initComponents();
        ArrayList<Material> lista = fachadaAssistente.listarMateriais();
        this.tabelaDireita = new ModeloTabelaMaterial();
        this.jTable2.setModel(tabelaDireita);
        this.tabelaEsquerda = new ModeloTabelaMaterial(lista);
        this.jTable1.setModel(tabelaEsquerda);
        if(tabelaEsquerda!=null){
            BotaoAdicionar.setEnabled(true);
        }
        
    }

    SelecionarMaterial(AlocarEvento tela2, String descricao) throws SQLException {
        this();
        this.telaEvento = tela2;
        evento.setText(descricao);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        evento = new javax.swing.JTextField();
        filtrarMaterial = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        BotaoAdicionar = new javax.swing.JButton();
        BotaoRemover = new javax.swing.JButton();
        BotaoRemoverTodos = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alocar Material");
        setResizable(false);

        jLabel1.setText("Evento");

        evento.setEnabled(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane2.setViewportView(jTable2);

        BotaoAdicionar.setText(">");
        BotaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAdicionarActionPerformed(evt);
            }
        });

        BotaoRemover.setText("<");
        BotaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRemoverActionPerformed(evt);
            }
        });

        BotaoRemoverTodos.setText("<<");
        BotaoRemoverTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRemoverTodosActionPerformed(evt);
            }
        });

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pular.png"))); // NOI18N
        cancelar.setText("Pular");
        cancelar.setToolTipText("Pular");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Ok_Icon_16.png"))); // NOI18N
        cadastrar.setText("Confirmar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Selecionar Material");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(evento, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filtrarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoRemoverTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(evento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(filtrarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(BotaoAdicionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotaoRemover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotaoRemoverTodos))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAdicionarActionPerformed
        List<Material> l = tabelaEsquerda.removeElements(jTable1.getSelectedRows());
        tabelaDireita.addElement(l);

    }//GEN-LAST:event_BotaoAdicionarActionPerformed

    private void BotaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRemoverActionPerformed

        List<Material> l = tabelaDireita.removeElements(jTable2.getSelectedRows());
        tabelaEsquerda.addElement(l);
        
    }//GEN-LAST:event_BotaoRemoverActionPerformed

    private void BotaoRemoverTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRemoverTodosActionPerformed
 
        jTable2.selectAll();
        List<Material> l = tabelaDireita.removeElements(jTable2.getSelectedRows());
        tabelaEsquerda.addElement(l);
    }//GEN-LAST:event_BotaoRemoverTodosActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        jTable2.selectAll();
        List<Material> l = tabelaDireita.getElements(jTable2.getSelectedRows());
        List<Material> elementos = new ArrayList<>();
        for(int i=0;i<l.size();i++){
            try {
//            elementos.add(l.get(i));
                Integer tombamento = l.get(i).getTombamento();
                String nomeEvento = evento.getText();
//            String Str = nomeEvento;
//                String[] TableLine;
//                TableLine = nomeEvento.split(";");
//                List lista = new ArrayList();
//                for (String cell : TableLine) {
//                    lista.add(cell);
//                }
//                String[] line = nomeEvento.split(" - ");
//                String nome = line[0];
                
                Alocacao alocacao = fachadaAssistente.getAlocacao(nomeEvento);
                String local = alocacao.getSala();
                
                try {
                    if(fachadaAssistente.cadastrarAlocacaoMaterial(tombamento, nomeEvento, local)){
                        JOptionPane.showMessageDialog(null, "Alocado com sucesso!");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SelecionarMaterial.class.getName()).log(Level.SEVERE, null, ex);
                }
            }catch (SQLException ex) {
                Logger.getLogger(SelecionarMaterial.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
       

    }//GEN-LAST:event_cadastrarActionPerformed
    
    public void verificarStatusBotaoRemover(List<Material> lista){
        
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
            java.util.logging.Logger.getLogger(SelecionarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelecionarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelecionarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelecionarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SelecionarMaterial().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(SelecionarMaterial.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAdicionar;
    private javax.swing.JButton BotaoRemover;
    private javax.swing.JButton BotaoRemoverTodos;
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField evento;
    private javax.swing.JTextField filtrarMaterial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
