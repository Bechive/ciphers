package com.benjaminfranzi.ciphers;

import org.junit.Assert;
import org.junit.Test;

public class CaesarTest {

    @Test
    public void encryptPangram() {
        Caesar caesar = new Caesar();
        String expectedOut = "Uif Rvjdl Cspxo Gpy Kvnqfe Pwfs Uif Mbaz Eph";
        String actualOut = caesar.encrypt(0, "The Quick Brown Fox Jumped Over The Lazy Dog");
        Assert.assertEquals(expectedOut,actualOut);
    }

    @Test
    public void decryptPangram() {
        Caesar caesar = new Caesar();
        String expectedOut = "The Quick Brown Fox Jumped Over The Lazy Dog";
        String actualOut = caesar.decrypt(0, "Uif Rvjdl Cspxo Gpy Kvnqfe Pwfs Uif Mbaz Eph");
        Assert.assertEquals(expectedOut,actualOut);
    }

    @Test
    public void encryptSymbols() {
        Caesar caesar = new Caesar();
        String expectedOut = "@!(~~@#";
        String actualOut = caesar.encrypt(0, "@!(~~@#");
        Assert.assertEquals(expectedOut,actualOut);
    }

}
