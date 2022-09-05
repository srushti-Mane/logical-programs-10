import java.util.Scanner;
public class AbundantNumber {
    //Abundant number==sum of all its proper factors larger than the number.
        public static void main (String[]args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int n =sc.nextInt();
            int sum = 0;
            for (int i = 1; i < n; i++)
            {
                if (n % i == 0)
                    sum = sum + i;
            }
            if (sum > n)
            {
                System.out.println (n + " is an Abundant Number");
            }
            else
                System.out.println (n + " is not an Abundant Number");
        }
    }

