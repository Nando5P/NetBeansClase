package tema6;

import java.time.LocalDate;
import java.time.Period;

public class Alumno {
    
    private static String nombreEscuela = "Compañía de María";
    
    //Atributos
    private String nombreCompleto;
    private String dni;
    private LocalDate fechaNacimiento;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, String dni, LocalDate fechaNacimiento) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public static String getNombreEscuela() {
        return nombreEscuela;
    }
    
    //Mayoria de edad
    public boolean esMayorEdad(){
    Period edad = Period.between(fechaNacimiento, LocalDate.now());
    return edad.getYears()>=18;
    }
    
    //Comparar edades
    public boolean esMayorQue(Alumno otroAlumno){
    return this.fechaNacimiento.isBefore(otroAlumno.getFechaNacimiento());
    }
    
    //Comprobar Duplicados
    public boolean esDuplicado(Alumno otroAlumno) {
        return this.nombreCompleto.equals(otroAlumno.getNombreCompleto())
                && this.dni.equals(otroAlumno.getDni())
                && this.fechaNacimiento.equals(otroAlumno.getFechaNacimiento());
    }
    
}
