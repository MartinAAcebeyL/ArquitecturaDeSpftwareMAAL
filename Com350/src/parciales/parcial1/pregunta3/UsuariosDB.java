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
public class UsuariosDB {
    Usuarios usuario;
    IConexion coneccion;

    public UsuariosDB(Usuarios usuario, IConexion coneccion) {
        this.usuario = usuario;
        this.coneccion = coneccion;
    }
  
    
    public void guardarDB(){
      if ( coneccion.ejecutarSQL("INSERT INTO usuarios (nombre, password) VALUES('"+usuario.getNombre()+"','"+usuario.getPassword()+"')") )
            System.out.println("Se inserto con éxito");
      else
          System.out.println("Ocurrio un Error");
    }
    
    
    public boolean consultar(String nombre){
        if ( coneccion.ejecutarSQL("select nombre, password from usuarios where nombre= "+nombre))// VALUES('"+usuario.getNombre()+"','"+usuario.getPassword()+"')") )
            return true;
        else
         return false;
    }
    
}