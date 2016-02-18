import java.util.Scanner;

public class main
{
  public static void main(String[] args)
  {
      Scanner scn = new Scanner(System.in);
      System.out.print("Enter here: ");
      String inputCipher = scn.next();

      System.out.print("Enter number of lines: ");
      int linesNo = scn.nextInt();

      String outputCipher = RREncrypt.RREncrypt(inputCipher, linesNo);

      System.out.println("Cipher text: " + outputCipher);
  }
}
