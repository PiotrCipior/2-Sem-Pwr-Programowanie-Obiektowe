import java.util.Scanner;
public class Printer
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj do jakiej wartosci chesz wypisac liczby parzyste: ");
        int podanaWartosc= scanner.nextInt();
        print_even(podanaWartosc);
    }
    public static void print_even(int N)
    {
        for (int i = 0;i<N;i++)
        {
            if (i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}