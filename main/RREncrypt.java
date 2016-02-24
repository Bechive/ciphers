public class RREncrypt
{
  public static String RREncrypt(String inputCipher, int linesNo)
  {
      int i;
      int q; //for the middle lines
      int p = inputCipher.length();
      String[] lines;
      lines = new String[linesNo];

      //For all lines
      for (q=1; q<linesNo-1; q++)
      {
      lines[q] = "";
        for (i=q; i<p; i+=2)
        {
          lines[q] += inputCipher.charAt(i);
        }
      }

      //returns text
      String outputCipher = "";
      for (i=0; i<linesNo; i++)
      {
        outputCipher += " " + lines[i] + " ";
      }
      return outputCipher;
  }
}
