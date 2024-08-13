/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.dao;

import com.javaswing.modelo.Produto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author LAB 03
 */
public class ProdutoDao {
    public boolean cadastrar(Produto produto) throws SQLException{
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        
        String query = "INSERT INTO Produto (Mercadoria,Quantidade,Preco) values("+
               "'" + produto.getMercadoria() + "'," +
                     produto.getQuantidade() + "," +
                     produto.getPreco() + ")";
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
    
    public  ArrayList<Produto> consultar(Produto produto) throws SQLException {
        ArrayList<Produto> listProduto = new ArrayList<Produto>();
        
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        String query = "SELECT * FROM produto where mercadoria like '" + produto.getMercadoria() + "%'";
        Statement statement = connection.createStatement();
        ResultSet retorno = statement.executeQuery(query);
        
            while (retorno.next()){
                    Produto produtoRetorno = new Produto();
                        produtoRetorno.setCodigo(retorno.getInt("Codigo"));
                        produtoRetorno.setMercadoria(retorno.getString("Mercadoria"));
                        produtoRetorno.setQuantidade(retorno.getInt("Quantidade"));
                        produtoRetorno.setPreco(retorno.getString("Preco"));
                        listProduto.add(produtoRetorno);
            }
            return listProduto;
                                     
            }
    public Produto consultarCodigo (Produto produto) throws SQLException {
        
        Produto produtoRetorno = new Produto ();
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        String query = "SELECT * FROM produto where codigo  = " + produto.getCodigo();
        Statement statement = connection.createStatement();  
        ResultSet retorno =  statement.executeQuery(query);
        
        while (retorno.next()){
              
                produtoRetorno.setCodigo(retorno.getInt("Codigo"));
                produtoRetorno.setMercadoria(retorno.getString("Mercadoria"));
                produtoRetorno.setQuantidade(retorno.getInt("Quantidade"));
                produtoRetorno.setPreco(retorno.getString("Preco"));
        }
        
        return produtoRetorno;
    }
    
    public boolean atualizar(Produto produto) throws SQLException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        boolean retorno = false;
        String query = "UPDATE PRODUTO SET "
                + "Mercadoria = " + "'" +   produto.getMercadoria()  + "'," 
                + "Quantidade =  "  +    produto.getQuantidade()  + ""
                + "Preco =  "  +    produto.getPreco()  +
                
                " where codigo = " + produto.getCodigo();
        
        try {
            Statement statement = connection.createStatement();
            retorno =  statement.execute(query);
        }catch (SQLException ex) {
            retorno = true;
        } finally {
            conexao.desconectar(connection);
        }
        
        return retorno;
    }

}
     
    

    
    
    
    
    

