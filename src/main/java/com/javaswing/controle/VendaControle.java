/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.controle;

import com.javaswing.modelo.Venda;
import com.javaswing.service.VendaService;
import java.sql.SQLException;

/**
 *
 * @author LAB 03
 */
public class VendaControle {
    public boolean vender (Venda venda) throws SQLException {
        VendaService vendaService = new VendaService();     
        return vendaService.vender(venda);
   
    }
        
}
