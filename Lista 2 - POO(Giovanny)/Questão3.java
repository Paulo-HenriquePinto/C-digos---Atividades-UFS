//Versão Scanner

import java.util.Scanner;

public class Questão3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu número: ");
        int número = scan.nextInt();

        if (número == 0){
            System.out.println("Nulo");
        } else if(número > 0){
            String númeroString = Integer.toString(número);
            System.out.println("Positivo " + númeroString);
        } else{
            String númeroString = Integer.toString(número * -1);
            System.out.println("Negativo " + númeroString);
        }
    }
}

//Versão IO

import java.util.Scanner;

public class Questão3IO {
        public static void main(String[] args){
        String num = IO.readln("Digite seu número:");
        int número = Integer.parseInt(num);


        if (número == 0){
            IO.println("Nulo");
        } else if(número > 0){
            IO.println("Positivo " + número);
        } else{
            IO.println("Negativo " + número*-1);
        }
    }
    
}
