import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class DinoFire extends Dino  {
    public DinoFire() throws IOException {
        super(50, 26, 42, ImageIO.read(new File("images/DinoRegular.png")) );
    }
    public boolean dead() {
        return false;
    }

    public int jumpEquation(int x) {
        return (int)(-0.3*((x*x) - (x * getJumpSeconds())));
    }   

    public void draw(Graphics g){
        Image resizedImage = image.getScaledInstance(getWidth(), getHeight(), Image.SCALE_DEFAULT);
        g.drawImage(resizedImage, getX(), getY(), null );
    }
}


