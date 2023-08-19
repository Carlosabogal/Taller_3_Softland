class PorHoras extends Empleado {
    private double salarioPorHora;
    private int horasTrabajadas;

    public PorHoras(String nombre, double salarioPorHora, int horasTrabajadas) {
        super(nombre);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return salarioPorHora * horasTrabajadas;
    }
}