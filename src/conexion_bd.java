import java.sql.*;

public class conexion_bd {
    //agregar conexion a la base de datos
    String servidor;
    String usuario;
    String password;
    String mensaje;
    //crear un constructor

    public conexion_bd(String servidor, String usuario, String password) {
        this.servidor = servidor;
        this.usuario = usuario;
        this.password = password;
    }
    //metodo set y get
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    //constrcutor vacio

    public conexion_bd() {
    }
    //metodo
    public void conexionLocal(String servidor, String usuario, String password){
        //objeto de la clase connection con su variable connection=objeto
        try(Connection connection=DriverManager.getConnection(servidor, usuario, password)){
            //si si logra conectar a la base de datos
            if(connection!=null){
                mensaje="conexion correcta";
                System.out.println(mensaje);
            }
        }catch(SQLException e){
            mensaje="conexion fallida";
            System.out.println(mensaje);
            //segunda opcion: e prinStackTrace();
        }

    }
}
