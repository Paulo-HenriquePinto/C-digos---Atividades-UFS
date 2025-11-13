public class Contas_Bancárias
{
    // Características das Contas Bancárias
    String CPF;
    double Saldo;
    
     

    
    public Contas_Bancárias(String DigiteCPF, double SeuSaldo){
        CPF = DigiteCPF;
        Saldo = SeuSaldo;
    }
    

    
    void Depósito (float ValordoDepósito){
        Saldo = Saldo + ValordoDepósito;
    }
    
    void Saque (float ValordoSaque){
        Saldo = Saldo - ValordoSaque;
    }
   
    double VerSaldo(){
        return Saldo;
        
    }
    
    
}
