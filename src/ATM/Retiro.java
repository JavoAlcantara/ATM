package ATM;

public class Retiro extends Operacion {
    public void Movimientos () {
        System.out.println ("Cuanto Desea Retirar: ");
        Retiro ();
        if (retiro<= getSaldo () ) {
           transaccion = getSaldo () - retiro;
           setSaldo(transaccion);
            System.out.println ("---------------------------------");
           System.out.println ("Transacción Exitosa");
           System.out.println ("Su saldo Actuales de: " + getSaldo());
           System.out.println ("---------------------------------");
        } else {
            System.out.println ("Saldo Insuficiente");
        }
    }

}
