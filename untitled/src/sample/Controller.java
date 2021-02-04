package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class Controller {
    public Label lblGame;
    public CheckBox cbHeads;
    public CheckBox cbTails;
    public Label lblWL;
    public Label lblWins;
    public Label lblLoses;
    int wins = 0;
    int loses = 0;
    @FXML
    public void heads(){
        if (cbHeads.isSelected()){
            cbTails.setSelected(false);
        }
    }
    @FXML
    public void tails() {
        if (cbTails.isSelected()) {
            cbHeads.setSelected(false);
        }
    }

    public void flipCoin(ActionEvent actionEvent) {
        int random = ((int) (Math.random() * 2) + 1);
        if (cbHeads.isSelected()) {
            if (random == 1) {
                lblGame.setText("The coin landed on Heads!");
                lblWL.setText("You win!");
                wins ++;

            }
            else {
                lblGame.setText("The coin landed on Tails!");
                lblWL.setText("You lose!");
                loses ++;

            }
        }
        if (cbTails.isSelected()) {

            if (random == 1) {
                lblGame.setText("The coin landed on heads!");
                lblWL.setText("You Lose!");
                loses++;

            }
            else {
                lblGame.setText("The coin landed on Tails!");
                lblWL.setText("You win!");
                wins++;
            }

        }
        lblLoses.setText(Integer.toString(loses));
        lblWins.setText(Integer.toString(wins));
    }
}


