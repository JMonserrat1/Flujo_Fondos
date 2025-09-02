/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.flujos.DAOs;

import com.flujos.Entidades.ClienteProveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ian
 */
public class DAOClienteProveedor {
    public void ingresarClienteProveedor (ClienteProveedor cliente, Connection conn) throws SQLException{
        String sqlInsert = "INSERT INTO cliente_proveedores (nom_razon_social, dni_cuit, telefono, email, "
                + "tipo_cliente_proveedor) VALUES (?, ?, ?, ?, ?) ";
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, cliente.getNomRazonSocial());
            ps.setInt(2, cliente.getDniCuit());
            ps.setString(3, cliente.getTelefono());
            ps.setString(4, cliente.getEmail());
            ps.setString(5, cliente.getTipoClienteProveedor());
            ps.executeUpdate();
        } finally {
            if (ps !=null){
                ps.close();
                
            }
        }
    }
    
}
