package View;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
    }

    public void adicionar(String valor) {
        String texto = txtResultado2.getText();
        if (texto == "0") {
            txtResultado2.setText(valor);
        } else {
            //String txt = txtResultado2.getText() + valor;
            txtResultado2.setText(txtResultado2.getText().concat(valor));
        }
    }
    
    public double resultado(){
        if(txtOp.getText() != ""){
            String op = txtOp.getText();
            v1 = Double.parseDouble(txtResultado1.getText());
            v2 = Double.parseDouble(txtResultado2.getText());
            if(op.equals("+")){
                result = v1 + v2;
                txtResultado1.setText(v1 + " + " + v2 + " = ");
                txtResultado2.setText(String.valueOf(result));
            }
            if(op.equals("-")){            
                result = v1 - v2;
                txtResultado1.setText(v1 + " - " + v2 + " = ");
                txtResultado2.setText(String.valueOf(result));
            }
            if(op.equals("X")){      
                result = v1 * v2;
                txtResultado1.setText(v1 + " X " + v2 + " = ");
                txtResultado2.setText(String.valueOf(result));
            }
            if(op.equals("/")){
                if(v1 == 0 && v2 == 0){
                    txtResultado2.setText("0");
                    txtResultado1.setText("0");
                    txtOp.setText("");
                    JOptionPane.showMessageDialog(null, "Informe outro valor.");
                }else{
                    result = v1 / v2;
                    txtResultado1.setText(v1 + " / " + v2 + " = ");
                    txtResultado2.setText(String.valueOf(result));
                }
            }
        }
        txtOp.setText("");
        return result;
    }
    
    public void porcentagem(){
        String op = txtOp.getText();
        v1 = Double.parseDouble(txtResultado1.getText());
        v2 = Double.parseDouble(txtResultado2.getText());
        if(op.equals("X")){
            result = v1 * (v2/100);
            txtResultado1.setText(v1 + " X " + v2 + " = ");
            txtResultado2.setText(String.valueOf(result));
        }
        if(op.equals("-")){
            result = v1 - (v1 * (v2/100));
            txtResultado1.setText(v1 + " - " + v2 + " = ");
            txtResultado2.setText(String.valueOf(result));
        }
    }
    
    Double v1 = 0.00;
    Double v2 = 0.00;
    Double result = 0.00;    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtResultado2 = new javax.swing.JLabel();
        txtResultado1 = new javax.swing.JLabel();
        txtOp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnPorcentagem = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        btnSubtrair = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        btnSoma = new javax.swing.JButton();
        btnSinal = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtResultado2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtResultado2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtResultado2.setText("0");
        txtResultado2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        txtResultado1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtResultado1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtResultado1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        txtOp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtOp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtOp.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("PedroTosta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtResultado1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtResultado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResultado2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridLayout(5, 4));

        btnPorcentagem.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnPorcentagem.setText("%");
        btnPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentagemActionPerformed(evt);
            }
        });
        jPanel2.add(btnPorcentagem);

        jButton2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton2.setText("C");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        btnApagar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backspace.png"))); // NOI18N
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });
        jPanel2.add(btnApagar);

        btnDivisao.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnDivisao.setText("/");
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });
        jPanel2.add(btnDivisao);

        jButton15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton15.setText("7");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15);

        jButton16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton16.setText("8");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16);

        jButton20.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton20.setText("9");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton20);

        btnMultiplicacao.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnMultiplicacao.setText("X");
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });
        jPanel2.add(btnMultiplicacao);

        jButton4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton10.setText("5");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10);

        jButton14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton14.setText("6");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14);

        btnSubtrair.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btnSubtrair.setText("-");
        btnSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtrairActionPerformed(evt);
            }
        });
        jPanel2.add(btnSubtrair);

        jButton13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton13.setText("1");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13);

        jButton5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton5.setText("2");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton17.setText("3");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17);

        btnSoma.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnSoma.setText("+");
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSoma);

        btnSinal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnSinal.setText("+/-");
        btnSinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinalActionPerformed(evt);
            }
        });
        jPanel2.add(btnSinal);

        jButton12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton12.setText("0");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12);

        jButton18.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jButton18.setText(".");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18);

        btnIgual.setBackground(new java.awt.Color(0, 255, 0));
        btnIgual.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        jPanel2.add(btnIgual);

        jMenuBar1.setBorder(null);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu-bar.png"))); // NOI18N

        jMenuItem1.setText("Alterar cor do igual");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        String texto = txtResultado2.getText();
        if(texto.length() > 1){
            txtResultado2.setText(texto.substring(0, texto.length() - 1));
        }else{
            txtResultado2.setText("0");
        }
    }//GEN-LAST:event_btnApagarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtOp.setText("");
        txtResultado1.setText("");
        txtResultado2.setText("0");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        adicionar("7");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        adicionar("8");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        adicionar("9");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        adicionar("4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        adicionar("5");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        adicionar("6");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        adicionar("1");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        adicionar("2");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        adicionar("3");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        adicionar("0");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
       if(txtResultado1.getText() != ""){
            result = resultado();
            txtResultado1.setText(String.valueOf(result));
            txtOp.setText("/");
        }
        txtOp.setText("/");
        txtResultado1.setText(txtResultado2.getText());
        txtResultado2.setText("0");
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
       if(txtResultado1.getText() != ""){
            result = resultado();
            txtResultado1.setText(String.valueOf(result));
            txtOp.setText("+");
        }
        txtOp.setText("+");
        txtResultado1.setText(txtResultado2.getText());
        txtResultado2.setText("0");
    }//GEN-LAST:event_btnSomaActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        resultado();
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtrairActionPerformed
        if(txtResultado1.getText() != ""){
            result = resultado();
            txtResultado1.setText(String.valueOf(result));
            txtOp.setText("-");
        }
        txtOp.setText("-");
        txtResultado1.setText(txtResultado2.getText());
        txtResultado2.setText("0");
    }//GEN-LAST:event_btnSubtrairActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        if(txtResultado1.getText() != ""){
            result = resultado();
            txtResultado1.setText(String.valueOf(result));
            txtOp.setText("X");
        }
        txtOp.setText("X");
        txtResultado1.setText(txtResultado2.getText());
        txtResultado2.setText("0");
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btnPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentagemActionPerformed
        porcentagem();
    }//GEN-LAST:event_btnPorcentagemActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        String texto = txtResultado2.getText();
        String txt = txtResultado2.getText() + ".";
        txtResultado2.setText(txt);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void btnSinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinalActionPerformed
        v2 = Double.parseDouble(txtResultado2.getText());
        if(v2 > 0){
            String txt = "-" + txtResultado2.getText();
            txtResultado2.setText(txt);
        }else if(v2 < 0){
            txtResultado2.setText(txtResultado2.getText().substring(1, txtResultado2.getText().length()));            
        }
    }//GEN-LAST:event_btnSinalActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Color CorPadrao = (new java.awt.Color(0,255,0));
        Color cor = JColorChooser.showDialog(this, "Escolha uma cor para o botão igual", CorPadrao);
        btnIgual.setBackground(cor);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnPorcentagem;
    private javax.swing.JButton btnSinal;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnSubtrair;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOp;
    private javax.swing.JLabel txtResultado1;
    private javax.swing.JLabel txtResultado2;
    // End of variables declaration//GEN-END:variables

}
