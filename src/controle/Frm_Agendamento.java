/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package controle;

import conexao.Conexao;
 
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.sql.*;
import javax.swing.table.DefaultTableModel;

public class Frm_Agendamento extends javax.swing.JInternalFrame {

    Conexao con_cliente;
    
    public Frm_Agendamento() {
        initComponents();
        con_cliente = new Conexao(); // inicialização do objeto como instância
        con_cliente.conecta(); // chama o método que conecta
        con_cliente.executaSQL("select * from agenda order by Cod_Agendam");
        preencherTabela();
        posicionarRegistro();
        tblAgendam.setAutoCreateRowSorter(true); // ativa a classificação ordenada da tabela
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_panel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        txtfunc = new javax.swing.JTextField();
        lbl_func = new javax.swing.JLabel();
        lbl_codigoagendamento = new javax.swing.JLabel();
        lbl_dtaagendam = new javax.swing.JLabel();
        txtdtaagendam = new javax.swing.JTextField();
        txtcodcli = new javax.swing.JTextField();
        lbl_codcli = new javax.swing.JLabel();
        lbl_horaagendam = new javax.swing.JLabel();
        txthoraagendam = new javax.swing.JTextField();
        btn_registro = new javax.swing.JButton();
        btn_gravar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        scp_tabela = new javax.swing.JScrollPane();
        tblAgendam = new javax.swing.JTable();
        btn_primeiro = new javax.swing.JButton();
        btn_anterior = new javax.swing.JButton();
        btn_proximo = new javax.swing.JButton();
        btn_ultimo = new javax.swing.JButton();
        lbl_codusuario = new javax.swing.JLabel();
        txtcodusuario = new javax.swing.JTextField();
        lbl_pesquisar = new javax.swing.JLabel();
        txtpesquisar = new javax.swing.JTextField();
        txtcodagendam = new javax.swing.JLabel();
        lbl_imagem = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 204));
        getContentPane().setLayout(null);

        lbl_titulo.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        lbl_titulo.setText("CADASTRO AGENDAMENTO");

        lbl_func.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_func.setText("Código Funcionário:");

        lbl_codigoagendamento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_codigoagendamento.setText("Código Agendamento:");

        lbl_dtaagendam.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_dtaagendam.setText("Data Agendamento: ");

        lbl_codcli.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_codcli.setText("Código Cliente:");

        lbl_horaagendam.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_horaagendam.setText("Hora Agendamento:");

        btn_registro.setBackground(new java.awt.Color(153, 204, 255));
        btn_registro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_registro.setText("Novo Registro");
        btn_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registroActionPerformed(evt);
            }
        });

        btn_gravar.setBackground(new java.awt.Color(153, 204, 255));
        btn_gravar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_gravar.setText("Gravar");
        btn_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarActionPerformed(evt);
            }
        });

        btn_alterar.setBackground(new java.awt.Color(153, 204, 255));
        btn_alterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_excluir.setBackground(new java.awt.Color(153, 204, 255));
        btn_excluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_sair.setBackground(new java.awt.Color(153, 204, 255));
        btn_sair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        tblAgendam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblAgendam.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblAgendam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código Agenda ", "Código Func", "Data Agendamento", "Cod_Cli", "Hora Agendamento", "Código Usuário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAgendam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAgendamMouseClicked(evt);
            }
        });
        tblAgendam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblAgendamKeyPressed(evt);
            }
        });
        scp_tabela.setViewportView(tblAgendam);

        btn_primeiro.setBackground(new java.awt.Color(153, 204, 255));
        btn_primeiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_primeiro.setText("Primeiro");
        btn_primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primeiroActionPerformed(evt);
            }
        });

        btn_anterior.setBackground(new java.awt.Color(153, 204, 255));
        btn_anterior.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_anterior.setText("Anterior");
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });

        btn_proximo.setBackground(new java.awt.Color(153, 204, 255));
        btn_proximo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_proximo.setText("Próximo");
        btn_proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proximoActionPerformed(evt);
            }
        });

        btn_ultimo.setBackground(new java.awt.Color(153, 204, 255));
        btn_ultimo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_ultimo.setText("Último");
        btn_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ultimoActionPerformed(evt);
            }
        });

        lbl_codusuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_codusuario.setText("Código Usuário:");

        lbl_pesquisar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_pesquisar.setText("Pesquisar por data:");

        txtpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesquisarActionPerformed(evt);
            }
        });
        txtpesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpesquisarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnl_panel1Layout = new javax.swing.GroupLayout(pnl_panel1);
        pnl_panel1.setLayout(pnl_panel1Layout);
        pnl_panel1Layout.setHorizontalGroup(
            pnl_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_panel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(pnl_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_panel1Layout.createSequentialGroup()
                        .addComponent(lbl_func)
                        .addGap(53, 53, 53)
                        .addComponent(txtfunc, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_panel1Layout.createSequentialGroup()
                        .addComponent(lbl_codcli)
                        .addGap(86, 86, 86)
                        .addComponent(txtcodcli, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_panel1Layout.createSequentialGroup()
                        .addGroup(pnl_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_dtaagendam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_codigoagendamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_horaagendam, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_codusuario, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(pnl_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_panel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txtdtaagendam, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_panel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(txthoraagendam, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_panel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(txtcodusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_panel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txtcodagendam, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_panel1Layout.createSequentialGroup()
                        .addComponent(lbl_titulo)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_panel1Layout.createSequentialGroup()
                        .addGroup(pnl_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_panel1Layout.createSequentialGroup()
                                .addComponent(btn_primeiro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_anterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_proximo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_ultimo)
                                .addGap(18, 18, 18)
                                .addComponent(btn_registro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_gravar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_alterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_excluir))
                            .addGroup(pnl_panel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(pnl_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_panel1Layout.createSequentialGroup()
                                        .addComponent(lbl_pesquisar)
                                        .addGap(39, 39, 39)
                                        .addComponent(txtpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_panel1Layout.createSequentialGroup()
                                        .addComponent(scp_tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(12, 12, 12))))
        );
        pnl_panel1Layout.setVerticalGroup(
            pnl_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo)
                .addGroup(pnl_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_panel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lbl_codigoagendamento)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodagendam, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGroup(pnl_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_func)
                    .addComponent(txtfunc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dtaagendam, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdtaagendam, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codcli)
                    .addComponent(txtcodcli, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnl_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_horaagendam)
                    .addComponent(txthoraagendam, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(pnl_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codusuario)
                    .addComponent(txtcodusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(pnl_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_panel1Layout.createSequentialGroup()
                        .addGroup(pnl_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_registro)
                            .addComponent(btn_gravar)
                            .addComponent(btn_alterar)
                            .addComponent(btn_excluir)
                            .addComponent(btn_primeiro)
                            .addComponent(btn_anterior)
                            .addComponent(btn_proximo)
                            .addComponent(btn_ultimo))
                        .addGap(18, 18, 18)
                        .addComponent(scp_tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_sair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pesquisar)
                    .addComponent(txtpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        getContentPane().add(pnl_panel1);
        pnl_panel1.setBounds(50, 40, 810, 730);

        lbl_imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/backgroundlogin.png"))); // NOI18N
        lbl_imagem.setText("jLabel1");
        getContentPane().add(lbl_imagem);
        lbl_imagem.setBounds(-10, 0, 1481, 810);

        setBounds(500, 50, 931, 839);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarActionPerformed
        String cod_func = txtfunc.getText();
        String data_agendam = txtdtaagendam.getText();
        String cod_cli = txtcodcli.getText();
        String hora_agendam = txthoraagendam.getText();
        String cod_usuario = txtcodusuario.getText();

        try {
            String insert_sql="insert into agenda (Cod_Func, Dta_Agendam, Cod_Cli, Hora_Agendam, Cod_Usuario) values ('" + cod_func + "','" + data_agendam + "','" + cod_cli + "','" + hora_agendam + "','" + cod_usuario + "')";
            con_cliente.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

            con_cliente.executaSQL("select * from agenda order by Cod_Agendam");
            preencherTabela();

        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Erro na gravação : \n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_gravarActionPerformed

    private void btn_proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proximoActionPerformed
        try {
            con_cliente.resultset.next();
            mostrar_Dados();
        }catch(SQLException erro){

        }
    }//GEN-LAST:event_btn_proximoActionPerformed

    private void btn_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registroActionPerformed
        txtcodagendam.setText(""); // Limpa a caixa de texto em questão
        txtfunc.setText("");
        txtdtaagendam.setText("");
        txtcodcli.setText("");
        txthoraagendam.setText("");
        txtcodusuario.setText("");
        txtcodagendam.requestFocus(); // posiciona o cursor neste campo para digitação
    }//GEN-LAST:event_btn_registroActionPerformed

    private void tblAgendamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAgendamKeyPressed
        // evento que sincroniza a grid com a setas do teclado
        int linha_selecionada = tblAgendam.getSelectedRow();
        txtcodagendam.setText(tblAgendam.getValueAt(linha_selecionada, 0).toString());
        txtfunc.setText(tblAgendam.getValueAt(linha_selecionada, 1).toString());
        txtdtaagendam.setText(tblAgendam.getValueAt(linha_selecionada, 2).toString());
        txtcodcli.setText(tblAgendam.getValueAt(linha_selecionada, 3).toString());
        txthoraagendam.setText(tblAgendam.getValueAt(linha_selecionada, 4).toString());
        txtcodusuario.setText(tblAgendam.getValueAt(linha_selecionada, 5).toString());
    }//GEN-LAST:event_tblAgendamKeyPressed

    private void tblAgendamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAgendamMouseClicked
        // evento que sincroniza a grid com o mouse
        int linha_selecionada = tblAgendam.getSelectedRow();
        txtcodagendam.setText(tblAgendam.getValueAt(linha_selecionada, 0).toString());
        txtfunc.setText(tblAgendam.getValueAt(linha_selecionada, 1).toString());
        txtdtaagendam.setText(tblAgendam.getValueAt(linha_selecionada, 2).toString());
        txtcodcli.setText(tblAgendam.getValueAt(linha_selecionada, 3).toString());
        txthoraagendam.setText(tblAgendam.getValueAt(linha_selecionada, 4).toString());
        txtcodusuario.setText(tblAgendam.getValueAt(linha_selecionada, 5).toString());
    }//GEN-LAST:event_tblAgendamMouseClicked

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primeiroActionPerformed
        try {
            con_cliente.resultset.first();
            mostrar_Dados();
        }catch(SQLException erro){

        }
    }//GEN-LAST:event_btn_primeiroActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        String sql="";
        try {
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro: ","Confirmar Exclusão",JOptionPane.YES_NO_OPTION,3);
            if(resposta == 0){
                sql="delete from agenda where Cod_Agendam = " + txtcodagendam.getText();
                int excluir = con_cliente.statement.executeUpdate(sql);
                if(excluir ==1){
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                    con_cliente.executaSQL("select * from agenda order by Cod_Agendam");
                    con_cliente.resultset.first();
                    preencherTabela();
                    posicionarRegistro();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário!!","Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão: " + excecao,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ultimoActionPerformed
        try {
            con_cliente.resultset.last();
            mostrar_Dados();
        }catch(SQLException erro){

        }
    }//GEN-LAST:event_btn_ultimoActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        String cod_func = txtfunc.getText();
        String data_agendam = txtdtaagendam.getText();
        String cod_cli = txtcodcli.getText();
        String hora_agendam = txthoraagendam.getText();
        String cod_usuario = txtcodusuario.getText();
        String sql;
        String msg="";

        try {
            if(txtcodagendam.getText().equals("")){
                sql="insert into agenda (Cod_Func, Dta_Agendam, Cod_Cli, Hora_Agendam, Cod_Usuario) values ('" + cod_func + "','" + data_agendam + "','" + cod_cli + "','" + hora_agendam + "','" + cod_usuario + "')";
                msg="Gravação de um novo registro";
            }else{
                sql="update agenda set Cod_Func='" + cod_func + "',Dta_Agendam='"+ data_agendam + "', Cod_Cli= '" + cod_cli + "', Hora_Agendam = '" + hora_agendam + "', Cod_Usuario = '" + cod_usuario + "' where Cod_Agendam = " + txtcodagendam.getText();
                msg="Alteração de registro";

            }
            con_cliente.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Gravação realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            con_cliente.executaSQL("select * from agenda order by Cod_Agendam");
            preencherTabela();

        } catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Erro na gravação : \n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void txtpesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisarKeyReleased
        try{
            String pesquisa = "select * from agenda where Dta_Agendam like '" + txtpesquisar.getText()+ "%'";
            con_cliente.executaSQL(pesquisa);

            if(con_cliente.resultset.first()){
                preencherTabela();
            }
            else{
                JOptionPane.showMessageDialog(null, "\n Não existe dados com este paramêtro!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Os dados digitados não foram localizados!! :\n"+errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtpesquisarKeyReleased

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
        try {
            con_cliente.resultset.previous();
            mostrar_Dados();
        }catch(SQLException erro){

        }
    }//GEN-LAST:event_btn_anteriorActionPerformed

    private void txtpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpesquisarActionPerformed
public void preencherTabela(){
    tblAgendam.getColumnModel().getColumn(0).setPreferredWidth(4);
    tblAgendam.getColumnModel().getColumn(1).setPreferredWidth(4);
    tblAgendam.getColumnModel().getColumn(2).setPreferredWidth(15);
    tblAgendam.getColumnModel().getColumn(3).setPreferredWidth(4);
    tblAgendam.getColumnModel().getColumn(4).setPreferredWidth(15);
    tblAgendam.getColumnModel().getColumn(4).setPreferredWidth(4);
    
    DefaultTableModel modelo = (DefaultTableModel) tblAgendam.getModel();
    modelo.setNumRows(0);
    
    try{
        con_cliente.resultset.beforeFirst();
        while(con_cliente.resultset.next())
            modelo.addRow(new Object[] {
                con_cliente.resultset.getString("Cod_Agendam"),con_cliente.resultset.getString("Cod_Func"), con_cliente.resultset.getString("Dta_Agendam"),con_cliente.resultset.getString("Cod_Cli"), con_cliente.resultset.getString("Hora_Agendam"),con_cliente.resultset.getString("Cod_Usuario")
            });
            }
        catch(SQLException erro){
                JOptionPane.showMessageDialog(null, "\n Eerro ao listar dados da tabela!! :\n" + erro, "Mesangem do Programa ", JOptionPane.INFORMATION_MESSAGE);
        }
        }
    


public void posicionarRegistro(){
    try {
        con_cliente.resultset.first(); // posiciona no 1º registro da tabela
        mostrar_Dados(); // chama o método que irá buscar o dado da tabela
    }catch(SQLException erro){
        JOptionPane.showMessageDialog(null,"Não foi possível posicionar no primeiro registro: " +erro, "Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
    }
}

public void mostrar_Dados(){
    try{
        txtcodagendam.setText(con_cliente.resultset.getString("Cod_Agendam"));
        txtfunc.setText(con_cliente.resultset.getString("Cod_Func")); 
        txtdtaagendam.setText(con_cliente.resultset.getString("Dta_Agendam")); 
        txtcodcli.setText(con_cliente.resultset.getString("Cod_Cli")); 
        txthoraagendam.setText(con_cliente.resultset.getString("Hora_Agendam")); 
        txtcodusuario.setText(con_cliente.resultset.getString("Cod_Usuario")); 
    
    }catch(SQLException erro){
        JOptionPane.showMessageDialog(null, "Não localizou dados: " + erro, "Mensagem do Programa ", JOptionPane.INFORMATION_MESSAGE);
    }
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_anterior;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_gravar;
    private javax.swing.JButton btn_primeiro;
    private javax.swing.JButton btn_proximo;
    private javax.swing.JButton btn_registro;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_ultimo;
    private javax.swing.JLabel lbl_codcli;
    private javax.swing.JLabel lbl_codigoagendamento;
    private javax.swing.JLabel lbl_codusuario;
    private javax.swing.JLabel lbl_dtaagendam;
    private javax.swing.JLabel lbl_func;
    private javax.swing.JLabel lbl_horaagendam;
    private javax.swing.JLabel lbl_imagem;
    private javax.swing.JLabel lbl_pesquisar;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_panel1;
    private javax.swing.JScrollPane scp_tabela;
    private javax.swing.JTable tblAgendam;
    private javax.swing.JLabel txtcodagendam;
    private javax.swing.JTextField txtcodcli;
    private javax.swing.JTextField txtcodusuario;
    private javax.swing.JTextField txtdtaagendam;
    private javax.swing.JTextField txtfunc;
    private javax.swing.JTextField txthoraagendam;
    private javax.swing.JTextField txtpesquisar;
    // End of variables declaration//GEN-END:variables
}
