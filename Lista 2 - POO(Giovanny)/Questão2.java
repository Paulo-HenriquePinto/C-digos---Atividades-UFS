//Versão Scanner

import java.util.Scanner;


public class Questão2 {
  public static double médiaAritmética(double numero1, double numero2, double numero3){
    double média =  (numero1+numero2+numero3)/3;
    return média;
  }
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite seu primeiro número:");
    double num1 = scan.nextDouble();
    System.out.println("Digite seu segundo número:");
    double num2 = scan.nextDouble();
    System.out.println("Digite seu terceiro número:");
    double num3 = scan.nextDouble();

    double média_final = médiaAritmética(num1,num2,num3);
    System.out.println("Sua média final: "+ média_final);

  }    
}

//Versão IO

public class Questão2IO {
    public static double médiaAritmética(double numero1, double numero2, double numero3){
      double média =  (numero1+numero2+numero3)/3;
      return média;
  }
  public static void main(String[] args){
    String num1 = IO.readln("Digite seu primeiro número: ");
    double número1 = Double.parseDouble(num1);
    String num2 = IO.readln("Digite seu segundo número: ");
    double número2 = Double.parseDouble(num2);
    String num3 = IO.readln("Digite seu terceiro número: ");
    double número3 = Double.parseDouble(num3);
 

    double média_final = médiaAritmética(número1,número2,número3);
    IO.println("Sua média final: "+ média_final);

  }    
}
