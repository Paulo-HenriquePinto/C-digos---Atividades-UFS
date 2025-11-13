package Atividade3;
import java.util.Scanner;

public class questão8 {

    public static void main(String[] args){
        int ano;
        int mês;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int anoescolhido = scan.nextInt();

        System.out.println("Digite o mês: ");
        int mêsescolhido = scan.nextInt();

        ano = anoescolhido;
        mês = mêsescolhido;

        switch(mês){
             case 1: case 3: case 5: case  7: case 8: case 10: case 12:    
               System.out.println("31 Dias");
               break;
            case 4: case 6: case 9: case 11:
               System.out.println("30 Dias");
               break;
            case 2:
               if (ano%100==0 && ano%400!= 0)
                 System.out.println("28 Dias");
               else if (ano%100==0 && ano%400==0)
                 System.out.println("29 Dias");
               else if (ano%4==0 && ano%100!=0)
                 System.out.println("29 Dias");
               else 
                 System.out.println("28 Dias");
            break;
        
            default:
               break;

        }

    }
    
}
