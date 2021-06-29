import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculator {
    private JButton button_msg;
    private JPanel panelMain;
    public Calculator(){
        button_msg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"hello");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setContentPane(new Calculator().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
