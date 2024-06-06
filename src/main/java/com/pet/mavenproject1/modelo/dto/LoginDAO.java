/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pet.mavenproject1.modelo.dto;

import com.pet.mavenproject1.modelo.conexao.ConexaoMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Anna
 */
public class LoginDAO {
    
    public void cadastrarUsuario(String nome, String senha) throws SQLException {
        Connection conexao = new ConexaoMySQL().obterConexao();
        String sql = "INSERT INTO usuario (nome, senha) VALUES('"+nome+"','"+senha+"')";
        
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.execute();
        ConexaoMySQL.fecharConexao();
        
    }
    
}
