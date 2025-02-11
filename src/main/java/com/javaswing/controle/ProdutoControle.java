/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.controle;

import com.javaswing.modelo.Produto;
import com.javaswing.service.ProdutoService;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * 
 */
public class ProdutoControle {
   
    public boolean cadastrar (Produto produto) throws SQLException {
        ProdutoService produtoService = new ProdutoService();     
        return produtoService.cadastrar(produto);
   
    }   
     
    public  ArrayList<Produto> consultar (Produto produto) throws SQLException {
        ProdutoService produtoService = new ProdutoService();     
        return produtoService.consultar(produto);
   
    }   
   
     public Produto consultarCodigo(Produto produto) throws SQLException {
        ProdutoService produtoService = new ProdutoService();
        return produtoService.consultarCodigo(produto);
    }   
    
     public boolean atualizar(Produto produto) throws SQLException{
        ProdutoService produtoService = new ProdutoService();
        return produtoService.atualizar(produto);
    }
}
