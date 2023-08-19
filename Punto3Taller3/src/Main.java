import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        CuentaAhorro cuentaAhorro = new CuentaAhorro(1000);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(2000, 1000);

        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Seleccione una operación:\n" +
                            "1. Depositar en Cuenta de Ahorro\n" +
                            "2. Retirar de Cuenta de Ahorro\n" +
                            "3. Depositar en Cuenta Corriente\n" +
                            "4. Retirar de Cuenta Corriente\n" +
                            "0. Salir"
            ));

            switch (opcion) {
                case 1:
                    double depositoAhorro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar en Cuenta de Ahorro:"));
                    cuentaAhorro.depositar(depositoAhorro);
                    break;
                case 2:
                    double retiroAhorro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar de Cuenta de Ahorro:"));
                    cuentaAhorro.retirar(retiroAhorro);
                    break;
                case 3:
                    double depositoCorriente = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar en Cuenta Corriente:"));
                    cuentaCorriente.depositar(depositoCorriente);
                    break;
                case 4:
                    double retiroCorriente = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar de Cuenta Corriente:"));
                    cuentaCorriente.retirar(retiroCorriente);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
            }
        } while (opcion != 0);

        JOptionPane.showMessageDialog(null, "Saldo de Cuenta de Ahorro: " + cuentaAhorro.getSaldo());
        JOptionPane.showMessageDialog(null, "Saldo de Cuenta Corriente: " + cuentaCorriente.getSaldo());



    }
}