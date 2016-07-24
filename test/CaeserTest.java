package test;

import ciphers.Caesar;

public class CaeserTest {

    private String failed = "Caesar: { ";
    private int count = 0;
    private String[] input = {"abcd", "lnmposeiq", "ben is cool", "The Quick Brown Fox Jumped Over The Lazy Dog", "@!(~~@#"};
    private String[] expected = {"bcde", "monqptfjr", "cfo jt dppm", "Uif Rvjdl Cspxo Gpy Kvnqfe Pwfs Uif Mbaz Eph", "@!(~~@#"};

    public void use() {
        System.out.println("#####CAESERTEST#####");
        for (int i=0; i<input.length; i++) {
         reporter(input[i], expected[i]);
        }
        System.out.println(failed + "}");
        System.out.println();

    }

    private void reporter(String input, String expected) {
        //test encrypt
        if (!(Caesar.encrypt(input).equals(expected))) {
            failed += count + " ";
        }
        //test decrypt
        if (!(Caesar.decrypt(Caesar.encrypt(input)).equals(input))) {
            failed += count + " ";
        }
        count++;
        System.out.println(input + " | enc: " + Caesar.encrypt(input) + " | dec: " + Caesar.decrypt(input));
    }
}
