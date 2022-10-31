import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class NumberGuessingWithACounter extends JFrame
        implements ActionListener {

    private JTextField guessField;
    private JLabel guessLabel, resultLabel;
    private JButton guessButton;
    private int number, counter;

    public NumberGuessingWithACounter() {
        super("Number Guessing Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        guessLabel = new JLabel("Enter your guess: ");
        add(guessLabel);
        guessField = new JTextField(5);
        add(guessField);
        guessButton = new JButton("Guess");
        add(guessButton);
        resultLabel = new JLabel("");
        add(resultLabel);
        guessButton.addActionListener(this);
        setSize(400, 90);
        setVisible(true);
        number = (int) (Math.random() * 100) + 1;
        counter = 0;
    }

    public void actionPerformed(ActionEvent e) {
        int guess = Integer.parseInt(guessField.getText());
        counter++;
        if (guess == number) {
            resultLabel.setText("Correct! You guessed it in "
                    + counter + " tries.");
        } else if (guess < number) {
            resultLabel.setText("Your guess is too low, guesses made: "
                    + counter);
        } else if (guess > number) {
            resultLabel.setText("Your guess is too high, guesses made: "
                    + counter);
        }
    }

    public static void main(String[] args) {
        new NumberGuessingWithACounter();
    }
}
