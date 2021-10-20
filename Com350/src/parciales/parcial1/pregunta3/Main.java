/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciales.parcial1.pregunta3;

/**
 *
 * @author martin1
 */
public class Main {
    public static void main(String[] args) {
        IConexion conmysql=new  ConexionMySQL("bd_examen", "root", "");
        IConexion conposgre=new ConexionPostgreSQL("bd_examen", "root", "");
        Usuarios user = new Usuarios("martin", "123");
        UsuariosDB userDB = new UsuariosDB(user,conmysql);
        userDB.guardarDB();
        
        if(userDB.consultar("martin")){
            System.out.println("autenticado");
        }else
            System.out.println("error usuario o contrasena");
    }
    
}
