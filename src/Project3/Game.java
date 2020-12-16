package Project3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Game extends JPanel{
    private JButton[] buttons = new JButton[9];
    private boolean turnX= true;



    public Game() {
        this.setLayout(new GridLayout(  3,  3));
        for (int i = 0; i < 9; i++)  {
            buttons [i] = new JButton();
            this.add(buttons[i]);
            buttons[i].setText("_");
            buttons[i].addActionListener(new buttonListener());

        }
    }

    private class buttonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton buttonClicked = (JButton) e.getSource();

            if (buttonClicked.getText() == "_") {

                if (turnX) {
                    buttonClicked.setText("X");
                    turnX = false;
                } else {
                    buttonClicked.setText("O");
                    turnX = true;
                }

                if (buttons[0].getText().equals(buttons[1].getText()) && buttons[1].getText().equals(buttons[2].getText()));
                    if (buttons[3].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[5].getText()));
                    if (buttons[6].getText().equals(buttons[7].getText()) && buttons[7].getText().equals(buttons[8].getText()));
                    if(buttons [0].getText().equals(buttons[3].getText())&& buttons[3].getText().equals(buttons[6].getText()));
                    if(buttons [1].getText().equals(buttons[4].getText())&& buttons[4].getText().equals(buttons[7].getText()));
                    if(buttons [2].getText().equals(buttons[5].getText())&& buttons[5].getText().equals(buttons[8].getText()));
                    if(buttons [0].getText().equals(buttons[4].getText())&& buttons[4].getText().equals(buttons[2].getText()));
                    if(buttons [2].getText().equals(buttons[4].getText())&& buttons[4].getText().equals(buttons[6].getText()));



            }
        }


    }
}

