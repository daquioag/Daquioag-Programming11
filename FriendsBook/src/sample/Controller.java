package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class Controller {
    public ListView friendList;
    public TextField textGetName;
    public TextField textGetJob;
    public TextField textGetAge;
    public Label lblName;
    public Label lblJob;
    public Label lblAge;


    public void addFriend(ActionEvent actionEvent) {
        String name = textGetName.getText();
        String job = textGetJob.getText();
        int age = Integer.parseInt(textGetAge.getText());
        Friend Temp = new Friend(name, job, age);
        friendList.getItems().add(Temp);
        textGetName.clear();
        textGetJob.clear();
        textGetAge.clear();

    }

    public void displayFriends(MouseEvent mouseEvent) {
        Friend Temp;
        Temp = (Friend) friendList.getSelectionModel().getSelectedItem();
        lblName.setText(Temp.name);
        lblJob.setText(Temp.job);
        lblAge.setText(Integer.toString(Temp.getAge()));
    }

    public void deleteFriend(ActionEvent actionEvent) {

        friendList.getItems().remove(friendList.getSelectionModel().getSelectedItem());
        textGetName.clear();
        lblName.setText("");
        lblJob.setText("");
        lblAge.setText("");

    }
}
