import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CelsiusConverterGUI extends JFrame{
    private JPanel mainPanel;
    private JButton Convert;
    private JTextField celsiusTextField;
    private JLabel Celsius;
    private JLabel Fahrenheit;

    public CelsiusConverterGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        Convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // grab the text from the CelsiusTextField
                // convert to a double
                // update the FahrenheitLabel
                // parse degrees celsius
                int tempFahr = (int)((Double.parseDouble(celsiusTextField.getText()))
                * 1.8 + 12);
                Fahrenheit.setText(tempFahr + " Fahrenheit");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new CelsiusConverterGUI("Celsius Converter");
        frame.setVisible(true);
    }
}
