package locadora.app.gui.cadastro;

import bancolib.entity.Carro;



public class CadastroCarroEditarGUI extends javax.swing.JDialog {

    Carro carroEditar = null;
    CadastroCarroGUI parentDialog;

    public CadastroCarroEditarGUI(java.awt.Frame parent, boolean modal, CadastroCarroGUI parentDialog) {
        super(parent, modal);

        this.parentDialog = parentDialog;

        initComponents();

        carregarComboBoxFabricante();
        carregarComboBoxModelo();
    }

    public void carregar(Integer id) {
//        carroEditar = App.sqlUtil.selectPorClasse(Carro.class, id);
    }

    private void carregarComboBoxFabricante() {
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
    
    private void carregarComboBoxModelo() {
//        List<Modelo> lista = App.sqlUtil.selectPorClasse(Modelo.class, null);
//
//        Object[] valoresModel = new Object[lista.size()];
//
//        int i = 0;
//
//        for (Modelo modelo : lista) {
//            valoresModel[i] = modelo;
//
//            i++;
//        }
//
//        DefaultComboBoxModel model = new DefaultComboBoxModel(valoresModel);
//
//        cboModelo.setModel(model);
    }

    private void limparComponentes() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        plnCarro = new javax.swing.JPanel();
        cboFabricante = new javax.swing.JComboBox<>();
        lblFabricante = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        cboModelo = new javax.swing.JComboBox<>();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblCor = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        lblValorlocacao = new javax.swing.JLabel();
        txtValorlocacao = new javax.swing.JTextField();
        chkDisponivel = new javax.swing.JCheckBox();

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

        plnCarro.setBorder(javax.swing.BorderFactory.createTitledBorder("Carro"));

        lblFabricante.setText("Fabricante:");

        lblModelo.setText("Modelo:");

        lblPlaca.setText("Placa:");

        lblCor.setText("Cor:");

        lblValorlocacao.setText("Valor Locação:");

        chkDisponivel.setText("Disponivel");

        javax.swing.GroupLayout plnCarroLayout = new javax.swing.GroupLayout(plnCarro);
        plnCarro.setLayout(plnCarroLayout);
        plnCarroLayout.setHorizontalGroup(
            plnCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plnCarroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(plnCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plnCarroLayout.createSequentialGroup()
                        .addGroup(plnCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFabricante)
                            .addComponent(cboFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(plnCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblModelo)
                            .addComponent(cboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(plnCarroLayout.createSequentialGroup()
                        .addGroup(plnCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlaca)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(plnCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCor)
                            .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(plnCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblValorlocacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValorlocacao))
                        .addGap(18, 18, 18)
                        .addComponent(chkDisponivel))))
        );
        plnCarroLayout.setVerticalGroup(
            plnCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plnCarroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plnCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(plnCarroLayout.createSequentialGroup()
                        .addComponent(lblModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(plnCarroLayout.createSequentialGroup()
                        .addComponent(lblFabricante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plnCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(plnCarroLayout.createSequentialGroup()
                        .addComponent(lblPlaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(plnCarroLayout.createSequentialGroup()
                        .addComponent(lblValorlocacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(plnCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValorlocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkDisponivel)))
                    .addGroup(plnCarroLayout.createSequentialGroup()
                        .addComponent(lblCor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(plnCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plnCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnFechar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
//        if (carroEditar != null) {
//            int id = carroEditar.id;
//
//            Fabricante fabricante = (Fabricante) cboFabricante.getModel().getSelectedItem();
//
//            String[] colunas = {"nome", "id_fabricante"};
//            Object[] valores = {fabricante.id};
//
//            try {
////                App.sqlUtil.update("carro", id, colunas, valores);
//
//                JOptionPane.showMessageDialog(null, "Carro Atualizado com sucesso!");
//
//                parentDialog.carregarTabela();
//
//                this.dispose();
//            } catch (SQLException ex) {
//                Logger.getLogger(TelaPrincipalGUI.class.getName()).log(Level.SEVERE, null, ex);
//                JOptionPane.showMessageDialog(null, ex.getMessage());
//            }
//        } else {
//            Fabricante fabricante = (Fabricante) cboFabricante.getModel().getSelectedItem();
//
//            String[] colunas = {"nome", "id_fabricante"};
//            Object[] valores = {fabricante.id};
//
//            try {
//                App.sqlUtil.insert("carro", colunas, valores);
//
//                JOptionPane.showMessageDialog(null, "Carro Salvo com sucesso!");
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
    private javax.swing.JComboBox<String> cboModelo;
    private javax.swing.JCheckBox chkDisponivel;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblValorlocacao;
    private javax.swing.JPanel plnCarro;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtValorlocacao;
    // End of variables declaration//GEN-END:variables
}
