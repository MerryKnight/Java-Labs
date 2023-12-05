import javax.swing.*;
public class Test
{
    public static void main(String[] args)
    {
        JFrame fr = new JFrame("Shapes");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(500,500);
        
        DrawingPanel dpanel = new DrawingPanel();
        fr.add(dpanel);
        fr.setVisible(true);
        
        
    }
}
