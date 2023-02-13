/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
//Tocken
//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


package org.uv.programa01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabriel
 */
public class Programa01 {

    public static void main(String[] args) {
        Connection con=null;
        Statement st=null;
        try {
            String sql="insert into ejemplo (clave, nombre, direccion, telefono) values "
                    + " ('01','Gabriel','av 1','555')";
            String url="jdbc:postgresql://localhost:7000/ejemplo";
            String pwd="postgres";
            String user="postgres";
            con=DriverManager.getConnection(url,user,pwd);
            Logger.getLogger(Programa01.class.getName()).log(Level.INFO, "Se Conecto...");
            st=con.createStatement();
            st.execute(sql);
            Logger.getLogger(Programa01.class.getName()).log(Level.INFO, "Se Guardo...");
                    
        
        } catch (SQLException ex) {
            Logger.getLogger(Programa01.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
             if (st!=null)
                    st.close();
            } catch (SQLException ex) {
                Logger.getLogger(Programa01.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
             if (con!=null)
                    con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Programa01.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
