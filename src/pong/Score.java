package pong;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author João Marcelo Costa Miranda
 */
public class Score extends Rectangle{
    
    static int playerScore,enemyScore;
    int x,y;
    
    Score(int x, int y){
        this.x = x;
        this.y = y;     
    }
    
    
    public void render(Graphics g){
        g.setColor(Color.white);
        g.setFont(new Font("Consolas", Font.PLAIN, 30));
        g.drawLine(Game.WIDTH/2,0, Game.WIDTH/2, Game.HEIGHT);
        g.drawString(String.valueOf(playerScore/10)+String.valueOf(playerScore%10), (Game.WIDTH/2) - 50, 25);
        g.drawString(String.valueOf(enemyScore/10)+String.valueOf(enemyScore%10), (Game.WIDTH/2) + 15, 25);
    }
    
}
