package Atividade3;
import java.util.Scanner;

public class questão1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de livros: ");
        int quantidade_de_livros = scan.nextInt();

        System.out.println("Digite a quantidade de alunos: ");
        int quantidade_de_alunos = scan.nextInt();

        int método_MEC = quantidade_de_alunos/quantidade_de_livros;
      if(quantidade_de_livros>0 && quantidade_de_alunos>0){
        if ( método_MEC>=0 && método_MEC<=8)
          System.out.println("Conceito A");
        else if (método_MEC>=9 && método_MEC<=12)
          System.out.println("Conceito B");
        else if (método_MEC>=13 && método_MEC<=18)
          System.out.println("Conceito C");
        else if (método_MEC>18)
          System.out.println("Conceito D");}
      else{
        System.out.println("Alguma informação está incoerente!");
      }          

    }
    
}
