import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class CactusGroup extends Cactus {
    public CactusGroup() throws IOException {
        super(50, 40, ImageIO.read(new File(
            "images/CactusGroup.png"
        )) );
    }
}