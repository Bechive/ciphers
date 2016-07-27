package com.benjaminfranzi.ciphers;

import com.benjaminfranzi.ciphers.common.Cipher;
import com.benjaminfranzi.ciphers.common.Shift;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableBooleanValue;

public class Caesar implements Cipher {
    private ObservableBooleanValue spinner = new SimpleBooleanProperty(false);

    public String encrypt(int rot, String grip) {return Shift.use(1, grip);}
    public String decrypt(int rot, String grip) {
        return Shift.use(-1, grip);
    }
    public ObservableBooleanValue hasSpinner() {return spinner;}
    @Override public String toString() {return "Caesar";}
}
