import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class RockPaperScissorGUI extends JFrame implements ActionListener {
    private JButton rockButton, paperButton, scissorButton;
    private JLabel resultLabel, computerChoiceLabel;

    public RockPaperScissorGUI() {
        setTitle("Rock Paper Scissor Game");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        rockButton = new JButton("Rock");
        paperButton = new JButton("Paper");
        scissorButton = new JButton("Scissor");

        rockButton.addActionListener(this);
        paperButton.addActionListener(this);
        scissorButton.addActionListener(this);

        add(rockButton);
        add(paperButton);
        add(scissorButton);

        computerChoiceLabel = new JLabel("Computer chose: ");
        resultLabel = new JLabel("Result: ");
        add(computerChoiceLabel);
        add(resultLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String[] choices = {"Rock", "Paper", "Scissor"};
        String computer = choices[new Random().nextInt(3)];
        String player = e.getActionCommand();

        computerChoiceLabel.setText("Computer chose: " + computer);

        if (player.equals(computer)) {
            resultLabel.setText("Result: It's a draw!");
        } else if (
                (player.equals("Rock") && computer.equals("Scissor")) ||
                        (player.equals("Paper") && computer.equals("Rock")) ||
                        (player.equals("Scissor") && computer.equals("Paper"))
        ) {
            resultLabel.setText("Result: You win!");
        } else {
            resultLabel.setText("Result: Computer wins!");
        }
    }

    public static void main(String[] args) {
        new RockPaperScissorGUI();
    }
}

