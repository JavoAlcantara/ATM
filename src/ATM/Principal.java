package ATM;

public class Principal {
    public static void main (String[] args) {
        Operacion op = new Consulta ();
        op.setSaldo (5000);
        op.MenuOperaciones ();
    }
}
