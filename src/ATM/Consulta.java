package ATM;

public class Consulta extends Operacion {
   public void Movimientos () {
       System.out.println ("---------------------------------");
       System.out.println ("Su saldo es de: " + getSaldo());
       System.out.println ("---------------------------------");
   }
}
