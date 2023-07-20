package alumno;

/*
Objetivo: contener las calificaciones y otros atributos que contiene un alumno

 */
public class Alumno {
    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        if (calificacion < 0 || calificacion > 100) {
            throw new IllegalArgumentException("Calificacion invalida");
        }
        this.calificacion = calificacion;
    }

    // Definicion de la estructura de los atributos (datos) de cada alumno
    private String cuenta;
    private String nombre;
    private String carrera;
    private int calificacion;
}
