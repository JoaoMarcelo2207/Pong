package pong;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author João Marcelo Costa Miranda
 */
public class Player {
    
    public boolean up, down;
    public int x, y;
    public int height, width;
    
    public Player(int x, int y){
        this.x = x;
        this.y = y;
        this.width = 5;
        this.height = 40;
    }
    
    public void tick(){
        if(up){
            y= y-2;
        }
        else if(down){
            y= y+2;
        }
        if(y+height > Game.HEIGHT){
            y = Game.HEIGHT - height;
        }
        else if(y + height < Game.HEIGHT/2 - 20){
            y = 0;
        }
        
    }
    
    public void render(Graphics g){
        g.setColor(Color.white);
        g.fillRect(x, y, width, height);
        
    }
    
    
    
}
