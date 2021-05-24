package selectMode;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Background3 extends JPanel {
    private Image image;

    public Background3() {
        try {
            image = ImageIO.read(new File("F:\\2021年春季学期\\JAVA\\project\\SweepMine-Tiga\\resouces\\pictures\\沙漠地貌.PNG"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image, 0, 0, 900, 600, null);
    }
}



