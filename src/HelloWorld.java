import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld {
    private JButton halloButton;
    private JPanel mainPanel;
    private JTextField nameField;
    private JLabel nameLabel;
    private JCheckBox informalCheckBox;

    public HelloWorld() {
        halloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(halloButton ,"Herzlich Willkommen!");
                String name = nameField.getText();
                boolean informell = informalCheckBox.isSelected();
                if (informell) {
                    System.out.println("Yo, "+name+"!");
                } else {
                    System.out.println("Hallo " +name+"!");
                }

            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorld");
        frame.setContentPane(new HelloWorld().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
