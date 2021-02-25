package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;

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
        Double age = Double.parseDouble(textGetAge.getText());
        Friend Temp = new Friend(name, job, age);
        friendList.getItems().add(Temp);
        textGetName.clear();
        textGetJob.clear();
        textGetAge.clear();
        // friendList.getItems.add(new Friend(textGetName.getText(), text.GetJob.getText(), Double)

    }

    public void displayFriends(MouseEvent mouseEvent) {
        Friend Temp;
        Temp = (Friend) friendList.getSelectionModel().getSelectedItem();
        lblName.setText(Temp.name);
        lblJob.setText(Temp.job);
        lblAge.setText(Double.toString(Temp.getAge()));
    }

    public void deleteFriend(ActionEvent actionEvent) throws IOException {

        friendList.getItems().remove(friendList.getSelectionModel().getSelectedItem());
        textGetName.clear();
        lblName.setText("");
        lblJob.setText("");
        lblAge.setText("");
        friendList.getItems().clear();

        ArrayList<Friend> friends = DeleteFriend.createAllProducts("Friend.txt");
        for (Friend f: friends){
            friendList.getItems().remove(f);
        }

    }

    public void saveFriend(ActionEvent actionEvent) throws IOException {
        ObservableList<Friend> myList = friendList.getItems();
        for (Friend f: myList){
            f.writeToFile();
        }
        friendList.getItems().clear();

    }

    public void loadFriend(ActionEvent actionEvent) throws IOException {
        friendList.getItems().clear();
        ArrayList<Friend> friends = CreateFriend.createAllProducts("Friend.txt");
        for (Friend f: friends){
            friendList.getItems().add(f);
        }
    }
}

