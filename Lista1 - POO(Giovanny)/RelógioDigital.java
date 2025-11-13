 public class RelógioDigital
{
 
 int hora = 23;
 int min = 59;
 int seg = 59;
 int HoraMarcada = 0;
 int MinutoMarcado = 0;
 int SegundoMarcado = 0;
 
 
 
public void AjusteDeHoras(int NovaHora, int NovoMinuto, int NovoSegundo){

     if (NovaHora>=24 || NovaHora<0 || NovoMinuto >= 60 || NovoMinuto<0 || NovoSegundo>=60 || NovoSegundo<0 ){
         System.out.printf("Horário inválido!");
      } else{
        hora = NovaHora;
        min = NovoMinuto;
        seg = NovoSegundo;          
      }
    }
      


public void Alarme(int HoradoAlarme, int MinutodoAlarme, int SegundodoAlarme){
  HoraMarcada = HoradoAlarme;
  MinutoMarcado = MinutodoAlarme;
  SegundoMarcado = SegundodoAlarme;
}
    
 public void Contagem(){
      if (min >= 59 && seg>=59){
        min = 0;
        seg = 0;
        hora++;  
    } else if (seg >= 59){
        min++;
        seg = 0;
    } else {
        seg++;
    }
    if (hora>=24){
      hora = hora % 24;
      min = 0;
      seg = 0;
      }
 }
  

  
 public String Mostrarhora(){
     if(hora == HoraMarcada && min == MinutoMarcado && seg == SegundoMarcado){
         return hora+":"+min+":"+seg+" --> Alarme!";
     }
    return hora+":"+min+":"+seg;
 }

}

//Programa realizado no BlueJ utilizando JAVA
