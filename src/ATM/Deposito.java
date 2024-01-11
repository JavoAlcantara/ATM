package ATM;

public class Deposito extends Operacion {
    public void Movimientos () {
        System.out.println ("Cuanto Desea Depositar: ");
        Deposito ();
        transaccion = getSaldo () + deposito;
        setSaldo(transaccion);
        System.out.println ("---------------------------------");
        System.out.println ("Transacción Exitosa");
        System.out.println ("Su saldo Actuales de: " + getSaldo());
        System.out.println ("---------------------------------");
    }
}
