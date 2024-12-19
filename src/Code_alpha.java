




    public class WordCounter extends JFrame {
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

            // Add components to the frame
            add(new JScrollPane(textArea), BorderLayout.CENTER);
            add(countButton, BorderLayout.SOUTH);
            add(resultLabel, BorderLayout.NORTH);
        }

        // Method to count words
        private int countWords(String text) {
            if (text == null || text.isEmpty()) {
                return 0;
            }
            String[] words = text.trim().split("\\s+");
            return words.length;
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                WordCounter wordCounter = new WordCounter();
                wordCounter.setVisible(true);
            });
        }
    }


