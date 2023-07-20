package alumno;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();
        alumno1.setCarrera("Medicina");
        alumno1.setNombre("Rodrigo Ayala");
        alumno1.setCuenta("20221000011");
        alumno1.setCalificacion(67);

        System.out.println(alumno1.getCalificacion());
    }
}
