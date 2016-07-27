package com.benjaminfranzi.ciphers.common;

import com.benjaminfranzi.ciphers.Caesar;
import com.benjaminfranzi.ciphers.Cipher;
import com.benjaminfranzi.ciphers.Rot13;
import com.benjaminfranzi.ciphers.RotN;
import javafx.collections.ObservableList;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by epic on 27/07/16.
 */
public class Init {
    static LinkedList<Cipher> ciphers = new LinkedList<>();
    public Init() {
        ciphers.add(new Caesar());
        ciphers.add(new Rot13());
        ciphers.add(new RotN());
    }

    public static LinkedList<Cipher> getCiphers() {return ciphers;}
}
