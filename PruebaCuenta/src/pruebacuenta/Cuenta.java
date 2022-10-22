package pruebacuenta;
public class Cuenta {
    protected float Saldo;
    protected int nConsign=0;
    protected int nRetiros=0;
    protected float tAnual;
    protected float comMensual=0;
    
    public Cuenta(float Saldo, float tAnual){
        this.Saldo=Saldo;
        this.tAnual=tAnual;
    }
    public void Consignar(float Cant){
        Saldo =Saldo+Cant;
        nConsign=nConsign+1;
    }
    public void Retirar(float Cant){
        float nSaldo = Saldo-Cant;
        if (nSaldo >=0){
            Saldo -=Cant;
            nRetiros=nRetiros+1;
        }
        else{
            System.out.println("La cantidad a retirar excede su saldo actual");
        }
    }
    public void CalcInteres(){
        float tMensual=tAnual/12;
        float intMensual=Saldo*tMensual;
        Saldo+=intMensual;
    }
    public void ExtMensual(){
        Saldo-=comMensual;
        CalcInteres();
    }
}
