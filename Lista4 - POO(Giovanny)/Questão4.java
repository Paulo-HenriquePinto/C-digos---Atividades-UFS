package Atividade3;
import java.util.Scanner;

public class questão4 {
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double a = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double b = scan.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        double c = scan.nextDouble();

        double média = (a+b+c)/3;

        double diferença1 = a-média;
        double diferença2 = b-média;
        double diferença3 = c-média;

        if(diferença1<0)
          diferença1 = diferença1*(-1);
        if(diferença2<0)
          diferença2 = diferença2*(-1);
        if(diferença3<0)
         diferença3 = diferença3*(-1);

        
        if(diferença1<diferença2 && diferença1<diferença3)
          System.out.println(a);
        else if (diferença2<diferença1 && diferença2<diferença3)
          System.out.println(b);
        else if (diferença3<diferença1 && diferença3<diferença2) 
          System.out.println(c);
        else if (diferença1==diferença2 || diferença1==diferença3)
         System.out.println(a);
        else if (diferença3==diferença2)
         System.out.println(c);
}
}
