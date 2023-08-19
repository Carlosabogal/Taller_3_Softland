public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = {
                new Asalariado("Juan", 3000),
                new PorHoras("Maria", 15, 40)
        };

        for (Empleado empleado : empleados) {
            System.out.println(empleado.getClass().getSimpleName() + " - " +
                    empleado.calcularSalario() + " dólares");
        }
    }
}