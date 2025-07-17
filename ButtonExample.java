import javax.swing.*;
import java.awt.event.*;
public class ButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example");
        JButton button = new JButton("Click Me");

        // Register an ActionListener
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle the button click event
                System.out.println("Button clicked!");
            }
        });

        frame.add(button);
        frame.setSize(300, 150);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
