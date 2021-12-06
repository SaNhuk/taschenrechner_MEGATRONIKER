import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TaschenrechnerView {
    private JTextField anzeige;
    private JButton vierButton;
    private JButton einsButton;
    private JButton siebenButton;
    private JButton zweiButton;
    private JButton fünfButton;
    private JButton achtButton;
    private JButton dreiButton;
    private JButton sechsButton;
    private JButton neunButton;
    private JButton nullButton;
    private JPanel taschenrechnerViewPanel;
    private JButton plusButton;
    private JButton gleichButton;
    private JButton minusButton;
    private JButton malButton;
    private JButton durchButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("TaschenrechnerView");
        frame.setContentPane(new TaschenrechnerView().taschenrechnerViewPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public TaschenrechnerView() {
        JButton[] numButtons = {einsButton,zweiButton,dreiButton,vierButton,fünfButton,sechsButton,siebenButton,achtButton,neunButton,nullButton};
        for(JButton button:numButtons) {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        anzeige.setText(anzeige.getText()+button.getText());
                }
            });
        }
        TaschenrechnerModel model = new TaschenrechnerModel();
        JButton[] opButtons = {plusButton,minusButton,malButton,durchButton};
        for(JButton button:opButtons) {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        model.setErsterOperand(Integer.parseInt(anzeige.getText()));
                    } catch(Exception e1) {
                        model.setErsterOperand(0);
                    }

                    model.setOperator(button.getText());
                    anzeige.setText("");
                }
            });
        }
        gleichButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.setZweiterOperand(Integer.parseInt(anzeige.getText()));
                } catch(Exception e1){
                    model.setZweiterOperand(0);
                }
                anzeige.setText(Integer.toString(model.getErgebnis()));
                model.zurücksetzen();
            }
        });
    }

}
