import java.util.Scanner;

public class FirstJavaCode{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your name:");
    String myName = in.nextLine();
    System.out.println("Hello Earthling "+myName);
    in.close(); 
  }
}