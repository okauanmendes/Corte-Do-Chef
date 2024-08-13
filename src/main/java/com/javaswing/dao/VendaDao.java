/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.dao;

import com.javaswing.modelo.Venda;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LAB 03
 */
public class VendaDao {
    public boolean vender(Venda venda) throws SQLException{
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        
        String query = "INSERT INTO Venda (Mercadoria,Kilo,Quantidade,preco) values("+
               "'" + venda.getMercadoria() + "'," +
                     venda.getKilo()   + "," +
                     venda.getQuantidade()  + "," +
                     venda.getPreco() + ")";
        try{
                Statement statement = connection.createStatement();
                statement.execute(query);
                conexao.desconectar(connection);
                return true;
        }catch (SQLException ex) {
            System.out.print(ex.initCause(ex));
            return false;
        }    
        
    }
     
}
