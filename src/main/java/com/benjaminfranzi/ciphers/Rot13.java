package com.benjaminfranzi.ciphers;

import com.benjaminfranzi.ciphers.common.Shift;

public class Rot13 {
    public String encrypt(String grip) {
        return Shift.use(13, grip);
    }
    public String decrypt(String grip) {
        return Shift.use(-13, grip);
    }
}
