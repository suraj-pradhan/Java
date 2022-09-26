import java.util.Scanner;

public class Fibo {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        int preNum = 0;
        int nextNum = 1;

        for(int count = 2;count <= index; index--)
        {
            int temp = nextNum;
            nextNum = preNum + nextNum;
            preNum = temp;
        }
        System.out.println(nextNum);
    }
}
