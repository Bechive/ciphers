package com.benjaminfranzi.ciphers;

import com.benjaminfranzi.ciphers.common.Shift;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableBooleanValue;
import javafx.collections.FXCollections;

public class Rot13 implements Cipher {
    private ObservableBooleanValue spinner = new SimpleBooleanProperty(false);

    public String encrypt(int rot, String grip) { return Shift.use(13, grip);}
    public String decrypt(int rot, String grip) {return Shift.use(-13, grip);}
    public ObservableBooleanValue hasSpinner() {return spinner;}
    @Override public String toString() {return "Rot13";}
}
