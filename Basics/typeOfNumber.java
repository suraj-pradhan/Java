import java.util.Scanner;

public class typeOfNumber {
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        Integer num = sc.nextInt();

        if(num>0)
        {
            if(num%2 == 0 )
            {
                System.out.println("Even number");
                return;
            }
            else 
            {
                System.out.println("Odd Number");
                return;
            }   
        }

        if(num<0)
        {
            if(num%2 == 0 )
            {
                System.out.println("Even Number ");
                return;
            }

            else 
            {
                System.out.println("Odd Number");
                return;
            }
        }

        else 
            {
                System.out.println("Zero");
            }
     }
}
