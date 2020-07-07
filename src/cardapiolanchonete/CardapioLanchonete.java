package cardapiolanchonete;
import java.util.Scanner;
public class CardapioLanchonete 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int qt;
        double pc;
        String cd;
        
        System.out.println(" código    opção               preço");
        System.out.println("(C)        Cachorro Quente     R$2");
        System.out.println("(R)        Refrigerante        R$2,5");
        System.out.println("(S)        Sobremesa           R$1,5");
        
        System.out.print("Digite o Codigo do Alimento: ");
        cd = sc.nextLine();
        
        System.out.print("informe quantas unidades: ");
        qt = sc.nextInt();
        
        int i = 1;
        double pcn = 0;
        
        while(i!=0)
        {
            if("C".equals(cd))
            {
                pc = 2 * qt;
                System.out.println(qt+ " Cachorro(s) Quente(s) custa R$"+pc);
                pcn += pc;
            }

            if("R".equals(cd))
            {
                pc = 2.5*qt;
                System.out.println(qt+ " Refrigerante(s) custa R$"+pc);
                pcn += pc;
            }

            if("S".equals(cd))
            {
                pc = 1.5*qt;
                System.out.println(qt+ " Sobremesa(s) custa R$"+pc);
                pcn += pc;
            }
            else 
            {
                System.out.println("Informe o código em letra MAIUSCULA!");
            }

            System.out.print("Sair? Digite X: ");
            String ss = sc.next();
            
            if("X".equals(ss))
            {
                System.out.println("Então no total fica: R$"+ pcn);
                i = 0;
            }
            else 
            {
                System.out.print("Digite o Codigo do Alimento: ");
                cd = sc.next();
                System.out.print("informe quantas unidades: ");
                qt = sc.nextInt();
                i = 1;
            }
            System.out.println();
        }
    }
}
