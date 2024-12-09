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
                 Empleado535 empleado = new Empleado535("juan torres","torresjuan@correo.com","Empleado Regular",27,30);
                 System.out.println(empleado.mostrarDetalles());
                 System.out.println(empleado.detallesEmpleadoRegular());
                 System.out.println("------------------");
            break;
             case 2:
                 Supervisor535 supervisor = new Supervisor535("Maria Perez","perezmaria@correo.com","Supervisor",20,10);
                 System.out.println(supervisor.mostrarDetalles());
                 System.out.println(supervisor.detallesSupervisor());
                 System.out.println("------------------");
            break;
             case 3:
                 Administrador535 administrador = new Administrador535("Carlos Muñoz","muñozcarlos@correo.com","Administrador",30,20);
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
