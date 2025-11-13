public class RaquetePong
{

    double altura = 300;
    boolean Para_cima = true;
    boolean Para_baixo = false;
    double posição_inicial = 150;
    double posição;
    double velocidade = 20;
    
    public void movimento(int tempo){
        
          posição = posição_inicial + velocidade*tempo;
    }
    
    
    public void direção(){
       if(posição >= 300){
         Para_cima = false;
         Para_baixo = true;
         posição = altura - (posição - altura);
        } else if (posição <= 0){
         Para_baixo = false;
         Para_cima = true;
         posição = posição*(-1);
        } else{
            Para_cima = true;
        }
    }
    
    public boolean MovimentoParaCima(){
        return Para_cima;
    }
    

    public boolean MovimentoParaBaixo(){
        return Para_baixo;
    }

    
}

//Programa realizado no BlueJ utilizando JAVA
