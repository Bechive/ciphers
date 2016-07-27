package com.benjaminfranzi.ciphers.common;

import com.benjaminfranzi.ciphers.Caesar;
import com.benjaminfranzi.ciphers.Rot13;
import com.benjaminfranzi.ciphers.RotN;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Created by epic on 27/07/16.
 */
public class Init {
    private ObservableList<Cipher> ciphers = FXCollections.observableArrayList();
    public Init() {
        ciphers.add(new Caesar());
        ciphers.add(new Rot13());
        ciphers.add(new RotN());
    }

    public ObservableList<Cipher> getCiphers() {return ciphers;}
}
