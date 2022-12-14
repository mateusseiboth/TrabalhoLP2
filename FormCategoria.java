package trabalholp2;

import javax.swing.JOptionPane;

/**
 *
 * @author mateusseiboth
 */
public class FormCategoria extends javax.swing.JDialog {
    private int posicao = 0;
    private boolean editing = false;
    private CategoriaDAO dao;

    /**
     * Creates new form FormCategoria
     */
    public FormCategoria(java.awt.Frame parent, boolean modal, CategoriaDAO dao) {
        super(parent, modal);
        this.dao = dao;
        initComponents();
        Categoria categoria = dao.get(posicao);
        System.out.println("Categorias: " + dao.getAll());
        setTextFields(categoria);
    }

    private void setTextFields(Categoria categoria) {
        System.out.println("Categoria: " + categoria);
        if (categoria != null) {
            tfCodigo.setText("" + categoria.getCodigo());
            tfDescricao.setText(categoria.getDescricao());
        } else {
            tfCodigo.setText("0");
            tfDescricao.setText("");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("C??digo: ");

        tfCodigo.setEditable(false);

        jLabel2.setText("Tipo de declara????o: ");

        jLabel3.setText("Consulta/Cadastro de tipo de declara????o");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 591,
                                                        Short.MAX_VALUE)))
                                .addGap(70, 70, 70))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 129,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(tfDescricao,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 93, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))))));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAnterior.setText("<<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setText(">>");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnAnterior)
                                .addGap(18, 18, 18)
                                .addComponent(btnProximo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNovo)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnGravar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28,
                                        Short.MAX_VALUE)
                                .addComponent(btnCancelar)
                                .addGap(26, 26, 26)
                                .addComponent(btnExcluir)
                                .addGap(40, 40, 40)
                                .addComponent(btnSair)
                                .addGap(24, 24, 24)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(32, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAnterior)
                                        .addComponent(btnProximo)
                                        .addComponent(btnNovo)
                                        .addComponent(btnEditar)
                                        .addComponent(btnGravar)
                                        .addComponent(btnCancelar)
                                        .addComponent(btnExcluir)
                                        .addComponent(btnSair))
                                .addGap(30, 30, 30)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(24, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }// GEN-LAST:event_btnSairActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnProximoActionPerformed
        // TODO add your handling code here:
        posicao++;
        Categoria categoria = dao.get(posicao);
        if (categoria == null) {
            posicao--;
            categoria = dao.get(posicao);
        }
        setTextFields(categoria);
    }// GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        posicao--;
        Categoria categoria = dao.get(posicao);
        if (categoria == null) {
            posicao++;
            categoria = dao.get(posicao);
        }
        setTextFields(categoria);
    }// GEN-LAST:event_btnAnteriorActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        editing = true;
        setStatusBotoes();
        setTextFields(null);
        setFieldsStatus(true);
        tfDescricao.requestFocus();
    }// GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        editing = true;
        setStatusBotoes();
        setFieldsStatus(true);
        tfDescricao.requestFocus();
    }// GEN-LAST:event_btnEditarActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnGravarActionPerformed
        // TODO add your handling code here:
        editing = false;
        setStatusBotoes();
        String descricao = tfDescricao.getText();
        int codigo = Integer.parseInt(tfCodigo.getText());
        if (codigo == 0) {
            Categoria categoria = new Categoria(descricao);
            dao.add(categoria);
            posicao = dao.size() - 1;
            categoria = dao.get(posicao);
            setTextFields(categoria);
        } else {
            Categoria categoria = new Categoria(codigo, descricao);

            dao.update(categoria);
        }
        setFieldsStatus(false);
    }// GEN-LAST:event_btnGravarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        editing = false;
        Categoria categoria = dao.get(posicao);
        setTextFields(categoria);
        setStatusBotoes();
        setFieldsStatus(false);
    }// GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Deseja remover?", "Remover Categoria",
                JOptionPane.YES_NO_OPTION) == 0) {

            Categoria categoria = dao.get(posicao);
            if (categoria != null) {
                dao.delete(categoria);
                posicao = dao.size() - 1;
                categoria = dao.get(posicao);
                setTextFields(categoria);
            }
        }

    }// GEN-LAST:event_btnExcluirActionPerformed

    private void setFieldsStatus(boolean editable) {
        tfDescricao.setEditable(editable);
    }

    private void setStatusBotoes() {
        btnProximo.setEnabled(!editing);
        btnAnterior.setEnabled(!editing);
        btnNovo.setEnabled(!editing);
        btnEditar.setEnabled(!editing);
        btnExcluir.setEnabled(!editing);
        btnSair.setEnabled(!editing);

        btnGravar.setEnabled(editing);
        btnCancelar.setEnabled(editing);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDescricao;
    // End of variables declaration//GEN-END:variables
}
