package Atividade3;

public class questão5 {

        

    
   public static void main(String[] args){
    String diastr = IO.readln("Digite o dia: ");
    String mêsstr = IO.readln("Digite o mês: ");
    String anostr = IO.readln("Digite o ano: ");

    int dia = Integer.parseInt(diastr);
    int mês = Integer.parseInt(mêsstr);
    int ano = Integer.parseInt(anostr);


    
    contagem_de_dias(dia,mês,ano, -1);
   
    

}
   


       
     public static String contagem_de_dias(int dia,int mês,int ano, int contador){
        int dias_no_mês = 0;
    if ((ano%100==0 && ano%400==0) || (ano%4==0 && ano%100!=0)){
        if (mês==2){
            dias_no_mês = 29;
        }
        else if(mês==1 || mês==3 || mês==5 || mês==7 || mês==8 || mês==10 || mês==12){
            dias_no_mês = 31;
        }else if( mês==4 || mês==6 || mês==9 || mês==11){
            dias_no_mês = 30;
        }
    } else{
        if (mês==2){
            dias_no_mês = 28;
        }
        else if(mês==1 || mês==3 || mês==5 || mês==7 || mês==8 || mês==10 || mês==12){
            dias_no_mês = 31;
        }else if (mês==4 || mês==6 || mês==9 || mês==11){
            dias_no_mês = 30;       
    }}

      if(dia== 24 && mês== 6){
         System.out.println("Faltam "+(contador+1)+" dias para o São João!");
         return " ";}
      else{
        if (dia<dias_no_mês){
          dia++;
          contador++;
        }else{
          dia = 1;
          mês++;
          contador++;}
        if (mês>12){
         ano++;
         mês = 1;
         dia = 1;
         contador++;}

      }
    
      return contagem_de_dias(dia, mês, ano, contador);

}
}
