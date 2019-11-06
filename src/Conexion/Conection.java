package Conexion;

import java.sql.*;
import javax.swing.*;

public class Conection
{

        Connection con;
        public Connection conexion()
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/Colegio", "root", "hans43");
            }
            catch (ClassNotFoundException | SQLException e)
            {
                JOptionPane.showMessageDialog(null,"ERROR no se puedo Conectar a la base de datos");
            }
            return con;
        }
}
