package Empresa535;

import java.util.Scanner;

public class Main535 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = true;
        int opc = 0;

        while (salir){
        System.out.println("ADMINISTRACION DE USUARIOS \n" +
            "1.Informacion EmpleadoRegular\n" +
            "2.Informacion Supervisor\n" +
            "3.Informacion Administrador\n" +
            "4.Salir"           );
         opc=sc.nextInt();
         switch (opc){
             case 1:
                 Usuario535 empleado = new Usuario535("juan torres","Empleado Regular","torresjuan@correo.com");
                 System.out.println(empleado.mostrarDetalles());
                 System.out.println(empleado.detallesEmpleadoRegular());
                 System.out.println("------------------");
            break;
             case 2:
                 Usuario535 supervisor = new Usuario535("Maria Perez","Supervisor","perezmaria@correo.com");
                 System.out.println(supervisor.mostrarDetalles());
                 System.out.println(supervisor.detallesSupervisor());
                 System.out.println("------------------");
            break;
             case 3:
                 Usuario535 administrador = new Usuario535("Carlos Muñoz","Administrador","muñozcarlos@correo.com");
                 System.out.println(administrador.mostrarDetalles());
                 System.out.println(administrador.detallesAdministrador());
                 System.out.println("------------------");

            break;
             case 4:
            salir=false;
            System.out.println("Gracias por utilizar este programa");
            break;
          default:
            System.out.println("Opcion invalida");
            break;
         }
        }
    }
}
