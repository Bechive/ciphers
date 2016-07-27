package com.benjaminfranzi.ciphers;

import org.junit.Assert;
import org.junit.Test;

public class Rot13Test {
    @Test
    public void encryptPangramRot13() {
        Rot13 rot13 = new Rot13();
        String expectedOut = "Gur Dhvpx Oebja Sbk Whzcrq Bire Gur Ynml Qbt";
        String actualOut = rot13.encrypt(0, "The Quick Brown Fox Jumped Over The Lazy Dog");
        Assert.assertEquals(expectedOut,actualOut);
    }

    @Test
    public void dencryptPangramRot13() {
        Rot13 rot13 = new Rot13();
        String expectedOut = "The Quick Brown Fox Jumped Over The Lazy Dog";
        String actualOut = rot13.decrypt(0, "Gur Dhvpx Oebja Sbk Whzcrq Bire Gur Ynml Qbt");
        Assert.assertEquals(expectedOut,actualOut);
    }

    @Test
    public void encryptSymbols() {
        Rot13 rot13 = new Rot13();
        String expectedOut = "@!(~~@#";
        String actualOut = rot13.encrypt(0, "@!(~~@#");
        Assert.assertEquals(expectedOut,actualOut);
    }
}
