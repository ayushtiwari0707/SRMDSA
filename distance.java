import java.util.Scanner;
public class ay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int n = sc.nextInt();
        int step = n / 5;
        if (n % 5 == 0)
        {
            System.out.println("The shortest distance is: " + step);
        }
        else
        {
            System.out.println("The shortest distance is: " + (step + 1));
        }

        
    }
}
