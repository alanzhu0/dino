import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class CactusSmall1 extends Cactus{
    public CactusSmall1() throws IOException {
        super(30, 10, ImageIO.read(new File(
            "images/CactusSmall1.png"
        )) );
    }
}