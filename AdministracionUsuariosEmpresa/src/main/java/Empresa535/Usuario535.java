package Empresa535;

import java.util.Scanner;

public class Usuario535 {
    Scanner sc = new Scanner(System.in);
    String nombre,email,rol;

    public Usuario535(String nombre, String rol, String email) {
        this.nombre = nombre;
        this.rol = rol;
        this.email = email;

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
