package pruebacuenta;
public class CuentaAhorros extends Cuenta{
    private boolean Activa;
    public CuentaAhorros(float Saldo,float Tasa){
        super(Saldo,Tasa);
        if(Saldo<10000){
            Activa=false;
        }else{
            Activa=true;
        }
    }
    public void retirar(float Cant){
        if(Activa){
            super.Retirar(Cant);
        }
    }
    public void consignar(float Cant){
        if (Activa){
            super.Consignar(Cant);
        }
    }
    public void extMensual(){
        if (nRetiros>4){
            comMensual+=(nRetiros-4)*1000;
        }
        super.ExtMensual();
        if (Saldo<10000){
            Activa=false;
        }
    }
    public void Imprimir(){
        System.out.println(("Saldo =$ "+Saldo));
        System.out.println("Comisión mensual =$ "+comMensual);
        System.out.println("Numero de transacciones = "+(nConsign+nRetiros));
        System.out.println();
    }
    
}
