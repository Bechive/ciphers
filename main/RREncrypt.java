public class RREncrypt
{



  public static String RREncrypt(String inputCipher, int depth)
  {
      int p = inputCipher.length();
      int c = p/((2*depth) - 2);

      String grd[][]= new String[depth][p/depth];

      //For 1st and nth rows
      int i=0, k=0, j=0;
      for (j=i; j<p; j+= ((2*depth)-2))
      {
        grd[i][k] = String.valueOf(inputCipher.charAt(j));
        k++;
      }

      i=depth-1; k=0;
      for (j=i; j<p; j+= ((2*depth)-2))
      {
        grd[i][k] = String.valueOf(inputCipher.charAt(j));
        k++;
      }


      //For all rows




      //returns text
      String outputCipher = "";
      String hld = "";
      for(i=0; i<depth; i++)
      {
        for(j=0; j<(p/depth); j++)
        {
          hld = String.valueOf(grd[i][j]);
          if (hld.length() == 1)
          {
          outputCipher+=grd[i][j];
          }
        }
        outputCipher+=" ";
      }

      return outputCipher;
  }
}
