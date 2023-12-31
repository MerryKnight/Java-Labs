import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
public class ImageWindow
{
   public static void main(String[] args)
   {
        String imgp = args[0];
       SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Your image stands reflected");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 600);

            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    BufferedImage image;
                    try {
                        image = ImageIO.read(new File(imgp));
                        g.drawImage(image, 0, 0, this);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };

            frame.add(panel);
            frame.setVisible(true);
   });
    
}
}


