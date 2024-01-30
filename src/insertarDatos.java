import java.sql.*;
public class insertarDatos {
    String nombre;
    String cedula;
    int calif1;
    int calif2;

    //contructor en una clase siempre
    //rec; constructor vacio y todos los elementos

    public insertarDatos(String nombre, String cedula, int calif1, int calif2) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.calif1 = calif1;
        this.calif2 = calif2;
    }
    public insertarDatos() {
    }
    //metod personalizado
    public void insertarDatos(){

    }
    public void ingresoDatos(String nombre, String cedula, int calif1, int calif2){
        //hacer la coneccion
        try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","1726405390")){
            //insertar pero almacenar en una variable
            String sql="INSERT INTO calificaciones(nombre, cedula, calificacion1, calificacion2) values(?,?,?,?)";
            //tratar de insertar los datos dentro de un mismo try
            try(PreparedStatement preparedStatement= connection.prepareStatement(sql)){
                //establecer los valores que se va a insertar
                //preparedStatement.setString(1,"Alberto");
                //preparedStatement.setString(2,"Maria");
                //preparedStatement.setInt(3, 7);
                //preparedStatement.setInt(4,9);
                //empieza desde 1 por que no agarra el id
                preparedStatement.setString(1,nombre);
                preparedStatement.setString(2,cedula);
                preparedStatement.setInt(3, calif1);
                preparedStatement.setInt(4,calif2);
                //indica las filas afectadas
                int filasAfectadas=preparedStatement.executeUpdate();
                //con in if verificar si se hicieron las insercciones
                if(filasAfectadas>0){
                    System.out.println("Insercion exitosa");


                }else{
                    System.out.println("Insercion fallida");
                }
            }catch(Exception exception){

            }



        }catch(SQLException e){
            //probar la conexion de la base de datos
            e.printStackTrace();
        }
    }
}
