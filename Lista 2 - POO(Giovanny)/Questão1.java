//Versão Scanner

import java.util.Scanner;


public class Questão1 {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("Digite seu número: ");
      int num = scan.nextInt();
      
    if(num%2 == 0){
        System.out.println("É par!");
   }  else{
        System.out.println("É ímpar");
       }
    }
}

//Versão IO

public class Questão1IO {
    public static void main(String[] args){
      String num = IO.readln("Digite seu número: ");
      int número = Integer.parseInt(num);
      
    if(número%2 == 0){
        IO.println("É par!");
   }  else{
        IO.println("É ímpar!");
       }
    }
}
