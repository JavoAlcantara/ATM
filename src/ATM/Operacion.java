package ATM;

import java.util.Scanner;

public abstract class Operacion {
    protected int retiro, deposito, transaccion;
    private static int saldo;

    Scanner entrada = new Scanner (System.in);

    public void MenuOperaciones () {
        int bandera = 0;
        int seleccion = 0;

        do {
            System.out.println ("Bienvenido al ATM");
            System.out.println (" ");
            System.out.println ("1.Consultar saldo");
            System.out.println ("2. Retiro");
            System.out.println ("3. Deposito");
            System.out.println ("4. Salir");
            seleccion = entrada.nextInt ();

            if (seleccion >= 1 && seleccion <= 3) {
                bandera = 0;
            } else if (seleccion == 4) {
                bandera = 1;
            } else {
                System.out.println ("Por favor, ingrese una opcion valida");
            }

            if (seleccion == 1) {
                Consulta consulta = new Consulta ();
                consulta.Movimientos ();
            }
            if (seleccion == 2) {
                Retiro r = new Retiro ();
                r.Movimientos ();
            }
            if (seleccion == 3) {
                Deposito d = new Deposito ();
                d.Movimientos ();
            }
            if (seleccion == 4) {
                System.out.println ("---------------------------------");
                System.out.println ("Gracias por usar el ATM");
                System.out.println ("---------------------------------");
            }

        } while (bandera == 0);
    }

    public void Retiro () {
        retiro = entrada.nextInt ();
    }

    public void Deposito () {
        deposito = entrada.nextInt ();
    }

    public abstract void Movimientos ();

    public static int getSaldo () {
        return saldo;
    }

    public static void setSaldo (int saldo) {
        Operacion.saldo = saldo;
    }
}
