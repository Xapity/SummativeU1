/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoodSummative;

/**
 *
 * @author callu
 */
public class GoodSummative extends javax.swing.JFrame {

    /**
     * Creates new form GoodSummative
     */
    public GoodSummative() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        question = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        quote1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        quote = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ansInput = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        question.setColumns(20);
        question.setRows(5);
        question.setText("Question: What country in world war \ntwo had the most casualties? \n1)Soviet Union 2)Germany \n3)Great Britain 4)Japan");
        jScrollPane2.setViewportView(question);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\callu\\Downloads\\ww2memorial.jpg")); // NOI18N

        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        quote1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        quote1.setForeground(new java.awt.Color(0, 0, 204));
        quote1.setText("Score:");

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("WW2 Quiz");

        score.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        score.setForeground(new java.awt.Color(0, 0, 204));
        score.setText("0");

        quote.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        quote.setForeground(new java.awt.Color(0, 0, 204));
        quote.setText("Thank You!");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Answer:");

        jScrollPane1.setViewportView(ansInput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(392, 392, 392))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jButton1)
                        .addGap(86, 86, 86)
                        .addComponent(quote))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(quote1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(score))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel4)))
                .addContainerGap(366, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quote1)
                            .addComponent(score))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                        .addComponent(quote)
                        .addGap(141, 141, 141))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
        int ansCorrect = 0;
        int questionNum = 1;
        int answer;
        int randomNumber;
        int q1 = 1;
        int q2 = 1;
        int q3 = 1;
        int q4 = 1;   
        int q5 = 1;//declaring variables
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        
        
        randomNumber = (int)Math.round(Math.random()*4+1);//random number setting

            
        if (questionNum == 1 && q1 == 1){//first question
            answer = Integer.parseInt(ansInput.getText());//finding answer
           
            if (answer == 1 && q1 == 1){//if answer is right
                switch(randomNumber){//setting switch
                    case 1:
                        quote.setText("Thats correct good job!");//different possible outputs
                        break;
                    case 2:
                        quote.setText("Perfction that answer was!");
                        break;
                    case 3:
                        quote.setText("You outdid yourself, you're right!");
                        break;
                    case 4:
                        quote.setText("Well done on that one!");
                        break;
                    case 5:
                        quote.setText("Well played sir, that's correct!");
                        break;
                }
                        ansCorrect = ansCorrect+1;//adding score and question number
                        questionNum = questionNum+1;
                        score.setText(" " + ansCorrect);
                        q1 = 0;//making sure question isnt repeated
                        question.setText("What country was known as Europe's soft underbelly in WW2? 1)Germany 2)Africa 3)Italy 4)Spain");
                        //next question being ste up
                }
            else{
                switch(randomNumber){//if answer wrong these are the outputs
                    case 1:
                        quote.setText("That was the big wrong (Answer was 1).");
                        break;
                    case 2:
                        quote.setText("Good attempt (Answer was 1).");
                        break;
                    case 3:
                        quote.setText("You tried your best (Answer was 1).");
                        break;
                    case 4:
                        quote.setText("We all make mistakes (Answer was 1).");
                        break;
                    case 5:
                        quote.setText("We'll forgive you (Answer was 1).");
                        break;
                        
                }
                        questionNum = questionNum+1;
                        score.setText(" " + ansCorrect);
                        q1 = 0;
                        question.setText("What country was known as Europe's soft underbelly in WW2? 1)Germany 2)Africa 3)Italy 4)Spain");
                        
            }
        }
            else if (questionNum == 2 && q2 == 1){//repeated from question 1
            answer = Integer.parseInt(ansInput.getText());
            
            
            if (answer == 3 && q2 == 1){
                switch(randomNumber){
                    case 1:
                        quote.setText("Thats correct good job!");
                        break;
                    case 2:
                        quote.setText("Perfction that answer was!");
                        break;
                    case 3:
                        quote.setText("You outdid yourself, you're right!");
                        break;
                    case 4:
                        quote.setText("Well done on that one!");
                        break;
                    case 5:
                        quote.setText("Well played sir, that's correct!");
                        break;
                }
                        ansCorrect = ansCorrect+1;
                        questionNum = questionNum+1;
                        score.setText(" " + ansCorrect);
                        q2 = 0;
                        question.setText("What country did the Luftwaffe belong to? 1)Soviet Union 2)Germany 3)Australia 4)Japan");
                       
                }
            else{
                switch(randomNumber){
                    case 1:
                        quote.setText("That was the big wrong (Answer was 3).");
                        break;
                    case 2:
                        quote.setText("Good attempt (Answer was 3).");
                        break;
                    case 3:
                        quote.setText("You tried your best (Answer was 3).");
                        break;
                    case 4:
                        quote.setText("We all make mistakes (Answer was 3).");
                        break;
                    case 5:
                        quote.setText("We'll forgive you (Answer was 3).");
                        break;
                        
                }
                        questionNum = questionNum+1;
                        score.setText(" " + ansCorrect);
                        q2 = 0;
                        question.setText("What country did the Luftwaffe belong to? 1)Soviet Union 2)Germany 3)Australia 4)Japan");
            }
            }
        else if (questionNum == 3 && q3 == 1){//repeated from question 1
            answer = Integer.parseInt(ansInput.getText());
            
            
            if (answer == 2 && q3 == 1){
                switch(randomNumber){
                    case 1:
                        quote.setText("Thats correct good job!");
                        break;
                    case 2:
                        quote.setText("Perfction that answer was!");
                        break;
                    case 3:
                        quote.setText("You outdid yourself, you're right!");
                        break;
                    case 4:
                        quote.setText("Well done on that one!");
                        break;
                    case 5:
                        quote.setText("Well played sir, that's correct!");
                        break;
                }
                        ansCorrect = ansCorrect+1;
                        questionNum = questionNum+1;
                        score.setText(" " + ansCorrect);
                        q3 = 0;
                        question.setText("In what country was the maginot line built? 1)Netherlands 2)Canada 3)Italy 4)France");
                }
            else{
                switch(randomNumber){
                    case 1:
                        quote.setText("That was the big wrong (Answer was 2).");
                        break;
                    case 2:
                        quote.setText("Good attempt (Answer was 2).");
                        break;
                    case 3:
                        quote.setText("You tried your best (Answer was 2).");
                        break;
                    case 4:
                        quote.setText("We all make mistakes (Answer was 2).");
                        break;
                    case 5:
                        quote.setText("We'll forgive you (Answer was 2).");
                        break;
                        
                }
                        questionNum = questionNum+1;
                        score.setText(" " + ansCorrect);
                        q3 = 0;
                        question.setText("In what country was the maginot line built? 1)Netherlands 2)Canada 3)Italy 4)France");
            }
            }
        else if (questionNum == 4 && q4 == 1){//repeated from question 1
            answer = Integer.parseInt(ansInput.getText());
            
            
            if (answer == 4 && q4 == 1){
                switch(randomNumber){
                    case 1:
                        quote.setText("Thats correct good job!");
                        break;
                    case 2:
                        quote.setText("Perfction that answer was!");
                        break;
                    case 3:
                        quote.setText("You outdid yourself, you're right!");
                        break;
                    case 4:
                        quote.setText("Well done on that one!");
                        break;
                    case 5:
                        quote.setText("Well played sir, that's correct!");
                        break;
                }
                        ansCorrect = ansCorrect+1;
                        questionNum = questionNum+1;
                        score.setText(" " + ansCorrect);
                        q4 = 0;
                        question.setText("What country was known as the sleeping giant in WW2? 1)Great Britain 2)USA 3)Germany 4)Soviet Union");
                }
            else{
                switch(randomNumber){
                    case 1:
                        quote.setText("That was the big wrong (Answer was 4).");
                        break;
                    case 2:
                        quote.setText("Good attempt (Answer was 4).");
                        break;
                    case 3:
                        quote.setText("You tried your best (Answer was 4).");
                        break;
                    case 4:
                        quote.setText("We all make mistakes (Answer was 4).");
                        break;
                    case 5:
                        quote.setText("We'll forgive you (Answer was 4).");
                        break;
                        
                }
                        questionNum = questionNum+1;
                        score.setText(" " + ansCorrect);
                        q4 = 0;
                        question.setText("What country was known as the sleeping giant in WW2? 1)Great Britain 2)USA 3)Germany 4)Soviet Union");
            }
        }
        else if (questionNum == 5 && q5 == 1){//repeated from quwestion 1
            answer = Integer.parseInt(ansInput.getText());
            
            
            if (answer == 2 && q5 == 1){
                switch(randomNumber){
                    case 1:
                        quote.setText("Thats correct good job!");
                        break;
                    case 2:
                        quote.setText("Perfction that answer was!");
                        break;
                    case 3:
                        quote.setText("You outdid yourself, you're right!");
                        break;
                    case 4:
                        quote.setText("Well done on that one!");
                        break;
                    case 5:
                        quote.setText("Well played sir, that's correct!");
                        break;
                }
                        ansCorrect = ansCorrect+1;
                        questionNum = questionNum+1;
                        score.setText(" " + ansCorrect);
                        q5 = 0;
                       
                }
            else{
                switch(randomNumber){//setting switch
                    case 1:
                        quote.setText("That was the big wrong (Answer was 2).");//different output for each random number
                        break;
                    case 2:
                        quote.setText("Good attempt (Answer was 2).");
                        break;
                    case 3:
                        quote.setText("You tried your best (Answer was 2).");
                        break;
                    case 4:
                        quote.setText("We all make mistakes (Answer was 2).");
                        break;
                    case 5:
                        quote.setText("We'll forgive you (Answer was 2).");
                        break;
                        
                }
                        questionNum = 20;
                        score.setText(" " + ansCorrect);
                        q5 = 0;
                        
                                 
            }
        }
                                    //at the end of the quiz depending on the amount of questiond right and wrong a message is displayed
                                    if (q5 == 0 && ansCorrect == 5){
                                        quote.setText("You got perfect! Hve you ever thought of joining trivia club?");
  
                                 }
                                    else if (q5 == 0 && (ansCorrect == 4 || ansCorrect == 3 || ansCorrect == 2)){
                                        quote.setText("You're getting there! Keep trying and keep learning!");
                                 }
                                    else {
                                        quote.setText("I hope you do better next time... I really hope you do.");
                                 }
       
            
        
        
        
        
        
        
        
        
        
        
        
            
    }//GEN-LAST:event_jButton1ActionPerformed

        
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
            java.util.logging.Logger.getLogger(GoodSummative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GoodSummative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GoodSummative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GoodSummative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GoodSummative().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane ansInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea question;
    private javax.swing.JLabel quote;
    private javax.swing.JLabel quote1;
    private javax.swing.JLabel score;
    // End of variables declaration//GEN-END:variables
}
