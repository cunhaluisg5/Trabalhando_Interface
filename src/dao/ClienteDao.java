/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import jdbc.ConectionFactory;
import model.Clientes;

/**
 *
 * @author Luis
 */
public class ClienteDao {
    private Connection conecta;

    public ClienteDao() {
        conecta = new ConectionFactory().Conecta();
    }
    
    public void cadastrarCliente(Clientes obj){
        try{
            String sql = "insert into cliente(cli_nome, cli_email, cli_telefone, cli_celular, cli_rua, cli_numero, cli_complemento, cli_bairro, cli_cep, cli_estado, cli_cidade) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getEmail());
            stmt.setString(3, obj.getTelefone());
            stmt.setString(4, obj.getCelular());
            stmt.setString(5, obj.getRua());
            stmt.setInt(6, obj.getNumero());
            stmt.setString(7, obj.getComplemento());
            stmt.setString(8, obj.getBairro());
            stmt.setString(9, obj.getCep());
            stmt.setString(10, obj.getEstado());
            stmt.setString(11, obj.getCidade());
            
            stmt.execute();
            
            stmt.close();
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
}
