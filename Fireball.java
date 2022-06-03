import java.awt.*;

public class Fireball {
    private int x, y;
    private int moveX = GamePanel.movex * -1 + 2;
    public static int width = 15;
    public static int height = 20;


    public Fireball(int newx, int newy) {
        x = newx;
        y = newy;
    } // public Fireball()

    // Get and set fields ---- 
    public int getX() { return x; }
    public int getY() { return y; }
    public int getHeight() { return height; }
    public int getWidth() { return width; }

    public void setX(int newX) { x = newX; }
    public void setY(int newY) { y = newY; }

    public void addX (int newX) { x += newX; }
    public void addY (int newY) { y += newY; }
    public void subX (int newX) { x -= newX; }
    public void subY (int newY) { y -= newY; }
    
    public void moveX() { x += moveX; }
    public void setMoveX(int newMoveX) {moveX = newMoveX;}
    public int getMoveX() { return moveX; }
    // ---- End get and set 

    public void draw(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(x, y, width, height);
    }
} // public class Fireball