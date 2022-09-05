import java.util.Scanner;
public class PerfectSquare {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number: ");
            double s;
            int a;
            a = sc.nextInt(); //n=4
             s=Math.sqrt(a); //2
            if (a==s*s) //4==2*2
            {
                System.out.println( " perfect square");
            }
            else
                System.out.println("  not perfect square");
        }
    }

