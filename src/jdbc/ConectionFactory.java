/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Luis
 */
public class ConectionFactory {
    public Connection Conecta(){
        try{
            return DriverManager.getConnection("jdbc:mysql://locallhost/academia", "root", "");
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }
}
