import java.util.Scanner;

public class main
{
  public static void main(String[] args)
  {
      Scanner scn = new Scanner(System.in);
      System.out.print("Enter here: ");
      String inputCipher = scn.next();

      String outputCipher = RREncrypt.RREncrypt("1");

      System.out.println("Cipher text: " + outputCipher);
  }
}
