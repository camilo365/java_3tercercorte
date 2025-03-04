public class Usuario {
    private String nombreUsuario;
    private String password;
    private String rol;
    
    public Usuario(String nombreUsuario,String password,String rol){
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.rol = rol;
    }

    public String getNombreUsuario(){
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getRol(){
        return rol;
    }

    public void setRol(String rol){
        this.rol = rol;
    }

    public boolean VerificarUsuario(String nombreUsuario, String password) {
        return this.nombreUsuario.equals(nombreUsuario) && this.password.equals(password);
    }
    @Override
    public String toString() {
        return "Producto [Usuario = " + nombreUsuario + ", Password = " + password + ", Rol = " + rol +  "]";

    }


}
    



