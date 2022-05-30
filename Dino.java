import java.awt.*;
import java.awt.image.*;
/*
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException; 
*/

public abstract class Dino {
    private int x, y, width, height, jumpSeconds, moveY;
    BufferedImage image;

    /*  Syntax: 
     *  [cactus = c, dino = d] 
     *  (number) 
     *  [l = left, r = right, t = top, b = bottom] 
     *  [x or y (indicator)]
     */
    
    private int c1lx = -99999;
    private int c1rx = -99999;
    private int c1ty = -99999;
    private int c1by = -99999;

    private int c2lx = -99999;
    private int c2rx = -99999;
    private int c2ty = -99999;
    private int c2by = -99999;

    private int c3lx = -99999;
    private int c3rx = -99999;
    private int c3ty = -99999;
    private int c3by = -99999;
    
    public Dino(int h, int w, int jS, BufferedImage img) {
        height = h;
        width = w;
        jumpSeconds = jS;
        image = img;
        x = width;
        y = GamePanel.FRAME - 50 - height;

    } // public Dino
    public Dino(int jS, BufferedImage img) {
        height = img.getHeight();
        width = img.getWidth();
        jumpSeconds = jS;
        image = img;
        x = width;
        y = GamePanel.FRAME - 50 - height;

    } // public Dino 2

    // Get and set fields ---- 
    public int getX() { return x; }
    public int getY() { return y; }
    public int getHeight() { return height; }
    public int getWidth() { return width; }
    public int getJumpSeconds() { return jumpSeconds; }
    
    // Get cactus and dino positions
    public int getclx(int n) { if(n==1) return c1lx; else if(n==2) return c2lx; else return c3lx; }
    public int getcrx(int n) { if(n==1) return c1rx; else if(n==2) return c2rx; else return c3rx; }
    public int getcty(int n) { if(n==1) return c1ty; else if(n==2) return c2ty; else return c3ty; }
    public int getcby(int n) { if(n==1) return c1by; else if(n==2) return c2by; else return c3by; }

    public int getdlx() { return x; }
    public int getdrx() { return x+width; }
    public int getdty() { return y; }
    public int getdby() { return y+height; }

    public Boolean aboveGround() { if(y < GamePanel.FRAME - 50 - height) return true; return false; }

    // Set
    public void setX(int newX) { x = newX; }
    public void setY(int newY) { y = newY; }
    public void addX (int newX) { x += newX; }
    public void addY (int newY) { y += newY; }
    public void subX (int newX) { x -= newX; }
    public void subY (int newY) { y -= newY; }
    public void setImage (BufferedImage img) { image = img; }

    // Set cactus positions
    public void setclx (int n, int set) { if(n==1) c1lx=set; else if(n==2) c2lx=set; else c3lx=set; }
    public void setcrx (int n, int set) { if(n==1) c1rx=set; else if(n==2) c2rx=set; else c3rx=set; }
    public void setcty (int n, int set) { if(n==1) c1ty=set; else if(n==2) c2ty=set; else c3ty=set; }
    public void setcby (int n, int set) { if(n==1) c1by=set; else if(n==2) c2by=set; else c3by=set; }
    
    public void moveY() { y += moveY; }
    // ---- End get and set 

    public abstract void draw(Graphics g);
    public abstract boolean dead();
    public abstract int jumpEquation(int x);

} // public abstract class Dino 