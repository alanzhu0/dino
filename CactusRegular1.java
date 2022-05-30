import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class CactusRegular1 extends Cactus{
    public CactusRegular1() throws IOException {
        super(50, 16, ImageIO.read(new File(
            "images/CactusRegular1.png"
        )) );
    }
}