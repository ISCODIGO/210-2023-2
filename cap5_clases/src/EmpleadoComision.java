public class EmpleadoComision extends Empleado {
    private double porcentajeComision;
    private double ventasTotales;

    public EmpleadoComision(String nombre, double salario, double porcentajeComision) {
        super(nombre, salario);
        this.porcentajeComision = porcentajeComision;
        this.ventasTotales = 0;
    }

    public void vender(double venta) {
        this.ventasTotales += venta;
    }

    public void reiniciarVentas() {
        this.ventasTotales = 0;
    }

    @Override
    public double getSalario() {
        double comision = this.ventasTotales * this.porcentajeComision / 100;
        return super.getSalario() + comision;
    }
}
