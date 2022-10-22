package pruebacuenta;
import java.util.*;
public class PruebaCuenta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese saldo inicial=$");
        
        float SaldoInicialA=input.nextFloat();
        System.out.println("Ingrese tasa de interes= ");
        float tasaA=input.nextFloat();
        CuentaAhorros Cuenta1 = new CuentaAhorros(SaldoInicialA,tasaA);
        System.out.println("Ingresar cantidad a consignat= $");
        
        float cantDepo = input.nextFloat();
        Cuenta1.consignar(cantDepo);
        System.out.println("Ingresar cantidad a retirar= $");
        float cantRet = input.nextFloat();
        Cuenta1.retirar(cantRet);
        Cuenta1.extMensual();
        Cuenta1.Imprimir();
    }
    
}
