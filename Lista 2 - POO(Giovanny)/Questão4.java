//Versão Scanner

import java.util.Scanner;

public class Questão4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade: "); //Se IO.readln() existir na sua biblioteca, provavelmente retorna String e você precisa converter para outros tipos:
        int idade = scan.nextInt();

        System.out.println("Digite o valor do ingresso: ");
        double preço = scan.nextDouble();

        if(idade <= 18 || idade>=60){
            preço = preço*0.5;
            //String preço_final = Double.toString(preço); 
            System.out.println("valor a ser pago: " + preço);
        } else{
            preço = preço*0.9;
            System.out.println("Valor a ser pago: " + preço);
        }
    }
}

//Versão IO

public class Questão4IO {
    public static void main(String[] args){
        String idadeStr = IO.readln("Digite sua idade: "); //Se IO.readln() existir na sua biblioteca, provavelmente retorna String e você precisa converter para outros tipos:
        int idade = Integer.parseInt(idadeStr);

        String preçoStr = IO.readln("Digite o valor do ingresso: ");
        double preço = Double.parseDouble(preçoStr);

        if(idade <= 18 || idade>=60){
            preço = preço*0.5;
            //String preço_final = Double.toString(preço); 
            IO.println("valor a ser pago: " + preço);
        } else{
            preço = preço*0.9;
            IO.println("Valor a ser pago: " + preço);
        }
    }
}
