import java.util.Scanner;

public class printName
{
private static String Username = "javacave";
private static String Password = "welcome1";

public static void main(String[] args)
{
    System.out.println("Please enter username");
    Scanner in = new Scanner(System.in);
    String UN = in.nextLine();

    System.out.println("Please enter password");
    Scanner inn = new Scanner(System.in);
    String PW = inn.nextLine();

    if (UN == Username && PW == Password)
    {
        System.out.println("User has logged in successfully!");
    }
    else {
        System.out.println("You have entered the wrong credentials, please try again.");
    }
}
 }
