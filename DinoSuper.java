import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class DinoSuper extends Dino  {

    private int lives = 20;

    public DinoSuper() throws IOException {
        super(100, 52, 52, ImageIO.read(new File("images/DinoRegular.png")) );
    }
    public boolean dead() {
        for(int n = 1; n <= 3; n++) {  // Check if cactuses haven't been initialized
            if( getcrx(n)==-99999 ) return false;  // No need to check all the parameters because all are set at the same time
        }

        for(int n = 1; n <= 3; n++) {
            if( getdrx() >= getclx(n)   &&  // dino right cactus left
                getdrx() <= getcrx(n)   &&  // dino right cactus right
                getdby() >= getcty(n) + (getcty(n) - getcby(n))/2 &&  // dino bottom cactus top
                getdby() <= getcby(n) )     // dino bottom cactus bottom
                lives --;
        }

        if(lives <= 0) {
            lives = 0;
            return true;
        }
        return false;
    }

    public int jumpEquation(int x) {
        return (int)( -0.3*x*( x - getJumpSeconds()) );
    }

    public void draw(Graphics g){
        Image resizedImage = image.getScaledInstance(getWidth(), getHeight(), Image.SCALE_DEFAULT);
        g.drawImage(resizedImage, getX(), getY(), null );

        if(lives > 10) g.setColor(Color.GREEN);
        else if (lives > 5 ) g.setColor(Color.ORANGE);
        else g.setColor(Color.RED);

        g.setFont(new Font("Monospaced", 0, 14));
        g.drawString(Integer.toString(lives), 20, 50);
    }
}


