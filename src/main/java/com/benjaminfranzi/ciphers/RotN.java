package com.benjaminfranzi.ciphers;

import com.benjaminfranzi.ciphers.common.Shift;

public class RotN {
    public String encrypt(int rot, String grip) {
        return Shift.use(rot, grip);
    }
    public String decrypt(int rot, String grip) {
        return Shift.use(-rot, grip);
    }
}
