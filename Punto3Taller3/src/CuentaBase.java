public abstract class CuentaBase implements CuentaBancaria {
    protected double saldo;

    public CuentaBase(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso: +" + cantidad);
        } else {
            System.out.println("Error: cantidad inválida para depósito");
        }
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso: -" + cantidad);
        } else {
            System.out.println("Error: fondos insuficientes o cantidad inválida para retiro");
        }
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}