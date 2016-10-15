package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AnimatedLabel extends JPanel {
    private JTextArea label;
    private int charIndex = 0;

    public AnimatedLabel(ResourceBundle traductor, String text) {
        setLayout(new GridBagLayout());
        label = new JTextArea();
        label.setFont(new Font("Serif", Font.PLAIN, 20));
        label.setBackground(Color.WHITE);
        add(label);
        Timer timer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String labelText = label.getText();
                labelText += text.charAt(charIndex);
                label.setText(labelText);
                charIndex++;
                if (charIndex >= text.length()) {
                    ((Timer)e.getSource()).stop();
                }
            }
        });
        timer.start();
        label.setEnabled(false);
    }
}
