//Lee Phey Jiet
package entity;

import java.util.Objects;
import java.io.Serializable;

public class Ranking implements Comparable<Ranking>, Serializable{
    private String name;
    private int totalScore;
    private static int rankCount=0;
    
    //public Ranking(Player player, int totalScore){
    public Ranking(String name, int totalScore){
        this.name=name;
        this.totalScore=totalScore;
        
        rankCount++;
    }
    
    public Ranking(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
    
    public int getTotalScore(){
        return totalScore;
    }
    
    public static int getRankCount(){
        return rankCount;
    }

    @Override
    public boolean equals(Object obj) {

        final Ranking other = (Ranking) obj;
        if (name.equals(other.name)) {
            return true;
        }
        
        return false;
    }
    
    public int compareTo(Ranking other){
        return totalScore - other.getTotalScore();
    }
    
    public String toString(){
        return String.format("    %-80s%-10s\n", getName(), getTotalScore());
    }
}
