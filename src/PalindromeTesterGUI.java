import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PalindromeTesterGUI {
    private RecursivePalindromeSolver solver;
    private JTextField inputTF;
    private JLabel title;
    private JButton checkButton;
    private JLabel resultLabel;
    private JPanel rootGUI;

    public PalindromeTesterGUI() {
        solver = new RecursivePalindromeSolver();
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (solver.isPalindrome(inputTF.getText()))
                    resultLabel.setText("is a Palindrome       ");
                else
                    resultLabel.setText("is not a Palindrome   ");
            }
        });
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        JFrame frame = new JFrame("PalindromeTesterGUI");
        frame.setContentPane(new PalindromeTesterGUI().rootGUI);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setVisible(true);
    }
}
