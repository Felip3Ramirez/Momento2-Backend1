package Empresa535;

import java.util.Scanner;

public class Empleado535 extends Usuario535 {

    private int idEmpleado;

    public Empleado535(String nombre, String email, String rol, int edad, int idEmpleado) {
        super(nombre, email, rol, edad);
        this.idEmpleado = idEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public String detallesEmpleadoRegular(){
        return "Solo tiene permiso para ver sus datos y hacer tareas básicas";
    }

}
