/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.service;

import com.javaswing.dao.VendaDao;
import com.javaswing.modelo.Venda;
import java.sql.SQLException;

/**
 *
 * @author LAB 03
 */
public class VendaService {
  public boolean vender (Venda venda) throws SQLException{
        VendaDao vendaDao = new VendaDao();
        return vendaDao.vender(venda);
        
    }
    
     
}
