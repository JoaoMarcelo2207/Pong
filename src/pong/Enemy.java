package pong;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author João Marcelo Costa Miranda
 */


public class Enemy {
    
    public double x,y;
    public int width, height;
    
    public Enemy(int x, int y){
        this.x = x;
        this.y = y;
        this.width = 5;
        this.height = 40;
    }
    public void tick(){
        y+= (Game.ball.y - y - 6) * 0.13;
        
        if(y+height > Game.HEIGHT){
            y = Game.HEIGHT - height;
        }
        else if(y + height < Game.HEIGHT/2 - 20){
            y = 0;
        }
    }
    
    public void render(Graphics g){
        g.setColor(Color.white);
        g.fillRect((int)x, (int)y, width, height);
    }
    
}
