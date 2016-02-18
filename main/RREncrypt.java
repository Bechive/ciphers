public class RREncrypt
{
  public static String RREncrypt(String inputCipher, int linesNo)
  {
      int i;
      int p = inputCipher.length();
      String[] lines;
      lines = new String[linesNo];

      lines[0] = "";
      lines[1] = " ";
      lines[2] = " ";

      //For the first line
      for (i=0; i<p; i+= (linesNo-1)*2)
      {
        lines[0] += inputCipher.charAt(i);
      }

      //For the second line
      for (i=1; i<p; i+=(2))
      {
        lines[1] += inputCipher.charAt(i);
      }

      //For the last line
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
