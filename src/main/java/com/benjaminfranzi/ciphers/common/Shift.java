package com.benjaminfranzi.ciphers.common;

public class Shift {

        public static String use(int rot, String grip) {
            char[] splice = grip.toCharArray();

            for (int i=0; i<splice.length; i++) {
                if ((int)splice[i] >= (int)'A' && (int)splice[i] <= (int)'Z' ) {
                    splice[i] = shift(rot, splice[i], (int)'A');
                }
                if ((int)splice[i] >= (int)'a' && (int)splice[i] <= (int)'z' ) {
                    splice[i] = shift(rot, splice[i], (int)'a');
                }
            }

            return String.valueOf(splice);
        }

        private static char shift(int rot, char in, int offset) {
            int x = (int)in;
            int bd = ((x-offset)+rot)%26;
            int modif;
            try {
                modif = (((bd / Math.abs(bd)) - 1) / 2) * (-26);
            } catch (ArithmeticException e) {modif = 0;}
            x = bd + modif + offset;
            return (char)x;
        }
}

