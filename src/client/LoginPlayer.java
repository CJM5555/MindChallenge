package client;

import entity.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class LoginPlayer extends javax.swing.JPanel {

    MindChallenge gameClient;
    DefaultListModel playerList = new DefaultListModel();

    public LoginPlayer(MindChallenge gameClient) {
        initComponents();
        this.gameClient = gameClient;
        gameClient.players.clear();

        jPlayerList.setModel(playerList);
        jDeleteButton.setVisible(false);
        playerList.addElement(String.format("%-15s %-20s", "ID", "Name"));

        jPlayerList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                if (!evt.getValueIsAdjusting()) {
                    jDeleteButton.setVisible(true);
                }
            }
        });
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
        jLabel0 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPlayerName = new javax.swing.JTextField();
        jLoginButton = new javax.swing.JButton();
        jDeleteButton = new javax.swing.JButton();
        jConfirmButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPlayerList = new javax.swing.JList<>();
        jPlayerId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jRegister = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel0.setText("Join the game!");

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getSize()+5f));
        jLabel1.setText("Player Name: ");

        jPlayerName.setFont(jPlayerName.getFont().deriveFont(jPlayerName.getFont().getSize()+5f));
        jPlayerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPlayerNameKeyPressed(evt);
            }
        });

        jLoginButton.setFont(jLoginButton.getFont().deriveFont(jLoginButton.getFont().getSize()+5f));
        jLoginButton.setText("Login");
        jLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginButtonActionPerformed(evt);
            }
        });

        jDeleteButton.setFont(jDeleteButton.getFont().deriveFont(jDeleteButton.getFont().getSize()+5f));
        jDeleteButton.setText("Delete");
        jDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteButtonActionPerformed(evt);
            }
        });

        jConfirmButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jConfirmButton.setText("Confirm");
        jConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfirmButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getSize()+5f));
        jLabel2.setText("Player List:");

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 600));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPlayerList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPlayerList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jPlayerList);

        jPlayerId.setFont(jPlayerId.getFont().deriveFont(jPlayerId.getFont().getSize()+5f));
        jPlayerId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPlayerIdKeyPressed(evt);
            }
        });

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getSize()+5f));
        jLabel3.setText("Player Id: ");

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getSize()+5f));
        jLabel4.setText("Password:");

        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordKeyPressed(evt);
            }
        });

        jRegister.setFont(jRegister.getFont().deriveFont(jRegister.getFont().getSize()+5f));
        jRegister.setText("Register");
        jRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPlayerId, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addComponent(jPassword))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jConfirmButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRegister))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel0)
                    .addComponent(jRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPlayerId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginPlayer() {
        Player player = new Player(jPlayerName.getText(), jPlayerId.getText(), new String(jPassword.getPassword()));

        if (gameClient.registeredPlayers.contains(player) && !gameClient.players.contains(player)) {
            playerList.addElement(String.format("%-15s %-20s", jPlayerId.getText(), jPlayerName.getText()));

            gameClient.players.add(player);
        } else {
            System.out.println("Not added : " + player);
            System.out.println("The player is not registered or player already joined the game!");
        }

        clearTextFields();
    }

    private void clearTextFields() {
        jPlayerName.setText("");
        jPlayerId.setText("");
        jPassword.setText("");

        jPlayerName.requestFocus();
    }

    private void jLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginButtonActionPerformed
        //Add button
        loginPlayer();
    }//GEN-LAST:event_jLoginButtonActionPerformed

    private void jConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfirmButtonActionPerformed
        //Confirm button
        if (gameClient.players.numElement() > 1) {
            gameClient.setContentPane(new GameScreen(gameClient));
            gameClient.pack();
        } else {
            JOptionPane.showMessageDialog(null, "Must have 2 or more players in game!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jConfirmButtonActionPerformed

    private void jPlayerNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPlayerNameKeyPressed
        // When enter is pressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jPlayerId.requestFocus();
        }
    }//GEN-LAST:event_jPlayerNameKeyPressed

    private void jDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteButtonActionPerformed
        // TODO add your handling code here:
        int index = jPlayerList.getSelectedIndex();
        if (index != 0) {
            Player playerToRemove = gameClient.players.getEntry(index);

            gameClient.players.remove(gameClient.players.getPosition(playerToRemove));
            playerList.removeElementAt(index);

            System.out.println("Deleted: " + playerToRemove);
        }
    }//GEN-LAST:event_jDeleteButtonActionPerformed

    private void jPlayerIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPlayerIdKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jPassword.requestFocus();
        }
    }//GEN-LAST:event_jPlayerIdKeyPressed

    private void jRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegisterActionPerformed
        // TODO add your handling code here:
        gameClient.setContentPane(new RegisterPlayer(gameClient));
        gameClient.pack();
    }//GEN-LAST:event_jRegisterActionPerformed

    private void jPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            loginPlayer();
        }
    }//GEN-LAST:event_jPasswordKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jConfirmButton;
    private javax.swing.JButton jDeleteButton;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jLoginButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jPlayerId;
    private javax.swing.JList<String> jPlayerList;
    private javax.swing.JTextField jPlayerName;
    private javax.swing.JButton jRegister;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
