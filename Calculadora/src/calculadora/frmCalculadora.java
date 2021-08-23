/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.lang.Math;


/**
 *
 * @author gusta
 */
public class frmCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form frmCalculadora
     */
    public frmCalculadora() {
        initComponents();
        TxtRes.setText(String.valueOf("0.0"));
        TxtValorAcumulado.setText(String.valueOf("0.0"));
        
    }
    boolean raizEXP = false;
    boolean statusIgual = false;
    boolean statusButton = false;
    boolean operacao_solicitada = false;
    boolean operacao_igualdade = false;
    boolean apertou = false;
    Double valor1 = 0.0;
    Double valor2 = 0.0;
    Double valor3 = 0.0;
    String operacao = "nada";
    String operacao2 = "nada";
    String operacao3 = "nada";
    
    private boolean opSolicitada (boolean op){
        if(op == false){
            op = true;
        }
        return op;
    }
    
    private void VerificaIgual(){
        if(statusIgual){
            TxtRes.setText("");
            TxtValorAcumulado.setText("");           
            statusIgual = false;
        }
    }
    
    private void AtivaDesativa (boolean op){
        jButton8.setEnabled(op);
        jButton9.setEnabled(op);
        jButton11.setEnabled(op);
        jButton12.setEnabled(op);
        jButton17.setEnabled(op);
        jButton15.setEnabled(op);
        jButton18.setEnabled(op);
        jButton16.setEnabled(op);
        jButton20.setEnabled(op);
        jButton28.setEnabled(op);
        jButton29.setEnabled(op);
        jButton19.setEnabled(op);
        jButton14.setEnabled(op);
        jButton13.setEnabled(op);
        jButton6.setEnabled(op);
        jButton2.setEnabled(op);
        jButton1.setEnabled(op);
        jButton5.setEnabled(op);
        jButton30.setEnabled(op);               
    }
    
    
    public void opPendente (){       
        if(operacao != "nada"){
            if(operacao == "soma"){
                valor1 = valor1 + valor2;
                TxtValorAcumulado.setText(String.valueOf(valor1));              
            }
            if(operacao == "subtra"){
                if(operacao2 != "iniciou"){
                valor1 = valor1 - valor2;
                TxtValorAcumulado.setText(String.valueOf(valor1));
                }else{
                    valor1 = valor2 - valor1;
                    TxtValorAcumulado.setText(String.valueOf(valor1));
                }
            }
            if(operacao == "mul"){
                valor1 = valor1 * valor2;
                TxtValorAcumulado.setText(String.valueOf(valor1));  
            }
            if(operacao == "div"){ 
                if(valor2 == 0){ 
                    TxtRes.setText("ERRO! Impossivel dividir por zero!");
                    TxtValorAcumulado.setText("ERRO!");
                    AtivaDesativa(false);                   
                    return;
                }
                if(operacao2 != "iniciou"){
                    valor1 = valor1 / valor2;
                    TxtValorAcumulado.setText(String.valueOf(valor1)); 
                }else{
                    valor1 = valor2 / valor1;
                    TxtValorAcumulado.setText(String.valueOf(valor1));
                }
                 
            }
            if(operacao == "exp"){
                valor2 = Math.pow(valor2, 2);
                TxtRes.setText(String.valueOf(valor2));
                TxtValorAcumulado.setText(String.valueOf(valor2));
            }
            if(operacao == "raiz"){
                if(valor2<0){
                    	TxtRes.setText("ERRO! Raiz de Numero negativo!");
                    	TxtValorAcumulado.setText("ERRO!");
                    	AtivaDesativa(false);
                   	 return;
                	}
                valor2 = Math.sqrt(valor2);
                TxtRes.setText(String.valueOf(valor2));
                TxtValorAcumulado.setText(String.valueOf(valor2)); 
            }
            operacao_igualdade = false;
        }
        
    }
    
    public void opIgualdade (){
        apertou = false;
        if(operacao != "nada"){
            if(operacao == "soma"){
                valor1 = valor1 + valor2;
                TxtRes.setText(String.valueOf(valor1));              
            }
            if(operacao == "subtra"){
                valor1 = valor1 - valor2;
                TxtRes.setText(String.valueOf(valor1));  
            }
            if(operacao == "mul"){
                valor1 = valor1 * valor2;
                TxtRes.setText(String.valueOf(valor1));  
            }
            if(operacao == "div"){
                if(valor2 == 0){
                    TxtRes.setText("ERRO! Impossivel dividir por zero!");
                    TxtValorAcumulado.setText("ERRO!");
                    AtivaDesativa(false);
                    return;
                }                 
                valor1 = valor1 / valor2;
                TxtRes.setText(String.valueOf(valor1));  
            }
            if(operacao == "exp"){
                operacao = operacao2;
                opPendente();
                //valor2 = Math.pow(valor2, 2);
                TxtRes.setText(String.valueOf(valor1));
            }
            if(operacao == "raiz"){
                if(valor2<0){
                    TxtRes.setText("ERRO! Raiz de Numero negativo!");
                    TxtValorAcumulado.setText("ERRO!");
                    AtivaDesativa(false);
                    return;
                }
                operacao = operacao2;
                opPendente();               
                //valor1 = Math.sqrt(valor1);
                TxtRes.setText(String.valueOf(valor1));
            }           
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxtRes = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtValorAcumulado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jButton4.setText("jButton2");

        jButton3.setText("-");

        jButton7.setText("X");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(410, 465));

        TxtRes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtResActionPerformed(evt);
            }
        });

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("/");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("X");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setText("√x");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("exp");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("C");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("9");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("8");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("7");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("4");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("5");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("2");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("6");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("3");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("1");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("+/-");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton28.setText("0");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setText(".");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setText("=");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Calculadora");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        TxtValorAcumulado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtValorAcumulado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtValorAcumuladoActionPerformed(evt);
            }
        });

        jLabel4.setText("Resultado operacao:");

        jLabel5.setText("Valor acumulado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtRes, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addComponent(TxtValorAcumulado)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtValorAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jLabel3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtResActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        TxtRes.setText(TxtRes.getText()+"0");
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        VerificaIgual();
        statusButton = false;
        if(operacao == "nada"){
        operacao = "iniciou";
        TxtRes.setText("");            
        }
        TxtRes.setText(TxtRes.getText()+"1");
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        VerificaIgual();
        statusButton = false;
        if(operacao == "nada"){
        operacao = "iniciou";
        TxtRes.setText("");            
        }
        TxtRes.setText(TxtRes.getText()+"2");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        VerificaIgual();
        statusButton = false;
        if(operacao == "nada"){
        operacao = "iniciou";
        TxtRes.setText("");            
        }
        TxtRes.setText(TxtRes.getText()+"3");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        VerificaIgual();
        statusButton = false;
        if(operacao == "nada"){
        operacao = "iniciou";
        TxtRes.setText("");            
        }
        TxtRes.setText(TxtRes.getText()+"4");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        VerificaIgual();
        statusButton = false;
        if(operacao == "nada"){
        operacao = "iniciou";
        TxtRes.setText("");            
        }
        TxtRes.setText(TxtRes.getText()+"5");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        VerificaIgual();
        statusButton = false;
        if(operacao == "nada"){
        operacao = "iniciou";
        TxtRes.setText("");            
        }
        TxtRes.setText(TxtRes.getText()+"6");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        VerificaIgual();
        statusButton = false;
        if(operacao == "nada"){
        operacao = "iniciou";
        TxtRes.setText("");            
        }
        TxtRes.setText(TxtRes.getText()+"7");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        VerificaIgual();
        statusButton = false;
        if(operacao == "nada"){
        operacao = "iniciou";
        TxtRes.setText("");            
        }
        TxtRes.setText(TxtRes.getText()+"8");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        VerificaIgual();
        statusButton = false;
        if(operacao == "nada"){
        operacao = "iniciou";
        TxtRes.setText("");            
        }
        TxtRes.setText(TxtRes.getText()+"9");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        VerificaIgual();
        statusButton = false;
        if(operacao == "nada"){
        operacao = "iniciou";
        TxtRes.setText("");            
        }
        TxtRes.setText(TxtRes.getText()+".");
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here: 
        TxtRes.setText("0.0");
        TxtValorAcumulado.setText(String.valueOf("0.0"));
        operacao_solicitada = false;
        operacao_igualdade = false;
        operacao = "nada";
        operacao2 = "nada";
        operacao3 = "nada";
        valor1 = 0.0;
        valor2 = 0.0;
        apertou = false;
        raizEXP = false;
        AtivaDesativa(true);     
        statusIgual = false;
        statusButton = false;
      
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        operacao3 = "soma";
        if(statusButton && raizEXP){
            if(operacao2 != "iniciou"){
                operacao = operacao2;
            }else{
                operacao = operacao3;
            }
            valor2 = Double.parseDouble(TxtRes.getText());
            TxtRes.setText("");
            opPendente();
            operacao = "soma"; 
        }
        if(statusButton){
          operacao = "soma";  
        }else{
            if(operacao_solicitada){
                valor2 = Double.parseDouble(TxtRes.getText());
                TxtRes.setText("");
                opPendente();
                operacao = "soma";       
            }else{               
                valor1 = Double.parseDouble(TxtRes.getText());
                TxtRes.setText("");
                operacao = "soma";
            }
        }
        raizEXP = false;
        statusButton = true;
        operacao_igualdade = false;
        operacao_solicitada = opSolicitada(operacao_solicitada);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        statusButton = false;        
        statusIgual = true;
        if(!operacao_igualdade){
            if(operacao != "raiz" | operacao != "exp"){
                valor2 = Double.parseDouble(TxtRes.getText());
            }
            opIgualdade();
        }else{
            opIgualdade();
        }
        TxtValorAcumulado.setText(String.valueOf("0.0"));          
        operacao_igualdade = true;
        operacao_solicitada = false;
        
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        operacao3 = "subtra";
        if(statusButton && raizEXP){
            if(operacao2 != "iniciou"){
                operacao = operacao2;
            }else{
                operacao = operacao3;
            }
            valor2 = Double.parseDouble(TxtRes.getText());
            TxtRes.setText("");
            opPendente();
            operacao = "subtra"; 
        }
        if(statusButton){
          operacao = "subtra";  
        }else{
            if(operacao_solicitada){
            valor2 = Double.parseDouble(TxtRes.getText()); 
            TxtRes.setText("");
            opPendente();
            operacao = "subtra";
            }else{
                valor1 = Double.parseDouble(TxtRes.getText());
                TxtRes.setText("");
                operacao = "subtra";
            }
        }
        raizEXP = false;
        statusButton = true;
        operacao_igualdade = false;
        operacao_solicitada = opSolicitada(operacao_solicitada);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        operacao3 = "mul";
        if(statusButton && raizEXP){
            if(operacao2 != "iniciou"){
                operacao = operacao2;
            }else{
                valor1 = 1.0;
                operacao = operacao3;
            }
            valor2 = Double.parseDouble(TxtRes.getText());
            TxtRes.setText("");
            opPendente();
            operacao = "mul"; 
        }       
        if(statusButton){
          operacao = "mul";  
        }else{
            if(operacao_solicitada){
            valor2 = Double.parseDouble(TxtRes.getText());
            TxtRes.setText("");
            opPendente();
            operacao = "mul";
            }else{
                valor1 = Double.parseDouble(TxtRes.getText());
                TxtRes.setText("");
                operacao = "mul";               
            }
        }
        raizEXP = false;
        statusButton = true;
        operacao_igualdade = false;
        operacao_solicitada = opSolicitada(operacao_solicitada);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        operacao3 = "div";
        if(statusButton && raizEXP){
            if(operacao2 != "iniciou"){                
                operacao = operacao2;
            }else{                
                valor1 = 1.0;
                operacao = operacao3;
            }
            valor2 = Double.parseDouble(TxtRes.getText());
            TxtRes.setText("");
            opPendente();
            operacao = "div"; 
        }
        if(statusButton){
          operacao = "div";  
        }else{
            if(operacao_solicitada){
            valor2 = Double.parseDouble(TxtRes.getText());
            TxtRes.setText("");
            opPendente();
            operacao = "div";
            }else{
            valor1 = Double.parseDouble(TxtRes.getText());
            TxtRes.setText("");
            operacao = "div";
            }
        }
        raizEXP = false;
        statusButton = true;
        operacao_igualdade = false;
        operacao_solicitada = opSolicitada(operacao_solicitada);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
            raizEXP = true;           
            //statusButton = true;
            if(operacao_solicitada){
                valor2 = Double.parseDouble(TxtRes.getText());
                TxtRes.setText("");
                if(!apertou){
                    apertou = true;
                    operacao2 = operacao;
                }
                operacao = "raiz";
                opPendente();
            }else{
                valor2 = Double.parseDouble(TxtRes.getText());
                TxtRes.setText("");
                operacao2 = operacao;            
                operacao = "raiz";
                opPendente();
            }       
        statusButton = true;
        operacao_igualdade = false;
        operacao_solicitada = opSolicitada(operacao_solicitada);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
            raizEXP = true;           
            //statusButton = true;
            if(operacao_solicitada){
                valor2 = Double.parseDouble(TxtRes.getText());
                TxtRes.setText("");
                if(!apertou){
                    apertou = true;
                    operacao2 = operacao;
                }
                operacao = "exp";
                opPendente();
            }else{
                valor2 = Double.parseDouble(TxtRes.getText());
                TxtRes.setText("");                                              
                operacao2 = operacao;            
                operacao = "exp";
                opPendente();
            }
        statusButton = true;
        operacao_igualdade = false;
        operacao_solicitada = opSolicitada(operacao_solicitada);              
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
       // if(statusButton){
       //   return;  
      //  }
        if(operacao_solicitada){
        valor2 = Double.parseDouble(TxtRes.getText());
        valor2 = valor2*(-1);
        TxtRes.setText(String.valueOf(valor2));       
        }else{
        valor1 = Double.parseDouble(TxtRes.getText());
        valor1 = valor1*(-1);
        TxtRes.setText(String.valueOf(valor1));        
        }
        operacao_solicitada = opSolicitada(operacao_solicitada);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void TxtValorAcumuladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtValorAcumuladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtValorAcumuladoActionPerformed

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
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtRes;
    private javax.swing.JTextField TxtValorAcumulado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
