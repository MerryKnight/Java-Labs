import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class football extends JFrame
{
    JButton button = new JButton("AC Milan");
    JButton button1 = new JButton("Real Madrid");
    private int a = 0;
    private int b = 0;
    private String c = "N/A";
    private String d = "DRAW";
    JLabel label = new JLabel("Result: " + a + " X " + b);
    
    JLabel label1 = new JLabel("Last Scorer: " + c);
    JLabel label2 = new JLabel("Winner " + d);
    
    
    public football()
    {
        super("Football Match");
        setLayout(null);
        setSize(400,400);
        add(button);
        add(button1);
        add(label);
        add(label1);
        add(label2);
        button.setBounds(10,35,120,50);
        button1.setBounds(230,35,120,50);
        label.setBounds(145,35,200,50);
        label1.setBounds(130,0,200,50);
        label2.setBounds(135,75,200,50);
        button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            a+=1;
            c = "AC Milan";
            label.setText("Result: " + a + " X " + b);
            label1.setText("Last Scorer: " + c);
            label2.setText("Winner: " + checkWinner());
            
            
            
        }
        });
        button1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            b+=1;
            c = "Real Madrid";
            label.setText("Result: " + a + " X " + b);
            label1.setText("Last Scorer: " + c);
            label2.setText("Winner: " + checkWinner());
            
            
        }
        });
    }
    public String checkWinner()
    {
        if(a == b) d = "DRAW";
        if(a>b) d = "AC Milan is winner";
        if(a<b) d = "Real Madrid is winner";
        return d;
    }
    
    public static void main(String[] args)
    {
        new football().setVisible(true);
    }
}