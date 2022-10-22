package pruebacuenta;
public class CuentaCorriente extends Cuenta{
    float Sobregiro;
    
    public CuentaCorriente(float Saldo,float Tasa){
        super(Saldo,Tasa);
        Sobregiro=0;
    }
    
    public void retirar(float Cant){
        float Resultado =Saldo-Cant;
        if (Resultado<0){
            Sobregiro=Sobregiro-Resultado;
            Saldo=0;
        }else{
            super.Retirar(Cant);
        }
    }
    
    public void consignar(float Cant){
        float Residuo = Sobregiro-Cant;
        if (Sobregiro>0){
            if (Residuo>0){
               Sobregiro=0;
               Saldo=Residuo;
            }else{
                Sobregiro= -Residuo;
                Saldo=0;
            }
        }else{
            super.Consignar(Cant);
        }
    }
    
    public void extMensual(){
        super.ExtMensual();
    }
    
    public void Imprimir(){
        System.out.println("Su Saldo es= $"+Saldo);
        System.out.println("Cargo mensual= $"+comMensual);
        System.out.println("Numero de transacciones= "+(nConsign+nRetiros));
        System.out.println("Valor de sobregiro= $"+(nConsign+nRetiros));
        System.out.println();
        
        
    }
    
}
