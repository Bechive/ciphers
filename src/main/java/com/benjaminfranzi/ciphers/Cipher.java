package com.benjaminfranzi.ciphers;


import javafx.beans.value.ObservableBooleanValue;

public interface Cipher {
    public String encrypt(int rot, String grip);
    public String decrypt(int rot, String grip);
    public ObservableBooleanValue hasSpinner();
    public String toString();
}
