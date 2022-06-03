import java.awt.*;
import java.awt.image.*;

public class Cactus {
    private int x, y, width, height, moveX;
    private BufferedImage image;
    private Image resizedImage;

    public Cactus(int h, int w, BufferedImage img) {
        height = h;
        width = w;
        image = img;
        x = GamePanel.FRAME;
        y = GamePanel.FRAME - 50 - height;
        resizedImage = image.getScaledInstance(width, height, Image.SCALE_DEFAULT);
    } // public Cactus
    public Cactus(BufferedImage img) {
        height = img.getHeight();
        width = img.getWidth();
        image = img;
        x = GamePanel.FRAME;
        y = GamePanel.FRAME - 50 - height;
        resizedImage = image.getScaledInstance(width, height, Image.SCALE_DEFAULT);
    } // public Cactus 2

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
        g.drawImage(resizedImage, x, y, null );
    }
} // public abstract class Cactus