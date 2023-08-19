class Asalariado extends Empleado {
    private double salarioBase;

    public Asalariado(String nombre, double salarioBase) {
        super(nombre);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}


