import java.util.Scanner;

public class switchStatement {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();

        switch(days){
             
            //  case 1 -> System.out.println("Monday");
            //  case 2 -> System.out.println("Tuesday");
            //  case 3 -> System.out.println("Wednesday");
            //  case 4 -> System.out.println("Thursday");
            //  case 5 -> System.out.println("Friday");
            //  case 6 -> System.out.println("Saturday");
            //  case 7 -> System.out.println("Sunday");
            //  default -> System.out.println("Invalid input");


            case 1 : 
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            
            default : 
                System.out.println("Invalid Input");
        }
    }
}
