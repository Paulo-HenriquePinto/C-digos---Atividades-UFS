public class Interruptores_paralelos
{
   boolean Int1ligado = false;
   boolean Int2ligado = false;
   
public void Interruptor1(boolean estado1){
    estado1 = Int1ligado;
}

public void Interruptor2(boolean estado2){
    estado2 = Int2ligado;
}


void ligar_desligarint1(){
  if (Int1ligado){
      Int1ligado = false;
  } else {
      Int1ligado = true;
  }

}

void ligar_desligarint2(){
    if (Int2ligado){
        Int2ligado = false;
    } else{
        Int2ligado = true;
    }
}

String Three_Way(){
    if (Int1ligado == Int2ligado){
        return "Lâmpada Acesa";
    } else{
        return "Lâmpada Apagada";
    }
}
}

//Programa realizado no BlueJ usando JAVA
