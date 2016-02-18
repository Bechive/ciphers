public class RREncrypt
{
  public static String RREncrypt(String inputCipher, int linesNo)
  {
      int i;
      int q; //for the middle lines
      int p = inputCipher.length();
      String[] lines;
      lines = new String[linesNo];

      //For the first line
      lines[0] = "";
      for (i=0; i<p; i+= (linesNo-1)*2)
      {
        lines[0] += inputCipher.charAt(i);
      }

      //For multiple lines
      for (q=0; q<linesNo-1; q++)
      {
      lines[q] = " ";
        for (i=q; i<p; i+=2)
        {
          lines[q] += inputCipher.charAt(i);
        }
      }

      //For the last line
      lines[linesNo-1] = " ";
      for (i=linesNo-1; i<p; i+= (linesNo-1)*2)
      {
        lines[2] += inputCipher.charAt(i);
      }

      String outputCipher = "";
      for (i=0; i<linesNo; i++)
      {
        outputCipher += lines[i];
      }
      return outputCipher;
  }
}
