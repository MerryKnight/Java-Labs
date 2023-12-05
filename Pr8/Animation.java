import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Animation {

    private static final int FRAME_WIDTH = 1000;
    private static final int FRAME_HEIGHT = 1000;

    private int currentFrame = 0;
    private ImageIcon[] frames;

    public Animation() {
        
        frames = new ImageIcon[3]; 
        for (int i = 0; i < 3; i++) {
            frames[i] = new ImageIcon("imgk" + i + ".png"); 
        }

    
        JFrame frame = new JFrame("I've got levitation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

      
        JPanel animationPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                frames[currentFrame].paintIcon(this, g, 0, 0);
            }
        };

        frame.add(animationPanel);
        frame.setVisible(true);


        Timer timer = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % frames.length;
                animationPanel.repaint(); 
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Animation();
            }
        });
    }
}