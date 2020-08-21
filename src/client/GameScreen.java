
package client;
import entity.*;
import adt.*;

import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class GameScreen extends javax.swing.JPanel {

    MindChallenge gameClient;
    GameMove currentTurn;
    double timeCountDown = 30; //30 seconds to answer

    //Create a timer.
    Timer timer = new Timer(100, new ActionListener() {    //Timer fpr 0.1 second
        @Override
        public void actionPerformed(ActionEvent evt) {
            if(timeCountDown > 0){
                timeCountDown -= 0.1;
                jLabelTime.setText(String.format("%.1f s", timeCountDown));
            }
            else{
                //When time's up
                nextTurn();
            }
        }
    });
        
    int questionNo = 0;
    char optionSelected;
    
    public GameScreen(MindChallenge gameClient) {
        initComponents();
        this.gameClient = gameClient;
        
        initializeGame();
        currentTurn = gameClient.playerTurn.dequeue();
        playerReady(currentTurn.getPlayer());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Option1 = new javax.swing.JButton();
        Option2 = new javax.swing.JButton();
        Option3 = new javax.swing.JButton();
        Option4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelScore = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Question = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLogger = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        Option1.setFont(Option1.getFont().deriveFont(Option1.getFont().getSize()+5f));
        Option1.setText("Option1");
        Option1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option1ActionPerformed(evt);
            }
        });

        Option2.setFont(Option2.getFont().deriveFont(Option2.getFont().getSize()+5f));
        Option2.setText("Option2");
        Option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option2ActionPerformed(evt);
            }
        });

        Option3.setFont(Option3.getFont().deriveFont(Option3.getFont().getSize()+5f));
        Option3.setText("Option3");
        Option3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option3ActionPerformed(evt);
            }
        });

        Option4.setFont(Option4.getFont().deriveFont(Option4.getFont().getSize()+5f));
        Option4.setText("Option4");
        Option4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Current Player:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Score:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("CountDown:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Question:");

        jLabelScore.setText("SCORE");

        jLabelTime.setText("TIME");

        jLabelName.setText("PLAYER NAME");

        Question.setBackground(new java.awt.Color(218, 218, 255));
        Question.setColumns(20);
        Question.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Question.setRows(5);
        Question.setText("Question...");
        jScrollPane1.setViewportView(Question);
        Question.setEditable(false);
        Question.setLineWrap(true);
        Question.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(442, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabelName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Option3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Option4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Option1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Option2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(82, 82, 82))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabelScore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelTime)
                    .addComponent(jLabelName))
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Option1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Option2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Option3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Option4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 600));

        jLogger.setBackground(new java.awt.Color(101, 101, 255));
        jLogger.setColumns(20);
        jLogger.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLogger.setForeground(new java.awt.Color(255, 255, 255));
        jLogger.setRows(5);
        jLogger.setText("Event Logger\n========\n");
        jScrollPane2.setViewportView(jLogger);
        jLogger.setLineWrap(true);
        jLogger.setOpaque(false);
        jLogger.setEditable(false);
        jLogger.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 200, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 580, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void initializeGame(){
        int playerNo = gameClient.players.numElement();
        gameClient.playerTurn = new Queue<GameMove>(playerNo);
        for(int i = 1; i <= playerNo; i++){
            GameMove initialTurn = new GameMove(gameClient.players.getEntry(i),gameClient.questionSet.getEntry(questionNo),0,0);
            gameClient.playerTurn.enqueue(initialTurn); 
            questionNo++;
        }
        jLogger.append("Game initialized" + "\n");
    }
    
    private boolean checkGameOver(GameMove currentTurn){
        if(currentTurn.getStep() >= currentTurn.STEP_TO_WIN){ 
            
            //Display winner name etc...
            jPanel1.removeAll();
            jPanel1.add(Question);
            jPanel1.add(Option1);
            jPanel1.repaint();
            this.Question.setText("Winner is " + currentTurn.getPlayer().getPlayerName());
            this.Option1.setText("Back To Main Menu");
            
            jLogger.append("Game over" + "\n");
            recordToRank();
            
            gameClient.playerTurn.clear();
            return true;
        }
        return false;
    }
    
    private void recordToRank(){
        Ranking rank = new Ranking(currentTurn.getPlayer().getPlayerName(),currentTurn.getScore());
        gameClient.rank.add(rank);
        
        for(int i=0; i<gameClient.players.numElement()-1; i++ ){
            currentTurn = gameClient.playerTurn.dequeue();

            rank = new Ranking(currentTurn.getPlayer().getPlayerName(),currentTurn.getScore());
            gameClient.rank.add(rank);
        }
        saveRanking();
    }
    
    private void saveRanking(){
        try {
            File file = new File("Ranking.dat");
            
            ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream(file));
            ooStream.writeObject(gameClient.rank);
            ooStream.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
        }  
    }
    
    private void nextTurn(){
        GameMove nextTurn = new GameMove(currentTurn.getPlayer(),gameClient.questionSet.getEntry(questionNo),currentTurn.getStep(),currentTurn.getScore());
        gameClient.playerTurn.enqueue(nextTurn);
        questionNo++;
        
        currentTurn = gameClient.playerTurn.dequeue();  
        playerReady(currentTurn.getPlayer());
    }
    
    private void playerReady(Player player){
        timeCountDown = 30;
        jLabelTime.setText(String.format("%.1f s", timeCountDown));
        
        this.jLabelName.setText(player.getPlayerName());
        this.jLabelScore.setText(currentTurn.getScore() + "");
        
        this.Question.setText(player.getPlayerName() + ", are you ready?");
        this.Option1.setText("Ready");
        
        this.Option2.setVisible(false);
        this.Option3.setVisible(false);
        this.Option4.setVisible(false);
    }
    
    private void showQuestion(Question question){ //Suppose to pass in Question class
        this.Question.setText(question.getQuestionContent());
        this.Option1.setText(question.getAnswerA());  //To set question's option
        this.Option2.setText(question.getAnswerB());
        this.Option3.setText(question.getAnswerC());
        this.Option4.setText(question.getAnswerD());
        
        this.Option2.setVisible(true);
        this.Option3.setVisible(true);
        this.Option4.setVisible(true);  
    }
    
    private void validateAnswer(){
        timer.stop();
        
        char correctAns = currentTurn.getQuestion().getCorrentAnswer().charAt(0);
        
        if(optionSelected == correctAns){
            currentTurn.incStep();
            int score = currentTurn.calculateScore(timeCountDown);
            this.jLabelScore.setText(score + "");
            jLogger.append("Player " + currentTurn.getPlayer().getPlayerName() + " answered correctly!" + "\n");
        }
        else{
            currentTurn.decStep();
            jLogger.append("Player " + currentTurn.getPlayer().getPlayerName() + " answered wrongly!" + "\n");
            jLogger.append("Correct answer is " + correctAns + "\n");
        }
        jLogger.append("Step: " + currentTurn.getStep() + " Score: " + currentTurn.getScore() + "\n");
    }
    
    private void Option1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option1ActionPerformed
        // TODO add your handling code here:
        if(this.Option1.getText() == "Ready"){
            showQuestion(currentTurn.getQuestion());
            timer.start();
        }
        else if(this.Option1.getText() == "Back To Main Menu"){
            gameClient.setContentPane(new MainMenu(gameClient));
            this.gameClient.pack();
        }
        else{
            optionSelected = 'a';
            validateAnswer();
            if(!checkGameOver(currentTurn))
                nextTurn();
        }
    }//GEN-LAST:event_Option1ActionPerformed

    private void Option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option2ActionPerformed
        // TODO add your handling code here:
        optionSelected = 'b';
        validateAnswer();
        if(!checkGameOver(currentTurn))
            nextTurn();
    }//GEN-LAST:event_Option2ActionPerformed

    private void Option3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option3ActionPerformed
        // TODO add your handling code here:
        optionSelected = 'c';
        validateAnswer();
        if(!checkGameOver(currentTurn))
            nextTurn();
    }//GEN-LAST:event_Option3ActionPerformed

    private void Option4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option4ActionPerformed
        // TODO add your handling code here:
        optionSelected = 'd';
        validateAnswer();
        if(!checkGameOver(currentTurn))
            nextTurn();
    }//GEN-LAST:event_Option4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Option1;
    private javax.swing.JButton Option2;
    private javax.swing.JButton Option3;
    private javax.swing.JButton Option4;
    private javax.swing.JTextArea Question;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelScore;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JTextArea jLogger;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
