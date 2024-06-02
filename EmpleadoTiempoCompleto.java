public class EmpleadoTiempoCompleto extends Empleado {

    private double salarioAnual;

    public EmpleadoTiempoCompleto(String nombre, String numeroIdentifiacion, double salarioAnual) {
        super(nombre, numeroIdentifiacion);
        this.salarioAnual = salarioAnual;
    }

    @Override
    public double calcularSalario() {
        return salarioAnual / 12; // Salario mensual
    }

}
