import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Ingreso de calificaciones");
        frame.setContentPane(new menuinsercion().form1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.pack();
        frame.setVisible(true);
    }
}