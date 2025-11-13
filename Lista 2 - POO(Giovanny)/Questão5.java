//Versão Scanner

import java.util.Scanner;

public class Questão5 {
    public static double Fahrenheit(double celsius){
    double fahrenheit = 1.8*celsius + 32;
    return fahrenheit;
    }

    public static double celsius(double fahrenheit){
        double celsius = (fahrenheit - 32)/1.8;
        return celsius;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os graus: ");
        double graus = scan.nextDouble();

        System.out.println("Para qual deseja converter? ");
        String conversão = scan.next();

        if (conversão.equals("F")){
            System.out.println(Fahrenheit(graus));
        } else if (conversão.equals( "C")){
            System.out.println(celsius(graus));
        } else{
            System.out.println("Ínválido.");
        }
    }
}

//Versão IO

public class Questão5IO {

    public static double Fahrenheit(double celsius){
        double fahrenheit = 1.8*celsius + 32;
        return fahrenheit;
    }

    public static double celsius(double fahrenheit){
        double celsius = (fahrenheit - 32)/1.8;
        return celsius;
    }

    public static void main(String[] args){
        String grausStr = IO.readln("Digite os graus: ");
        double graus = Double.parseDouble(grausStr);

        String conversão = IO.readln("Para qual deseja converter? ");

        if (conversão.equals("F")){
            IO.println(Fahrenheit(graus));
        } else if (conversão.equals( "C")){
            IO.println(celsius(graus));
        } else{
            IO.println("Ínválido.");
        }
    }
}

//
