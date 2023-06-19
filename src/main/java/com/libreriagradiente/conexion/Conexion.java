/*
Esta es la conexion a mi base de datos. Esta conexion la utilizo en todos los DAOs
 */
package com.libreriagradiente.conexion;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Oscar
 * 
 * Primero creo las variables con los atributos correspondientes a la base de datos, esto es el url, el usuario y el pass
 */
public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/proyectoportafolio";
    String user="root";
    String pass="";
    
    
    // luego se realiza la conexion utilizando DriverManager
    public Connection Conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
            
        } return con;
    }
}
