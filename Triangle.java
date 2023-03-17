import java.util.Scanner;

public class Triangle {
    public static void print_triangle(int N)
    {
        int row=N;
        int column = (2*row)+1;
        int cos = (column-1)/2;
        int[][] triangle= new int[row][column];
        for (int i=0;i<row;i++)
        {
            int min = cos-(i+1);
            int max = cos+(i+1);
            for (int j=0;j<column;j++)
            {
                if (j<=min || j>=max)
                {
                    triangle[i][j]=0;
                }
                else if(i==0)
                {
                    triangle[i][j]=1;
                }
                else
                {
                    triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j+1];
                }
            }
        }
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę rzędów: ");
        int row =scanner.nextInt();
        print_triangle(row);
    }
}