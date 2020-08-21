/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import java.io.Serializable;

/**
 *
 * @author USER
 */
public class Player implements Serializable{
   
    private final String playerId ;
    private final String password;
    private final String playerName;
    private double score;
    private double highestScore;
    
    
    public Player(String playerName, String playerId, String password ){
        this.playerId = playerId;
        this.playerName = playerName;
        this.password = password;
        this.score = 0;
        this.highestScore = score;
        
    }
    
    public String getPlayerName(){
        return playerName;
    }
    
    public String getPlayerID(){
        return playerId;
    }
    
    public double getScore(){
        return score;
    }
    
    public String getPass(){
        return password;
    }
    
    public void setScore(double score){
        this.score = score;
        if(highestScore < this.score){
            setHighestScore(this.score);
        }
    }
    
    private void setHighestScore(double score){
        highestScore = score;
    }
    public double getHighestScore(){
        return highestScore;
    }
    //Overide
    public String toString(){
        //                          add 0 at beginig of d int
        return String.format("|%10s | %10s | %6.0f | %6.0f|",this.playerName, playerId ,score ,highestScore);
    }

    public boolean equals(Object o){
        Player other = (Player) o;
        return playerId.equals(other.getPlayerID()) && password.equals(other.getPass());
    }
}
