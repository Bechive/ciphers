package ciphers;

import ciphers.common.Shift;

public class Caesar {
    public static String encrypt(String grip) {
       return Shift.use(1, grip);
    }
    public static String decrypt(String grip) {
        return Shift.use(-1, grip);
    }
}