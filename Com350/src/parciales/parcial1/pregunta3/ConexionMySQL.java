package parciales.parcial1.pregunta3;

import parciales.parcial1.pregunta3.IConexion;
import parciales.parcial1.pregunta3.Usuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ConexionMySQL implements IConexion {

    String bd;
    String usuario;
    String password;

    public ConexionMySQL(String bd, String usuario, String password) {
        this.bd = bd;
        this.usuario = usuario;
        this.password = password;
        try {
            Class.forName("com.mysql.jdbc.driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Connection conectar() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/" + bd, usuario, password);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean ejecutarSQL(String sql) {
        try {
            Connection con = conectar();
            PreparedStatement consulta = con.prepareStatement(sql);
            consulta.executeUpdate();
            return true;
   
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        
          return false;
        }
       
        
    }

}
