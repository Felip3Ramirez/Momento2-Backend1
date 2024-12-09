package Empresa535;



public class Usuario535 {
    private String nombre;
    private String email;
    private String rol;
    private int edad;

    public Usuario535(String nombre, String email, String rol, int edad) {
        this.nombre = nombre;
        this.email = email;
        this.rol = rol;
        this.edad = edad;
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
        return "Informacion del : "+rol+" : "+nombre+" con correo : "+email+" edad "+edad;
    }

}
