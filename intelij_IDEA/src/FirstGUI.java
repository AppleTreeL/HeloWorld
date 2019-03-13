
import javax.swing.JFrame;
import java.awt.*;

public class FirstGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("MainForm");

        frame.setContentPane(new MainForm().panel1);//

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //frame.setBackground(Color.blue);

        frame.setBounds(200, 200,300,300);

        frame.setSize(600,500);

        //frame.setPreferredSize(new Dimension(600,500));

        //frame.pack();

        frame.setVisible(true);

    }

}
