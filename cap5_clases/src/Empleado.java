public class Empleado {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < this.salario) {
            throw new IllegalArgumentException("Salario no puede disminuir");
        }
        this.salario = salario;
    }

    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public Empleado(Empleado copia) {
        this(copia.nombre, copia.salario);
    }

    @Override
    public String toString() {
        return String.format("Empleado: %s%nSalario: %.2f",
                this.nombre, this.getSalario());
    }
}
