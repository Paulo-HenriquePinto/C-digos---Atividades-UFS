package Atividade3;
import java.util.Scanner;

public class questão2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de dias: ");
        double quantidade_de_dias = scan.nextDouble();

        System.out.println("Digite a quilometragem: ");
        double quilometragem = scan.nextDouble();

        double cota = 100*quantidade_de_dias; 

        double valor_a_ser_pago;
        if (quilometragem<=cota)
           valor_a_ser_pago = 90*quantidade_de_dias;
        else
           valor_a_ser_pago = (90*quantidade_de_dias) + (12*(quilometragem-cota));
    

    System.out.printf("O valor a ser pago é %.2f", valor_a_ser_pago);

    }
    
}
