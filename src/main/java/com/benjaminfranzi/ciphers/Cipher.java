package com.benjaminfranzi.ciphers;

public interface Intialize {
    public String encrypt(int rot, String grip);
    public String decrypt(int rot, String grip);
    public String toString();
}
