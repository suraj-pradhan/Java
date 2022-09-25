import java.util.Scanner;

public class ifElse {

    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);

        Integer num = sc.nextInt();

        if(num%2 == 0 )
            {
                System.out.println("Even number");
            }

        else 
            {
                System.out.println("Odd number");
            }
    }
    
}
