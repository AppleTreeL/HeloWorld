import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    public JButton lookPasswordButton;
    public JPanel panel1;
    private JTextField textField1;

    public MainForm() {
        //panel1.setBounds(100, 100, 200, 200);
        panel1.setBackground(new Color(151,223,236));
        lookPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPasswordField pass = new JPasswordField(10);
                pass.setEchoChar('*');
                JOptionPane mention = new JOptionPane("请输入口令",JOptionPane.QUESTION_MESSAGE);
                mention.add(pass,1);
                JDialog questionDia = mention.createDialog(mention,"tips");
                questionDia.setVisible(true);
                String str = String.valueOf(pass.getPassword());
                //String str = JOptionPane.showInputDialog("输入口令查看备忘",false);
                if (str.equals("123456"))
                {
                    //JOptionPane.showMessageDialog(null,"github:Liu13679153708");
                    textField1.setText("github:Liu13679153708");
                }
            }
        });

    }


}
