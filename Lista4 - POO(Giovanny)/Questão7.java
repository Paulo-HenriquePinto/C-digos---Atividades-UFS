package Atividade3;
import java.util.Scanner;

public class questão7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o peso do pão: ");
        double peso_do_pão = scan.nextDouble();

        System.out.println("Digite a quantidade de litros de leite: ");
        double litros_de_leite = scan.nextDouble();

        System.out.println("Digite a quantidade de garrafas de vinho: ");
        int garrafas_de_vinho  = scan.nextInt();

        double preço_do_pão;  
        double preço_do_leite;
        double preço_do_vinho;
        double desconto_do_pão;
        double desconto_do_leite;
        double desconto_do_vinho;


          if (peso_do_pão<1){
            preço_do_pão = peso_do_pão*4.5;
            desconto_do_pão = 0;}
          else{
            preço_do_pão = (peso_do_pão*4.5)*0.95;
            desconto_do_pão = preço_do_pão*0.05;}
        
       
         if(litros_de_leite>2){
           if(litros_de_leite%3==0){
            preço_do_leite = (litros_de_leite*5.30) - (((litros_de_leite/3) * 5.30)*0.1);
            desconto_do_leite = ((litros_de_leite/3)*5.30)*0.1;}
           else{ 
            preço_do_leite = ((int)(litros_de_leite/3)*2)*5.30 + (litros_de_leite%3)*5.30 + ((((int)litros_de_leite/3))*5.30)*0.9;
            int litros_com_desconto = (int) (litros_de_leite/3);
            desconto_do_leite = litros_com_desconto*5.30*0.1;}
        }else{
           preço_do_leite = litros_de_leite*5.30;
           desconto_do_leite = 0;}
       

       
         if(garrafas_de_vinho>2){
          if(garrafas_de_vinho%3==0){
            preço_do_vinho = (garrafas_de_vinho*25) - ((garrafas_de_vinho/3)*25);
            desconto_do_vinho = (garrafas_de_vinho/3)*25;
          }else{
            preço_do_vinho = (((garrafas_de_vinho/3)*2) + (garrafas_de_vinho%3))*25;
            desconto_do_vinho = (garrafas_de_vinho/3)*25;
          }
         }else{ 
           preço_do_vinho = garrafas_de_vinho*25;
           desconto_do_vinho = 0;}

        double valor_total = (preço_do_vinho+preço_do_leite+preço_do_pão);
        
        if(peso_do_pão>0)
          System.out.printf("Pão ------------- R$ %.2f\n",preço_do_pão);
        
        if(litros_de_leite>0)
          System.out.printf("Leite-------------- R$ %.2f\n",preço_do_leite);

        if(garrafas_de_vinho>0)
          System.out.printf("Vinho-----------------R$ %.2f\n", preço_do_vinho);
        
        if(desconto_do_pão>0)
          System.out.printf("Desconto do pão--------------R$ %.2f\n",desconto_do_pão);

        if(desconto_do_leite>0)
          System.out.printf("Desconto do leite----------------R$ %.2f\n", desconto_do_leite);

        if(desconto_do_vinho>0)
          System.out.printf("Desconto do vinho------------------ R$ %.2f\n",desconto_do_vinho);

        if(valor_total>0)
          System.out.printf("Valor total----------------------- R$ %.2f\n",valor_total);
        
        }
    }
