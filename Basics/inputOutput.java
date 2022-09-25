import java.util.Scanner;

class inputOutput {
    public static void main (String [] args)
    {
      Scanner sc = new Scanner(System.in);
      String str= sc.nextLine();
      
      System.out.println("You entered a String "+ str);

      Integer num = sc.nextInt();
      
      System.out.println("You entered a Number " + num);

      Float f = sc.nextFloat();

      System.out.println("You entered a float" + f);
   
    }
}