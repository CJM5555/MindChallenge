
package entity;

public class GameMove {
    private Player player;
    private Question question;
    private int step;
    private int score;
    public static final int STEP_TO_WIN = 3;
    
    public void incStep() {
        this.step++;
    }
    
    public void decStep() {
        this.step--;
    }
    
    public int calculateScore(double timeSpent){
        score += timeSpent * 50;
        if(score < 0){
            score = 0;
        }
        return score;
    }
        
    public GameMove(){
        
    }
    
    public GameMove(Player player, Question question, int step, int score){
        this.player = player;
        this.question = question;
        this.step = step;
        this.score = score;
    }
    
    public int getStep() {
        return step;
    }

    public Player getPlayer() {
        return player;
    }

    public Question getQuestion() {
        return question;
    }
 
    public int getScore(){
        return score;
    }
    
}
