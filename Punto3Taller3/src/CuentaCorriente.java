public class CuentaCorriente extends CuentaBase {
    private double limiteCredito;

    public CuentaCorriente(double saldoInicial, double limiteCredito) {
        super(saldoInicial);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad > 0 && (saldo + limiteCredito) >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso (Cuenta Corriente): -" + cantidad);
        } else {
            System.out.println("Error: fondos insuficientes o cantidad inválida para retiro (Cuenta Corriente)");
        }
    }
}