package com.benjaminfranzi.ciphers.common;

import com.benjaminfranzi.ciphers.common.Shift;
import org.junit.*;

public class ShiftTest {
    @Test
    public void encryptPangramRot13() {
        String expectedOut = "Gur Dhvpx Oebja Sbk Whzcrq Bire Gur Ynml Qbt";
        String actualOut = Shift.use(13, "The Quick Brown Fox Jumped Over The Lazy Dog");
        Assert.assertEquals(expectedOut,actualOut);
    }

    @Test
    public void encryptPangramRot3() {
        String expectedOut = "Wkh Txlfn Eurzq Ira Mxpshg Ryhu Wkh Odcb Grj";
        String actualOut = Shift.use(3, "The Quick Brown Fox Jumped Over The Lazy Dog");
        Assert.assertEquals(expectedOut,actualOut);
    }

    @Test
    public void decryptPangramRot7() {
        String expectedOut = "The Quick Brown Fox Jumped Over The Lazy Dog";
        String actualOut = Shift.use(-7, "Aol Xbpjr Iyvdu Mve Qbtwlk Vcly Aol Shgf Kvn");
        Assert.assertEquals(expectedOut,actualOut);
    }

    @Test
    public void parseSymbols() {
        String expectedOut = "!@#$%^&*()RStu";
        String actualOut = Shift.use(17, "!@#$%^&*()ABcd");
        Assert.assertEquals(expectedOut,actualOut);
    }
}
