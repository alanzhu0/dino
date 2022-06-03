import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class DinoFire extends Dino  {
    public DinoFire() throws IOException {
        super(50, 26, 42, ImageIO.read(new File("images/DinoRegular.png")) );
    }
    public boolean dead() {
        for(int n = 1; n <= 3; n++) {  // Check if cactuses haven't been initialized
            if( getcrx(n)==-99999 ) return false;  // No need to check all the parameters because all are set at the same time
        }

        for(int n = 1; n <= 3; n++) {
            if( getdrx() >= getclx(n) &&  // dino right cactus left
                getdrx() <= getcrx(n) &&  // dino right cactus right
                getdby() >= getcty(n) )   // dino bottom cactus top
                return true;
        }
        return false;
    }

    public int jumpEquation(int x) {
        return (int)(-0.3*((x*x) - (x * getJumpSeconds())));
    }   
    public String getType() {
        return "DinoFire";
    }
    public void draw(Graphics g){
        Image resizedImage = image.getScaledInstance(getWidth(), getHeight(), Image.SCALE_DEFAULT);
        g.drawImage(resizedImage, getX(), getY(), null );
    }
}


