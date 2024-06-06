/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pet.mavenproject1.modelo.conexao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConexaoMySQL {
     
 
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/gerenciamento";
    private static final String USER = "root";
    private static final String PASSWORD = "an@2208";
    private static Connection connection;
    
    public ConexaoMySQL() {}
    
    public static Connection obterConexao() throws SQLException {
         if (connection == null) {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
         }  
          return connection;
    }
    
    public static void fecharConexao() throws SQLException {
           if (connection != null) {
               connection.close();
           }
    }
    
    public static void main(String[] args) throws SQLException {
           System.out.println("conexão concluida " + obterConexao());
    }

}
