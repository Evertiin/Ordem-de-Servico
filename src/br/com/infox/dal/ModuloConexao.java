/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;


/**
 *

 */
public class ModuloConexao {
    //método responsavel a conexão com o banco
    public static Connection conector(){
        Connection conexao = null;
        // a linha abaixo chama o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenar informações referente ao banco
        String url = "jdbc:mysql://localhost:3307/dbinfox";
        String user = "root";
        String password = "";
        // Estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
           
            //System.out.println(e);
            return null;
        }
    }

    public static Connection conectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
