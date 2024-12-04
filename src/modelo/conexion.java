package modelo;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
     Connection conectar=null;
    public Connection conectar(){
    
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/app_ingreso_usuario","root","@@1986ricardo");
            //JOptionPane.showMessageDialog(null,"Conexión Exitosa", "Conexión", JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Conexión Fallida"+ e, "Conexión", JOptionPane.ERROR_MESSAGE);
        }
        return conectar;
    }
    public void cerrarConexion(){
        try{
            if(conectar!=null && !conectar.isClosed()){
            conectar.close();
           // JOptionPane.showMessageDialog(null, "Conexión cerrada exitosamente");
            }
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo cerrar la conexión");
        } 
    }
}
