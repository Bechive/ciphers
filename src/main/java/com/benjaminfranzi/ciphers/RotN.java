package com.benjaminfranzi.ciphers;

import com.benjaminfranzi.ciphers.common.Cipher;
import com.benjaminfranzi.ciphers.common.Shift;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableBooleanValue;

public class RotN implements Cipher {
    private ObservableBooleanValue spinner = new SimpleBooleanProperty(true);

    public String encrypt(int rot, String grip) {
        return Shift.use(rot, grip);
    }
    public String decrypt(int rot, String grip) {
        return Shift.use(-rot, grip);
    }
    public ObservableBooleanValue hasSpinner() {return spinner;}
    @Override public String toString() {return "RotN";}
}
