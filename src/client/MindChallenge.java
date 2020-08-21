package client;
import adt.*;
import entity.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import javax.swing.*;

public class MindChallenge extends JFrame {
    
    SetInterface<Question> questionSet = new Set<>();
    PlayerListInterface<Player> registeredPlayers = new ArrList<Player>();
    PlayerListInterface<Player> players = new ArrList<Player>();
    QueueInterface<GameMove> playerTurn = new Queue<GameMove>();
    SortedListInterface<Ranking> rank = new SortedList<>();
    
    public MindChallenge() {
        initComponents();
        loadPlayer();
        loadQuestions();
        loadRanking();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void loadPlayer(){
        try {
            File file = new File("RegisteredPlayer.dat");
            ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(file));
            registeredPlayers = (PlayerListInterface<Player>) inStream.readObject();
            
            inStream.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void loadQuestions(){
        String questionId[] = readFile("src/question/question_id.txt");
        String questionContent[] = readFile("src/question/question_title.txt");
        String answerA[] = readFile("src/question/question_option1.txt");
        String answerB[] = readFile("src/question/question_option2.txt");
        String answerC[] = readFile("src/question/question_option3.txt");
        String answerD[] = readFile("src/question/question_option4.txt");
        String correctAnswer[] = readFile("src/question/question_answer.txt");
        
        for(int i=0; i<questionId.length; i++){
            questionSet.add(new Question(questionId[i],questionContent[i],answerA[i],answerB[i],answerC[i],answerD[i],correctAnswer[i]));
        }
    }
    
    private String[] readFile(String file){  
        
        try{
            
            Scanner fileScanner= new Scanner(new File(file));
            int counter = 0;
            while(fileScanner.hasNextLine()){ 
                counter++;
                fileScanner.nextLine(); 
            }
            fileScanner.close();
            
            String[] content = new String[counter]; 
            Scanner idScanner2= new Scanner(new File(file));
            for(int i=0; i<counter; i++){
               content[i]=idScanner2.nextLine();
            }  
            idScanner2.close();
            return content; 
        }
        catch(Exception e){
            System.out.println("Σ(っ °Д °;)っ Error 404!");
            return null;
        } 
    }
    
    private void loadRanking(){
        try {
            File file = new File("Ranking.dat");
            ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(file));
            rank = (SortedListInterface<Ranking>) inStream.readObject();
            
            inStream.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
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
            java.util.logging.Logger.getLogger(MindChallenge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MindChallenge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MindChallenge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MindChallenge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MindChallenge gameClient = new MindChallenge();
                gameClient.setVisible(true);
                gameClient.setResizable(false);
                
                gameClient.setContentPane(new MainMenu(gameClient));
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
