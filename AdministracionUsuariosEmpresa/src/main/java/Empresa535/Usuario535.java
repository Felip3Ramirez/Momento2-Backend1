package Empresa535;

import java.util.Scanner;

public class Usuario535 {
    Scanner sc = new Scanner(System.in);
    private String nombre;
    private String email;
    private String rol;
    private int edad;

    public Usuario535(Scanner sc, String nombre, String email, String rol, int edad) {
        this.sc = sc;
        this.nombre = nombre;
        this.email = email;
        this.rol = rol;
        this.edad = edad;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String mostrarDetalles(){
        return "Informacion del : "+rol+" : "+nombre+" con correo : "+email;
    }
    public String detallesEmpleadoRegular(){
        return "Solo tiene permiso para ver sus datos y hacer tareas básicas";
    }
    public String detallesSupervisor(){
        return "Puede ver detalles de todos los empleados y supervisar su trabajo.";
    }
    public String detallesAdministrador(){
         return "Puede gestionar todos los usuarios (crear, eliminar, modificar), además de ver la información completa de cualquier usuario";
    }
}
