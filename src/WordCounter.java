import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounter  extends JFrame{

        private JTextArea textArea;
        private JButton countButton;
        private JLabel resultLabel;

        public WordCounter() {
            // Set up the frame
            setTitle("Word Counter");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());

            // Create components
            textArea = new JTextArea();
            countButton = new JButton("Count Words");
            resultLabel = new JLabel("Word Count: 0");

            // Add action listener to the button
            countButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = textArea.getText();
                    int wordCount = countWords(text);
                    resultLabel.setText("Word Count: " + wordCount);
                }
            });
        