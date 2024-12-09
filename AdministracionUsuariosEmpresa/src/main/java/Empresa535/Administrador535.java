package Empresa535;

import java.util.Scanner;

public class Administrador535 extends Usuario535 {
    private int idAdministrador;

    public Administrador535(String nombre, String email, String rol, int edad, int idAdministrador) {
        super(nombre, email, rol, edad);
        this.idAdministrador = idAdministrador;

    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }
    public String detallesAdministrador(){
        return "Puede gestionar todos los usuarios (crear, eliminar, modificar), además de ver la información completa de cualquier usuario";
    }
}
