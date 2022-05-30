import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class CactusSmall2 extends Cactus{
    public CactusSmall2() throws IOException {
        super(30, 20, ImageIO.read(new File(
            "images/CactusSmall2.png"
        )) );
    }
}