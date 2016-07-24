package ciphers.common;

public class Shift {

    public static String use(int rot, String grip) {
        char[] splice = grip.toCharArray();

        for (int i=0; i<splice.length; i++) {
            if ((int)splice[i] >= 65 && (int)splice[i] <= 90 ) {
                splice[i] = shift(rot, splice[i], 65);
            }
            if ((int)splice[i] >= 97 && (int)splice[i] <= 122 ) {
                splice[i] = shift(rot, splice[i], 97);
            }
        }

        return String.valueOf(splice);
    }

    private static char shift(int rot, char in, int offset) { //65 offset for Upper, 97 offset for Lower
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
