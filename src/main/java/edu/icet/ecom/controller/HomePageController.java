package edu.icet.ecom.controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.awt.*;

public class HomePageController {

    @FXML
    private TextField txtAdd;

    @FXML
    private ListView txtListview;




    @FXML
    void btnAddOnAction(ActionEvent event) {

        String task = txtAdd.getText();
        CheckBox checkBox = new CheckBox(task);

        txtListview.getItems().add(checkBox);

        if (checkBox.isSelected()) {
            System.out.println("SELECTED");
                 }
    }
    @FXML
    void btnDeleteOnAction(ActionEvent event) {

        int selectedID = txtListview.getSelectionModel().getSelectedIndex();
        txtListview.getItems().remove(selectedID);
    }
}
