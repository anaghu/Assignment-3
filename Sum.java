import java.util.Scanner;
class Sum{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i = 1, sum = 0;
        int n;
        System.out.println("enter a number n:");
        n=sc.nextInt();

        while(i <= n)
        {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}
