package com.benjaminfranzi.user.controller;

import com.benjaminfranzi.ciphers.*;
import com.benjaminfranzi.ciphers.Init;
import com.sun.glass.ui.SystemClipboard;
import javafx.beans.binding.Bindings;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class MainController {
    @FXML ComboBox<Cipher> mainCb;
    @FXML ComboBox<Integer> intCb;
    @FXML TextArea inputTa;
    @FXML TextArea outputTa;
    @FXML CheckBox decryptCh;

    private Init init = new Init();
    ObservableList<Cipher> ciphers = init.getCiphers();

    @FXML
    public void initialize() {
        mainCb.setItems(ciphers);
        System.out.println("X: " + init.getCiphers().toString());
        for (int i=0; i<=20; i++) intCb.getItems().add(i);
        mainCb.setValue(ciphers.get(0));


        intCb.disableProperty().bind(mainCb.getSelectionModel().getSelectedItem().hasSpinner());
    }

    public void handleUse() throws Exception {
        Cipher cipher = mainCb.getValue();
        Boolean decrypt = decryptCh.isSelected();
        if (!(decrypt)) outputTa.setText(cipher.encrypt(intCb.getSelectionModel().getSelectedItem(), inputTa.getText()));
        if (decrypt) outputTa.setText(cipher.decrypt(intCb.getSelectionModel().getSelectedItem(), inputTa.getText()));
    }
}
