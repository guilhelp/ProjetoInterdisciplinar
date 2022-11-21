/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package controle;

/**
 *
 * @author Guilherme
 */
public class Frm_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Menu
     */
    public Frm_Menu() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tlb_barradeferramentas = new javax.swing.JToolBar();
        btn_servicos = new javax.swing.JButton();
        btn_agendamentos = new javax.swing.JButton();
        btn_clientes = new javax.swing.JButton();
        btn_creditos = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        lbl_background = new javax.swing.JLabel();
        mnb_menubar = new javax.swing.JMenuBar();
        mnp_opcoes = new javax.swing.JMenu();
        mni_servicos = new javax.swing.JMenuItem();
        mni_agendamentos = new javax.swing.JMenuItem();
        mni_clientes = new javax.swing.JMenuItem();
        mnp_creditos = new javax.swing.JMenu();
        mni_guilherme = new javax.swing.JMenuItem();
        mnp_sair = new javax.swing.JMenu();
        mni_sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tlb_barradeferramentas.setRollover(true);

        btn_servicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/barba.png"))); // NOI18N
        btn_servicos.setFocusable(false);
        btn_servicos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_servicos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_servicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_servicosActionPerformed(evt);
            }
        });
        tlb_barradeferramentas.add(btn_servicos);

        btn_agendamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/calendario.png"))); // NOI18N
        btn_agendamentos.setFocusable(false);
        btn_agendamentos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_agendamentos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_agendamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agendamentosActionPerformed(evt);
            }
        });
        tlb_barradeferramentas.add(btn_agendamentos);

        btn_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/aperto-de-mao.png"))); // NOI18N
        btn_clientes.setFocusable(false);
        btn_clientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_clientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clientesActionPerformed(evt);
            }
        });
        tlb_barradeferramentas.add(btn_clientes);

        btn_creditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/programador.png"))); // NOI18N
        btn_creditos.setFocusable(false);
        btn_creditos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_creditos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_creditosActionPerformed(evt);
            }
        });
        tlb_barradeferramentas.add(btn_creditos);

        btn_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/sair.png"))); // NOI18N
        btn_sair.setFocusable(false);
        btn_sair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        tlb_barradeferramentas.add(btn_sair);

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/LOGOBARBEARIA01.png"))); // NOI18N
        lbl_background.setText("jLabel1");

        mnp_opcoes.setText("Opções");

        mni_servicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/barbapequena.png"))); // NOI18N
        mni_servicos.setText("Serviços");
        mni_servicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_servicosActionPerformed(evt);
            }
        });
        mnp_opcoes.add(mni_servicos);

        mni_agendamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/calendariopequeno.png"))); // NOI18N
        mni_agendamentos.setText("Agendamentos");
        mni_agendamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_agendamentosActionPerformed(evt);
            }
        });
        mnp_opcoes.add(mni_agendamentos);

        mni_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/clientepequeno.png"))); // NOI18N
        mni_clientes.setText("Clientes");
        mni_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_clientesActionPerformed(evt);
            }
        });
        mnp_opcoes.add(mni_clientes);

        mnb_menubar.add(mnp_opcoes);

        mnp_creditos.setText("Créditos");

        mni_guilherme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/programadorpequeno.png"))); // NOI18N
        mni_guilherme.setText("Guilherme Lima de Paula");
        mni_guilherme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_guilhermeActionPerformed(evt);
            }
        });
        mnp_creditos.add(mni_guilherme);

        mnb_menubar.add(mnp_creditos);

        mnp_sair.setText("Sair");

        mni_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/sairpequeno.png"))); // NOI18N
        mni_sair.setText("Sair");
        mni_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_sairActionPerformed(evt);
            }
        });
        mnp_sair.add(mni_sair);

        mnb_menubar.add(mnp_sair);

        setJMenuBar(mnb_menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tlb_barradeferramentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_background, javax.swing.GroupLayout.PREFERRED_SIZE, 2499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tlb_barradeferramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_background)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mni_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_clientesActionPerformed
        Frm_Clientes frm = new Frm_Clientes();
        frm.setVisible(true);
        lbl_background.add(frm);
    }//GEN-LAST:event_mni_clientesActionPerformed

    private void mni_servicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_servicosActionPerformed
        Frm_Servicos frm = new Frm_Servicos();
        frm.setVisible(true);
        lbl_background.add(frm);
    }//GEN-LAST:event_mni_servicosActionPerformed

    private void mni_agendamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_agendamentosActionPerformed
        Frm_Agendamento frm = new Frm_Agendamento();
        frm.setVisible(true);
        lbl_background.add(frm);
    }//GEN-LAST:event_mni_agendamentosActionPerformed

    private void btn_servicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_servicosActionPerformed
        Frm_Servicos frm = new Frm_Servicos();
        frm.setVisible(true);
        lbl_background.add(frm);
    }//GEN-LAST:event_btn_servicosActionPerformed

    private void btn_agendamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agendamentosActionPerformed
        Frm_Agendamento frm = new Frm_Agendamento();
        frm.setVisible(true);
        lbl_background.add(frm);
    }//GEN-LAST:event_btn_agendamentosActionPerformed

    private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientesActionPerformed
        Frm_Clientes frm = new Frm_Clientes();
        frm.setVisible(true);
        lbl_background.add(frm);
    }//GEN-LAST:event_btn_clientesActionPerformed

    private void mni_guilhermeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_guilhermeActionPerformed
        Frm_Creditos frm = new Frm_Creditos();
        frm.setVisible(true);
        lbl_background.add(frm);
    }//GEN-LAST:event_mni_guilhermeActionPerformed

    private void btn_creditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_creditosActionPerformed
        Frm_Creditos frm = new Frm_Creditos();
        frm.setVisible(true);
        lbl_background.add(frm);
    }//GEN-LAST:event_btn_creditosActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_sairActionPerformed

    private void mni_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mni_sairActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agendamentos;
    private javax.swing.JButton btn_clientes;
    private javax.swing.JButton btn_creditos;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_servicos;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JMenuBar mnb_menubar;
    private javax.swing.JMenuItem mni_agendamentos;
    private javax.swing.JMenuItem mni_clientes;
    private javax.swing.JMenuItem mni_guilherme;
    private javax.swing.JMenuItem mni_sair;
    private javax.swing.JMenuItem mni_servicos;
    private javax.swing.JMenu mnp_creditos;
    private javax.swing.JMenu mnp_opcoes;
    private javax.swing.JMenu mnp_sair;
    private javax.swing.JToolBar tlb_barradeferramentas;
    // End of variables declaration//GEN-END:variables
}
