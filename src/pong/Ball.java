package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

/**
 *
 * @author João Marcelo Costa Miranda
 */
public class Ball {
    public double x,y;
    public short width, height;
    
    public double dx, dy, speed = 1.5, initialSpeed;
    
    public Ball(int x, int y){
        this.x = x;
        this.y = y;
        this.width = 5;
        this.height = 5;
        this.dx = new Random().nextInt(2);
        if(dx == 0) dx--;
        this.dy = new Random().nextInt(2);
        if(dy == 0) dy--;
    }
    public void tick(){
        
        if(y+(dy*speed)+ height >= Game.HEIGHT){
            dy*= -1;
        }
        else if(y+(dy*speed) < 0){
            dy*=-1;
        }
        
        if(x >= Game.WIDTH){
            Score.playerScore++;
            Game game = new Game();
            return;
        }
        else if(x < 0){
            Score.enemyScore++;
            Game game = new Game();
            return;
        }
        
        Rectangle bounds = new Rectangle((int)(x+(dx*speed)), (int)(y+(dy*speed)), width, height);
        Rectangle boundsPlayer = new Rectangle(Game.player.x,Game.player.y, Game.player.width, Game.player.height);
        Rectangle boundsEnemy = new Rectangle((int)Game.enemy.x, (int)Game.enemy.y, Game.enemy.width, Game.enemy.height);
        
        if(bounds.intersects(boundsPlayer)){
            dx*= -1;
        }
        else if(bounds.intersects(boundsEnemy)){
            dx*= -1;
        }
        
        x+= dx*speed;
        y+= dy*speed;
        
                    
    }
    
    public void render(Graphics g){
        g.setColor(Color.white);
        g.fillOval((int)x, (int)y, width, height);
    }
}
