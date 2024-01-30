import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuinsercion {
    private JButton conectarALaBaseButton;
    public JPanel form1;
    private JLabel mensajetxt;
    private JButton insertar;
    private JTextField nombretf;
    private JTextField cedulatf;
    private JTextField califtf;
    private JTextField calif2tf;
    private JLabel nombreTF;
    private JButton borrarCamposButton;

    public menuinsercion() {
        conectarALaBaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //conexion a la base de datos
                conexion_bd miConexion=new conexion_bd();
                miConexion.conexionLocal("jdbc:mysql://localhost:3306/mysql","root","1726405390");
                mensajetxt.setText(miConexion.getMensaje());
            }
        });
        borrarCamposButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //sirve cuando el usuario ingresa datos y si desea borrar datos
                //aplasta el boton borra campos y se borra todo
                nombretf.setText("");
                cedulatf.setText("");
                califtf.setText("");
                calif2tf.setText("");
            }
        });

        insertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertarDatos insertardatos= new insertarDatos();
                //insertardatos.ingresoDatos("mariita", "12345",6,9);
                insertardatos.ingresoDatos(nombretf.getText(), cedulatf.getText(), Integer.parseInt(califtf.getText()), Integer.parseInt(calif2tf.getText()));

            }
        });
    }
}
