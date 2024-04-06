package locadora.app.gui.cadastro;

import bancolib.entity.Modelo;

public class CadastroModeloEditarGUI extends javax.swing.JDialog {

    Modelo modeloEditar = null;
    CadastroModeloGUI parentDialog;

    public CadastroModeloEditarGUI(java.awt.Frame parent, boolean modal, CadastroModeloGUI parentDialog) {
        super(parent, modal);

        this.parentDialog = parentDialog;

        initComponents();

        carregarComboBoxFabricante();
    }

    public void carregar(Integer id) {
//        modeloEditar = App.sqlUtil.selectPorClasse(Modelo.class, id);

        txtNome.setText(modeloEditar.nome);
    }

    public void carregarComboBoxFabricante() {
//        List<Fabricante> lista = App.sqlUtil.selectPorClasse(Fabricante.class, null);
//
//        Object[] valoresModel = new Object[lista.size()];
//
//        int i = 0;
//
//        for (Fabricante fabricante : lista) {
//            valoresModel[i] = fabricante;
//
//            i++;
//        }
//
//        DefaultComboBoxModel model = new DefaultComboBoxModel(valoresModel);
//
//        cboFabricante.setModel(model);
    }

    private void limparComponentes() {
        txtNome.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        plnModelo = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        cboFabricante = new javax.swing.JComboBox<>();
        lblFabricante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        plnModelo.setBorder(javax.swing.BorderFactory.createTitledBorder("Modelo"));

        lblNome.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblNome.setText("Nome:");

        lblFabricante.setText("Fabricante:");

        javax.swing.GroupLayout plnModeloLayout = new javax.swing.GroupLayout(plnModelo);
        plnModelo.setLayout(plnModeloLayout);
        plnModeloLayout.setHorizontalGroup(
            plnModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plnModeloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plnModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFabricante)
                    .addComponent(txtNome)
                    .addComponent(lblNome)
                    .addComponent(cboFabricante, 0, 200, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        plnModeloLayout.setVerticalGroup(
            plnModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plnModeloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFabricante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(444, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plnModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plnModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnFechar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
//        if (modeloEditar != null) {
//            int id = modeloEditar.id;
//            String nome = txtNome.getText();
//
//            Fabricante fabricante = (Fabricante) cboFabricante.getModel().getSelectedItem();
//
//            String[] colunas = {"nome", "id_fabricante"};
//            Object[] valores = {nome, fabricante.id};
//
//            try {
//                App.sqlUtil.update("modelo", id, colunas, valores);
//
//                JOptionPane.showMessageDialog(null, "Modelo Atualizado com sucesso!");
//
//                parentDialog.carregarTabela();
//
//                this.dispose();
//            } catch (SQLException ex) {
//                Logger.getLogger(TelaPrincipalGUI.class.getName()).log(Level.SEVERE, null, ex);
//                JOptionPane.showMessageDialog(null, ex.getMessage());
//            }
//        } else {
//            String nome = txtNome.getText();
//
//            Fabricante fabricante = (Fabricante) cboFabricante.getModel().getSelectedItem();
//
//            String[] colunas = {"nome", "id_fabricante"};
//            Object[] valores = {nome, fabricante.id};
//
//            try {
//                App.sqlUtil.insert("modelo", colunas, valores);
//
//                JOptionPane.showMessageDialog(null, "Modelo Salvo com sucesso!");
//
//                parentDialog.carregarTabela();
//
//                limparComponentes();
//            } catch (SQLException ex) {
//                Logger.getLogger(TelaPrincipalGUI.class.getName()).log(Level.SEVERE, null, ex);
//                JOptionPane.showMessageDialog(null, ex.getMessage());
//            }
//        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cboFabricante;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel plnModelo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
