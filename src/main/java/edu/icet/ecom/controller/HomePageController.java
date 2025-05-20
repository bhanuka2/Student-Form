package edu.icet.ecom.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class HomePageController {

    @FXML
    private TextField txtAdd;

    @FXML
    private ListView txtListview;

    @FXML
    void btnAddOnAction(ActionEvent event) {

        String Task=txtAdd.getText();
        CheckBox checkBox=new CheckBox(Task);

        txtListview.getItems().add(checkBox);
        new Alert(Alert.AlertType.CONFIRMATION ,"Added Successfully").show();

    }

}
