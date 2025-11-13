package Atividade3;
import java.util.Scanner;

public class questão3 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = scan.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int c = scan.nextInt();

        int média = (a+b+c)/3;
        int contador = 0;

        if (a>média && b>média && c>média)
           contador = 3;
        else if (a>média && b<=média && c<=média)
           contador = 1;
        else if (a<=média && b>média && c<=média)
           contador = 1;
        else if (a<=média && b<=média && c>média)
           contador = 1;
        else if (a<=média && b<=média && c<=média)
           contador = 0;
        else
          contador = 2;

    System.out.println("Contador de valores maiores que a média: "+contador);
    }
    
}
