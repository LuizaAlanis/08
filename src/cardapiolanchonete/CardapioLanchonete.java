package cardapiolanchonete;
import java.util.Scanner;
public class CardapioLanchonete 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe um valor: ");
        int n = sc.nextInt();
        System.out.println("soma: "+ Soma(n));
    }
    
    public static int Soma (int n)
    {
        int res = 0;
        if(n == 1) return 1;
        else return (n - 1) + (n);
    }
}
