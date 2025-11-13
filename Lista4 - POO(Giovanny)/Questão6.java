package Atividade3;
import java.util.Scanner;

public class questão6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de KWh consumidos: ");
        double KWhconsumidos = scan.nextDouble();

        double preço;

        if (KWhconsumidos<=99)
          preço = KWhconsumidos*1.35;
        else if (KWhconsumidos>99 && KWhconsumidos<300)
          preço = (99*1.35) + ((KWhconsumidos-99)*1.55);
        else if (KWhconsumidos>=300 && KWhconsumidos<=574)
          preço = ((99*1.35) + (200*1.55) + ((KWhconsumidos-299)*1.75) ) + (((99*1.35) + (200*1.55) + ((KWhconsumidos-299)*1.75) )*0.1);
        else 
          preço = ((99*1.35) + (200*1.55) + (275*1.75) + ((KWhconsumidos-574)*2.15) ) + (((99*1.35) + (200*1.55) + (275*1.75) + ((KWhconsumidos-574)*2.15) )*0.1);
        
        if (preço<35)
          preço = 35;

          
        System.out.printf("O valor gasto foi de %.2f reais", preço);

    }
    
}
