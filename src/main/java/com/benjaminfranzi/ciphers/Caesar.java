package com.benjaminfranzi.ciphers;

import com.benjaminfranzi.ciphers.common.Shift;

public class Caesar {
    public String encrypt(String grip) {
        return Shift.use(1, grip);
    }
    public String decrypt(String grip) {
        return Shift.use(-1, grip);
    }
}
