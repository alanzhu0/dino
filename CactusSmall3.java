import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class CactusSmall3 extends Cactus{
    public CactusSmall3() throws IOException {
        super(30, 24, ImageIO.read(new File(
            "images/CactusSmall3.png"
        )) );
    }
}
