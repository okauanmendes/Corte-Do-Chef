/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.service;

import com.javaswing.dao.ProdutoDao;
import com.javaswing.modelo.Produto;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @Kauan Mendes
 */

public class ProdutoService {   
    
    public boolean cadastrar (Produto produto) throws SQLException{
        ProdutoDao produtoDao = new ProdutoDao();
        return produtoDao.cadastrar(produto);
        
    }    
     
     public ArrayList<Produto> consultar (Produto produto) throws SQLException{
        ProdutoDao produtoDao = new ProdutoDao();
        return produtoDao.consultar(produto);
     }   
     
     public Produto consultarCodigo(Produto produto) throws SQLException{
        ProdutoDao produtoDao = new ProdutoDao();
        return produtoDao.consultarCodigo(produto);
    }
     
     public boolean atualizar(Produto produto) throws SQLException{
        ProdutoDao produtoDao = new ProdutoDao();
        return produtoDao.atualizar(produto);
    }
}
