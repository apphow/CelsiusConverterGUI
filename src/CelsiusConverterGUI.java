import javax.swing.*;
// https://www.youtube.com/watch?v=-SmNpKskfJc

public class CelsiusConverterGUI extends JFrame{
    private JPanel mainPanel;
    private JButton Convert;
    private JTextField textField1;
    private JLabel Celsius;
    private JLabel Fahrenheit;

    public CelsiusConverterGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new CelsiusConverterGUI("Celsius Converter");
        frame.setVisible(true);
    }
}
