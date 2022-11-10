import java.awt.Color;
import static java.awt.Color.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sahilgupta2317
 */
public class TIC_TAC_TOE_FRAME extends javax.swing.JFrame {

    /**
     * Creates new form TIC_TAC_TOE_FRAME
     */
    
    private static String turn = "X";
    private static int xcount = 0;
    private static int ocount = 0;
    private int totalCount=0;
    
    public TIC_TAC_TOE_FRAME() {
        initComponents();
    }
    
      private void gameScore()
    {
        
        xscore.setText(String.valueOf(xcount));
        oscore.setText(String.valueOf(ocount));
    }
      
      private void choosePlayer()
    {
        if(turn.equalsIgnoreCase("X"))
        {
            turn = "O";
        }
        else
        {
            turn = "X";
        }
    }
      
         private void winningGame()
    {
        String b1 = txtbtn1.getText();
        String b2 = txtbtn2.getText();
        String b3 = txtbtn3.getText();
        
        String b4 = txtbtn4.getText();
        String b5 = txtbtn5.getText();
        String b6 = txtbtn6.getText();
        
        String b7 = txtbtn7.getText();
        String b8 = txtbtn8.getText();
        String b9 = txtbtn9.getText();
        
           if(b1 == ("X") && b2 == ("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            
            txtbtn1.setBackground(orange);
            txtbtn2.setBackground(orange);
            txtbtn3.setBackground(orange);
            
        }
        
        else if(b4 == ("X") && b5 == ("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            
            txtbtn4.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn6.setBackground(orange);
            
        }
           
          else if(b7 == ("X") && b8 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            
            txtbtn7.setBackground(orange);
            txtbtn8.setBackground(orange);
            txtbtn9.setBackground(orange);
            
        }
        
        else if(b1 == ("X") && b4 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            
            txtbtn1.setBackground(orange);
            txtbtn4.setBackground(orange);
            txtbtn7.setBackground(orange);
            
        }
        
         else if(b2 == ("X") && b5 == ("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            
            txtbtn2.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn8.setBackground(orange);
            
        }
        
        else if(b3 == ("X") && b6 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            
            txtbtn3.setBackground(orange);
            txtbtn6.setBackground(orange);
            txtbtn9.setBackground(orange);
            
        }
           
           else if(b1 == ("X") && b5 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            
            txtbtn1.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn9.setBackground(orange);
            
        }
        
        else if(b3 == ("X") && b5 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            
            txtbtn3.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn7.setBackground(orange);
            
        }
           
          else if(b1 == ("O") && b2 == ("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            
            txtbtn1.setBackground(orange);
            txtbtn2.setBackground(orange);
            txtbtn3.setBackground(orange);
            
        }
        
        else if(b4 == ("O") && b5 == ("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            
            txtbtn4.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn6.setBackground(orange);
            
        }
        
        else if(b7 == ("O") && b8 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            
            txtbtn7.setBackground(orange);
            txtbtn8.setBackground(orange);
            txtbtn9.setBackground(orange);
            
        }
        
         else if(b1 == ("O") && b4 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            
            txtbtn1.setBackground(orange);
            txtbtn4.setBackground(orange);
            txtbtn7.setBackground(orange);
            
        }
        
        else if(b2 == ("O") && b5 == ("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            
            txtbtn2.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn8.setBackground(orange);
            
        }
        
       
        else if(b3 == ("O") && b6 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            
            txtbtn3.setBackground(orange);
            txtbtn6.setBackground(orange);
            txtbtn9.setBackground(orange);
            
        }
        
        else if(b1 == ("O") && b5 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            
            txtbtn1.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn9.setBackground(orange);
            
        }
        
        else if(b3 == ("O") && b5 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            
            txtbtn3.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn7.setBackground(orange);
            
        }
        else if(totalCount==9){
            JOptionPane.showMessageDialog(this, "No one Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn2 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        xscore = new javax.swing.JLabel();
        whoseTurn = new javax.swing.JLabel();
        oscore = new javax.swing.JLabel();
        lable1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        txtbtn2.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn1.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn3.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn6.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn5.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn4.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        resetbtn.setBackground(new java.awt.Color(0, 51, 204));
        resetbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        txtbtn8.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn7.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(255, 51, 0));
        exitbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exitbtn.setText("EXIT");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        txtbtn9.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        xscore.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xscore.setForeground(new java.awt.Color(0, 51, 255));
        xscore.setText("-----");

        whoseTurn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        whoseTurn.setText("X");

        oscore.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        oscore.setForeground(new java.awt.Color(0, 51, 255));
        oscore.setText("-----");

        lable1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lable1.setText("PlayerX:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("TURN");

        label2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label2.setText("PlayerO:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lable1)
                            .addComponent(label2))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xscore)
                            .addComponent(oscore)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(whoseTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(whoseTurn)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lable1)
                    .addComponent(xscore))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2)
                    .addComponent(oscore))
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(resetbtn)
                        .addGap(26, 26, 26)
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        
        
        txtbtn1.setBackground(LIGHT_GRAY);
        txtbtn2.setBackground(LIGHT_GRAY);
        txtbtn3.setBackground(LIGHT_GRAY);
        
        txtbtn4.setBackground(LIGHT_GRAY);
        txtbtn5.setBackground(LIGHT_GRAY);
        txtbtn6.setBackground(LIGHT_GRAY);
        
        txtbtn7.setBackground(LIGHT_GRAY);
        txtbtn8.setBackground(LIGHT_GRAY);
        txtbtn9.setBackground(LIGHT_GRAY);
        
        totalCount=0;
    }//GEN-LAST:event_resetbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
            JFrame frame = new JFrame("Exit");
       
       if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit",
               "Tic Tac Toe",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
       {
        System.exit(0); 
       }
    }//GEN-LAST:event_exitbtnActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
         txtbtn1.setText(turn);
        totalCount++;
        
        if(turn.equalsIgnoreCase("X"))
        {
            whoseTurn.setText(turn);
            txtbtn1.setForeground(Color.red);
        }
        else
        {
             whoseTurn.setText(turn);
            txtbtn1.setForeground(Color.blue);
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
          txtbtn2.setText(turn);
        totalCount++;
        
        if(turn.equalsIgnoreCase("X"))
        {
             whoseTurn.setText(turn);
            txtbtn2.setForeground(Color.red);
        }
        else
        {
             whoseTurn.setText(turn);
            txtbtn2.setForeground(Color.blue);
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
         txtbtn3.setText(turn);
        totalCount++;
        
        if(turn.equalsIgnoreCase("X"))
        {
             whoseTurn.setText(turn);
            txtbtn3.setForeground(Color.red);
        }
        else
        {
             whoseTurn.setText(turn);
            txtbtn3.setForeground(Color.blue);
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
        txtbtn4.setText(turn);
        totalCount++;
        
        if(turn.equalsIgnoreCase("X"))
        {
             whoseTurn.setText(turn);
            txtbtn4.setForeground(Color.red);
        }
        else
        {
             whoseTurn.setText(turn);
            txtbtn4.setForeground(Color.blue);
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
         txtbtn5.setText(turn);
        totalCount++;
        
        if(turn.equalsIgnoreCase("X"))
        {
             whoseTurn.setText(turn);
            txtbtn5.setForeground(Color.red);
        }
        else
        {
             whoseTurn.setText(turn);
            txtbtn5.setForeground(Color.blue);
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
         txtbtn6.setText(turn);
        totalCount++;
        
        if(turn.equalsIgnoreCase("X"))
        {
             whoseTurn.setText(turn);
            txtbtn6.setForeground(Color.red);
        }
        else
        {
             whoseTurn.setText(turn);
            txtbtn6.setForeground(Color.blue);
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
         txtbtn7.setText(turn);
        totalCount++;
        
        if(turn.equalsIgnoreCase("X"))
        {
             whoseTurn.setText(turn);
            txtbtn7.setForeground(Color.red);
        }
        else
        {
             whoseTurn.setText(turn);
            txtbtn7.setForeground(Color.blue);
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
          txtbtn8.setText(turn);
        totalCount++;
        
        if(turn.equalsIgnoreCase("X"))
        {
             whoseTurn.setText(turn);
            txtbtn8.setForeground(Color.red);
        }
        else
        {
             whoseTurn.setText(turn);
            txtbtn8.setForeground(Color.blue);
        }
        choosePlayer();
        winningGame();
        
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
         txtbtn9.setText(turn);
        totalCount++;
        
        if(turn.equalsIgnoreCase("X"))
        {
             whoseTurn.setText(turn);
            txtbtn9.setForeground(Color.red);
        }
        else
        {
             whoseTurn.setText(turn);
            txtbtn9.setForeground(Color.blue);
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_txtbtn9ActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE_FRAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel lable1;
    private javax.swing.JLabel oscore;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JLabel whoseTurn;
    private javax.swing.JLabel xscore;
    // End of variables declaration//GEN-END:variables
}
