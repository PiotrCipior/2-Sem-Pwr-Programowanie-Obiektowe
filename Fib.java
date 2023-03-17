import java.util.Scanner;

public class Fib
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj n-ty wyraz który chcesz obliczyc: ");
        int ntyWyraz= scanner.nextInt();
        System.out.println("n-ty wyraz ciagu fibbonaciego metoda iteracyjna: " + fibbI(ntyWyraz));
        System.out.println("n-ty wyraz ciagu fibbonaciego metoda rekurencyjnie: " + fibbR(ntyWyraz));
    }
    public static int fibbI(int n)
    {
        int a=0, b=1;
        for(int i=0;i<n;i++)
        {
            b+=a;
            a = b-a;
        }
        return a;
    }
    public static int fibbR(int n)
    {
        if (n<3)
        {
         return 1;
        }
        return fibbR(n-2)+fibbR(n-1);
    }
}
