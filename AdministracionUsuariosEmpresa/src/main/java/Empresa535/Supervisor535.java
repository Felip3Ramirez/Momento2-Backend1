package Empresa535;

import java.util.Scanner;

public class Supervisor535 extends Usuario535{
    private int idSupervisor;

    public Supervisor535( String nombre, String email, String rol, int edad, int idSupervisor) {
        super(nombre, email, rol, edad);
        this.idSupervisor = idSupervisor;
    }

    public int getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(int idSupervisor) {
        this.idSupervisor = idSupervisor;
    }
    public String detallesSupervisor(){
        return "Puede ver detalles de todos los empleados y supervisar su trabajo.";
    }

}
