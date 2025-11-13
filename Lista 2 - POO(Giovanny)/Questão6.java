//Versão Scanner

import java.util.Scanner;

public class Questão6 {
       public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidade de garrafas: ");
        int garrafas = scan.nextInt();

        System.out.println("Valor de cada garrafa: ");
        double valor = scan.nextDouble();

        double valor_pago = ((garrafas/3)*2 + (garrafas%3))*valor;
        System.out.println("Valor pago: " + valor_pago);
        
    } 
}

//Versão IO

public class Questão6IO {
    public static void main(String[] args){
        String númerodegarrafasStr = IO.readln("Quantidade de garrafas: ");
        int garrafas = Integer.parseInt(númerodegarrafasStr);

        String valorStr = IO.readln("Valor de cada garrafa: ");
        double valor = Double.parseDouble(valorStr);

        double valor_pago = ((garrafas/3)*2 + (garrafas%3))*valor;
        IO.println("Valor pago: " + valor_pago);
        
    }
}
